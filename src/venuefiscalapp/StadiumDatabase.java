

package venuefiscalapp;

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
public class StadiumDatabase {
    
    private Stadium stadium;
    
    private Stadium millerPark = 
            new Stadium("MILLER PARK", "1 Brewers Way", "Milwaukee", "WI", "(414) 902-4400", new MillerPark());
    private Stadium fenwayPark = 
            new Stadium("FENWAY PARK", "4 Yawkey Way", "Boston", "MS", "(617) 226-6666", new FenwayPark());
    private Stadium buschStadium = 
            new Stadium("BUSCH STADIUM", "700 Clark Avenue", "St. Louis", "MO", "(314) 345-9600", new BuschStadium());
    private Stadium pncPark = 
            new Stadium("PNC PARK", "115 Federal St", "Pittsburgh", "PA", "(412) 321-2827", new PncPark() );
    private Stadium wrigleyField = 
            new Stadium("WRIGLEY FIELD" , "060 W Addison St", "Chicago", "IL", "(773) 404-2827", new WrigleyField() );
    private Stadium yankeeStadium = 
            new Stadium("YANKEE STADIUM", "1 E 161st St", "Bronx", "NY", "(718) 293-4300", new YankeeStadium());

    
    /**
     * 
     * Adds all stadiums to a set, and takes the passed in name and returns the object
     * that name is attached to if indeed it is inside the set.
     * 
     * @param name
     * @return stadium
     */
    public Stadium searchForStadiumName(String name){
        Set<Stadium> stadiums = new HashSet<>();
        stadiums.add(millerPark);
        stadiums.add(fenwayPark);
        stadiums.add(buschStadium);
        stadiums.add(pncPark);
        stadiums.add(wrigleyField);
        stadiums.add(yankeeStadium);
         
        stadium = null;
        
        for (Stadium s: stadiums){
            if (name.equals(s.getName())){
                setStadium(s);
            }
        }
        return getStadium();
    } 
    
    
    
    /**
     * @return the stadium
     */
    public Stadium getStadium() {
        return stadium;
    }

    /**
     * @param stadium the stadium to set
     */
    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }
}
