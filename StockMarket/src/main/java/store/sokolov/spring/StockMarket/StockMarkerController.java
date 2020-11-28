package store.sokolov.spring.StockMarket;

import org.springframework.web.bind.annotation.*;
import store.sokolov.spring.StockMarket.emulator.StockMarketEmulator;
import store.sokolov.spring.StockMarket.exception.StockNotFoundException;

@RestController
@RequestMapping("stock")
public class StockMarkerController {
    private IStockMarket stockMarket = new StockMarketEmulator();

    /**
     * http GET запрос на получение всех акций
     * @return список всех акций
     */
    @GetMapping
    public IStockMarket stockList() {
        return stockMarket;
    }

    /**
     * http GET запрос на получение информации по указанному тикеру акции
     * @param ticker тикер акции
     * @return инфомацию по акции
     */
    @GetMapping("{ticker}")
    public Stock getStock(@PathVariable String ticker) {
        return getStockOnTicker(ticker);
    }

    /**
     * Возвращает акцию по указанному тикеру
     * @param ticker тикер, по которому ищется акция
     * @return акция
     */
    private Stock getStockOnTicker(String ticker) {
        if (stockMarket.getStockList().containsKey(ticker.toUpperCase())) {
            return stockMarket.getStockList().get(ticker.toUpperCase());
        } else {
            throw new StockNotFoundException();
        }
    }

    /**
     * http POST запрос на добавление новой акции
     * @param stock новая акция
     * @return акцию
     */
    @PostMapping
    public Stock newStock(@RequestBody Stock stock) {
        stockMarket.addStock(stock);
        return stock;
    }

    @PutMapping("{ticker}")
    public Stock updateStock(@PathVariable String ticker, @RequestBody Stock stock) {
        Stock modifiedStock = getStockOnTicker(ticker);
        if (!ticker.toUpperCase().equals(stock.getTicker())) {
            stock.setTicker(ticker);
        }
        stockMarket.getStockList().put(stock.getTicker(), stock);
        return stock;
    }

    @DeleteMapping("{ticker}")
    public void deleteStock(@PathVariable String ticker) {
        Stock deletedStock = getStockOnTicker(ticker);
        stockMarket.removeStock(deletedStock);
    }
}
