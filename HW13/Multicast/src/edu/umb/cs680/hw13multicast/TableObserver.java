package edu.umb.cs680.hw13multicast;

public class TableObserver implements DJIAQuoteObserver, StockQuoteObserver {
    @Override
    public void updateDJIA(DJIAEvent e) {
        System.out.println("Table Observer: Update DJIA: " + e.getDjia());
    }

    @Override
    public void updateStock(StockEvent e) {
        System.out.println("Table Observer: Update Stock: " + e.getTicker() + " " + e.getQuote());
    }
}
