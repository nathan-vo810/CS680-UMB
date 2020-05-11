package edu.umb.cs680.hw13;

import java.util.Observable;
import java.util.Observer;

public class TableObserver implements Observer {
    public void update(Observable o, Object arg) {
        if (arg instanceof StockEvent) {
            String ticker = ((StockEvent) arg).getTicker();
            Float quote = ((StockEvent) arg).getQuote();
            System.out.println("Table Observer: Stock Event Change: " + ticker + " " + quote);
        } else if (arg instanceof DJIAEvent) {
            Float quote = ((DJIAEvent) arg).getDjia();
            System.out.println("Table Observer: DJIA Event Change: " + quote);
        }
    }
}
