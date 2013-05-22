
package venuefiscalapp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import output.strategy.OutputStrategy;

/**
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
     *
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

    
    @Override
    public void startCalc() {
        medium = new Ticket(medList);
    }


    /**
     * @param name
     * @param attendance  
     */
    @Override
    public void inputInfo(String name, double attendance) {
        venue = medium.getVenue(name);
        medium.inputInfo(name, attendance);
        medList.add(medium);
    }

    @Override
    public void outputGame(OutputStrategy outputGame) {
        outputGame.displayInfo(medium.outputGame());
    }

    /**
     *
     * @param outputTotals
     */
    @Override
    public void outputTotals(OutputStrategy outputTotals) {
        outputTotals.displayInfo(medium.outputTotals());
    }
}
