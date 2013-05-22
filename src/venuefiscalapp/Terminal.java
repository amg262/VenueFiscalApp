
package venuefiscalapp;

import custom.exceptions.IllegalAttendanceException;
import custom.exceptions.IllegalVenueException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import output.strategy.OutputStrategy;

/**
 *
 * Terminal class that uses TechDeviceStrategy to allow flexibility to
 * what kind of Technology device that might be being used, whether is a computer,
 * smart phone, etc. 
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class Terminal implements TechDeviceStrategy {

    private String name;
    private double atten;
    private double totalRev;
    
    private Venue venue;
    private MediumOutputStrategy medium;
    private OutputStrategy outputGame;
    private OutputStrategy outputTotals;
    
    private List<MediumOutputStrategy> medList = new ArrayList<>();

    /**
     * Default constructor
     */
    public Terminal(){}

    
    /**
     * @param name
     * @param attendance
     */
    public Terminal(String name, double attendance){
        this.name = name;
        this.atten = attendance;
    }

    
    /**
     * Creates the medium object it will use run methods, and passes
     * in the list of medium/ticket objects.
     */
    @Override
    public void startCalc() {
        medium = new Ticket(medList);
    }


    /**
     * Assigns venue to what medium finds when it runs getVenue method
     * Also passes name and attendance into medium/ticket, and adds the 
     * medium object to an array list.
     * 
     * @param name
     * @param attendance  
     */
    @Override
    public void inputInfo(String name, double attendance) throws 
            IllegalVenueException, IllegalAttendanceException {
        
        venue = medium.getVenue(name);
        medium.inputInfo(name, attendance);
        medList.add(medium);
    }

    
    /**
     * utilizes outputStrategy interface for flexibility.
     * outputs single game totals.
     * 
     * @param outputGame 
     */
    @Override
    public void outputGame(OutputStrategy outputGame) throws 
            IllegalVenueException, IllegalAttendanceException {
        
        outputGame.displayInfo(medium.outputGame());
    }

    
    /**
     * utilizes outputStrategy interface for flexibility.
     * outputs totals for all games combined.
     * 
     * @param outputTotals
     */
    @Override
    public void outputTotals(OutputStrategy outputTotals) throws 
            IllegalVenueException, IllegalAttendanceException {
        
        outputTotals.displayInfo(medium.outputTotals());
    }
}