
package input.strategy;

import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class GuiInput implements InputStrategy {

    private String name;
    private double atten;
    
    private final String NAME_PROMPT = "Enter Venue Name:   ";
    private final String ATTEN_PROMPT = "Enter Attendance:  ";
    
    
    @Override
    public String getName() {
        name = JOptionPane.showInputDialog(null, NAME_PROMPT);
        return name;
    }

    @Override
    public double getAttendance() {
        String a = JOptionPane.showInputDialog(null, ATTEN_PROMPT);
        atten = Double.valueOf(a);
        return atten;
        
    }

}
