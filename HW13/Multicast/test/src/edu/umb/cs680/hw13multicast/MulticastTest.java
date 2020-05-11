package edu.umb.cs680.hw13multicast;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MulticastTest {
    private static StockQuoteObservable stock;
    private static DJIAQuoteObservable djia;
    private static TableObserver table;
    private static PiechartObserver pie;
    private static ThreeDObserver threeD;

    @BeforeAll
    public static void setUp() {
        stock = new StockQuoteObservable();
        djia = new DJIAQuoteObservable();

        table = new TableObserver();
        pie = new PiechartObserver();
        threeD = new ThreeDObserver();

        stock.addObserver(table);
        stock.addObserver(pie);
        stock.addObserver(threeD);

        djia.addObserver(table);
        djia.addObserver(pie);
        djia.addObserver(threeD);
    }

    @Test
    public void changeStockQuote() {
        stock.notifyObservers(new StockEvent("MSFT", 23.60f));
        stock.notifyObservers(new StockEvent("GGL", 54.3f));
        stock.notifyObservers(new StockEvent("MSFT", 25.60f));
        stock.notifyObservers(new StockEvent("GGL", 10.3f));

        int expectedNumObservers = 3;
        int actualNumObservers = stock.countObservers();
        assertEquals(expectedNumObservers, actualNumObservers);
    }

    @Test
    public void changeDJIAQuote() {
        djia.notifyObservers(new DJIAEvent(25.5f));
        djia.notifyObservers(new DJIAEvent(30.5f));
        djia.notifyObservers(new DJIAEvent(10.5f));

        int expectedNumObservers = 3;
        int actualNumObservers = djia.countObservers();
        assertEquals(expectedNumObservers, actualNumObservers);
    }


}
