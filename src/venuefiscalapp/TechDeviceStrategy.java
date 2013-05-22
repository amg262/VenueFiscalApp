
package venuefiscalapp;

import output.strategy.OutputStrategy;

/**
 *
 * Interface that allows flexibility to the Technology piece the user
 * would use to input their info. Could be a terminal, smartphone, computer,
 * something like that. This would allow flexibility of swapping those kinds
 * of devices to make easy transitions.
 * 
 * @author Andy
 */
public interface TechDeviceStrategy {
    
    /**
     *
     */
    public abstract void startCalc();

    
    /**
     *
     * @param name
     * @param attendance  
     */
    public abstract void inputInfo(String name, double attendance);

    /**
     *
     * @param outputGame 
     */

    public abstract void outputGame(OutputStrategy outputGame);

    /**
     *
     * @param outputTotals
     */
    public abstract void outputTotals(OutputStrategy outputTotals);
   

}