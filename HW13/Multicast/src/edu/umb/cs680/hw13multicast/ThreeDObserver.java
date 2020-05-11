package edu.umb.cs680.hw13multicast;

public class ThreeDObserver implements DJIAQuoteObserver, StockQuoteObserver {
    @Override
    public void updateDJIA(DJIAEvent e) {
        System.out.println("3D Observer: Update DJIA" + e.getDjia());
    }

    @Override
    public void updateStock(StockEvent e) {
        System.out.println("3D Observer: Update Stock" + e.getTicker() + " " + e.getQuote());
    }
}
