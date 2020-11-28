package store.sokolov.spring.StockMarket;

import java.util.HashMap;
import java.util.Map;

public class StockMarket implements IStockMarket {
    private Map<String, Stock> stockList = new HashMap<>();

    @Override
    public void addStock(Stock stock) {
        if (stock != null) {
            stockList.put(stock.getTicker().toUpperCase(), stock);
        }
    }

    @Override
    public void removeStock(Stock stock) {
        removeStock(stock.getTicker());
    }

    @Override
    public void removeStock(String ticker) {
        stockList.remove(ticker.toUpperCase());
    }

    @Override
    public Map<String, Stock> getStockList() {
        return stockList;
    }
}
