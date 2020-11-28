package store.sokolov.spring.StockMarket.emulator;

import store.sokolov.spring.StockMarket.Stock;
import store.sokolov.spring.StockMarket.StockMarket;

public class StockMarketEmulator extends StockMarket {
    public StockMarketEmulator() {
        addStock(new Stock("AAPL", "APPLE INC", 116.59F, 35.52F));
        addStock(new Stock("GOOGL", "ALPHABET INC (GOOGLE) CLASS A", 1787.02F, 34.09F));
        addStock(new Stock("AMZN", "AMAZON COM INC", 3195.34F, 93.27F));
    }
}
