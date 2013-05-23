
package inputstrategy;

import javax.swing.JOptionPane;

/**
 * Input name and attendance using the GUI.
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class GuiInput implements InputStrategy {

    private String name;
    private double atten;
    
    private final String NAME_PROMPT = "Enter Venue Name:   ";
    private final String ATTEN_PROMPT = "Enter Attendance:  ";
    
    
    /**
     *
     * @return
     */
    @Override
    public String getName() {
        name = JOptionPane.showInputDialog(null, NAME_PROMPT);
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public double getAttendance() {
        String a = JOptionPane.showInputDialog(null, ATTEN_PROMPT);
        atten = Double.valueOf(a);
        return atten;
        
    }

}
