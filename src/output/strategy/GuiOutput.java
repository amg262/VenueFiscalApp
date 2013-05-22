
package output.strategy;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class GuiOutput implements OutputStrategy {
    
    private static final String MSG = "GDI | BaseBall-Revenue-Calc v1.1";
    final Icon icon = new ImageIcon("money.jpeg");
    
    /**
     *
     * @param information
     */
    @Override
    public void displayInfo(String information) {
        JOptionPane.showMessageDialog(null, information, MSG, JOptionPane.INFORMATION_MESSAGE, icon);
    }

}
