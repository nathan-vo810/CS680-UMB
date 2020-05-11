package edu.umb.cs680.hw13multicast;

public class PiechartObserver implements DJIAQuoteObserver, StockQuoteObserver {
    @Override
    public void updateDJIA(DJIAEvent e) {
        System.out.println("Piechart Observer: Update DJIA" + e.getDjia());
    }

    @Override
    public void updateStock(StockEvent e) {
        System.out.println("Piechart Observer: Update Stock" + e.getTicker() + " " + e.getQuote());
    }
}
