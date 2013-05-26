
package venuefiscalapp;

/**
 *
 * Interface that contains all methods any class that implements
 * it must define and implement. Allows for any class to be swapped out.
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public interface VenueDatabaseStrategy {

    public abstract Venue searchForVenueName(String name);
    public abstract Venue getVenue();
    public abstract void setVenue(Venue venue);
    
}
