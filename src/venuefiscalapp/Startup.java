
package venuefiscalapp;

import custom.exceptions.IllegalAttendanceException;
import custom.exceptions.IllegalVenueException;
import output.strategy.ConsoleOutput;
import output.strategy.GuiOutput;

/**
 *
 * This is a program that will take in the name of a venue or stadium etc.
 * and will you input the attendance it will will output the percent of capacity,
 * the revenue generated based on attendance and average ticket prices. All average
 * ticket prices are factual and researched.
 * 
 * @author Andy
 */
public class Startup {

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws IllegalVenueException, IllegalAttendanceException {
        // TODO code application logic here
        
        final String n = "Miller park";
        double attendance = 32000;
        String name = n.toUpperCase();

        TechDeviceStrategy device = new Terminal();
        
        try {
        
        device.startCalc();
        device.inputInfo(name, attendance);
        device.outputGame(new GuiOutput());
        device.outputTotals(new ConsoleOutput());
        
        device.startCalc();
        device.inputInfo(name, 20000);
        device.outputGame(new GuiOutput());
        device.outputTotals(new ConsoleOutput());

        
        device.startCalc();
        device.inputInfo(name, 40000);
        device.outputGame(new GuiOutput());
        device.outputTotals(new ConsoleOutput());
        
        
        } catch (IllegalVenueException ive){
            System.out.println(ive.getMessage());
            
        } catch (IllegalAttendanceException iae){
            System.out.println(iae.getMessage());
            
        } catch (IllegalArgumentException iarge){
            System.out.println(iarge.getMessage());
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
