package store.sokolov.spring.StockMarket;

import java.util.Map;

public interface IStockMarket {
    void addStock(Stock stock);
    void removeStock(Stock stock);
    void removeStock(String ticker);
    Map<String, Stock> getStockList();
}
