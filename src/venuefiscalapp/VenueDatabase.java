

package venuefiscalapp;

import custom.exceptions.IllegalVenueException;
import venue.strategy.WrigleyField;
import venue.strategy.FenwayPark;
import venue.strategy.BuschStadium;
import venue.strategy.YankeeStadium;
import venue.strategy.MillerPark;
import venue.strategy.PncPark;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * Class that adds all different stadiums to a set, and has method which will
 * search thru them with the provided name to see if the Object exists
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class VenueDatabase {
    
    private Venue venue;
    
    private Venue millerPark = 
            new Stadium("MILLER PARK", "1 Brewers Way", "Milwaukee", "WI", "(414) 902-4400", new MillerPark());
    private Venue fenwayPark = 
            new Stadium("FENWAY PARK", "4 Yawkey Way", "Boston", "MS", "(617) 226-6666", new FenwayPark());
    private Venue buschStadium = 
            new Stadium("BUSCH STADIUM", "700 Clark Avenue", "St. Louis", "MO", "(314) 345-9600", new BuschStadium());
    private Venue pncPark = 
            new Stadium("PNC PARK", "115 Federal St", "Pittsburgh", "PA", "(412) 321-2827", new PncPark() );
    private Stadium wrigleyField = 
            new Stadium("WRIGLEY FIELD" , "060 W Addison St", "Chicago", "IL", "(773) 404-2827", new WrigleyField() );
    private Venue yankeeStadium = 
            new Stadium("YANKEE STADIUM", "1 E 161st St", "Bronx", "NY", "(718) 293-4300", new YankeeStadium());

    
    /**
     * 
     * Adds all stadiums to a set, and takes the passed in name and returns the object
     * that name is attached to if indeed it is inside the set.
     * 
     * @param name
     * @return stadium
     */
    public Venue searchForVenueName(String name) throws IllegalVenueException{
        Set<Venue> venues = new HashSet<>();
        venues.add(millerPark);
        venues.add(fenwayPark);
        venues.add(buschStadium);
        venues.add(pncPark);
        venues.add(wrigleyField);
        venues.add(yankeeStadium);
         
        setVenue(null);
        
        for (Venue v: venues){
            if (name.equals(v.getName())){
                setVenue(v);
                if (getVenue() == null){
                    throw new IllegalVenueException();
                }
            }
        }
        return getVenue();
    } 

    /**
     * @return the venue
     */
    public Venue getVenue() {
        return venue;
    }

    /**
     * @param venue the venue to set
     */
    public void setVenue(Venue venue) {
        this.venue = venue;
    }
    
    
}
