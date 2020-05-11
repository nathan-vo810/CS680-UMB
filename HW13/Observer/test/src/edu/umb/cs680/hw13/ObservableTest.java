package edu.umb.cs680.hw13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObservableTest {

    @Test
    public void changeStockQuote() {
        StockQuoteObservable s = new StockQuoteObservable();

        s.addObserver(new PiechartObserver());
        s.addObserver(new TableObserver());
        s.addObserver(new ThreeDObserver());

        s.changeQuote("MSFT", 23.6f);
        s.changeQuote("GGL", 450.5f);
        s.changeQuote("MSFT", 25.6f);
        s.changeQuote("GGL", 230.0f);

        int expectedNumObservers = 3;
        int actualNumObservers = s.countObservers();
        assertEquals(expectedNumObservers, actualNumObservers);
    }

    @Test
    public void changeDJIAQuote() {
        DJIAQuoteObservable d = new DJIAQuoteObservable();

        d.addObserver(new PiechartObserver());
        d.addObserver(new TableObserver());
        d.addObserver(new ThreeDObserver());

        d.changeQuote(45.6f);
        d.changeQuote(90.4f);
        d.changeQuote(23.0f);

        int expectedNumObservers = 3;
        int actualNumObservers = d.countObservers();
        assertEquals(expectedNumObservers, actualNumObservers);
    }


}
