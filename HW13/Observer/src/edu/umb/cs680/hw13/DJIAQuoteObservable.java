package edu.umb.cs680.hw13;

import java.util.Observable;

public class DJIAQuoteObservable extends Observable{
    private Float quote;

    public void changeQuote(Float q) {
        quote = q;
        setChanged();
        notifyObservers(new DJIAEvent(quote));
    }
}
