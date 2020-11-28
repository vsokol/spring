package store.sokolov.spring.StockMarket;

public class Stock {
    private String ticker;
    private String name;
    private float price;
    private float ratioPE;

    public Stock(String ticker, String name, float price, float ratioPE) {
        this.ticker = ticker.toUpperCase();
        this.name = name;
        this.price = price;
        this.ratioPE = ratioPE;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRatioPE() {
        return ratioPE;
    }

    public void setRatioPE(float ratioPE) {
        this.ratioPE = ratioPE;
    }
}
