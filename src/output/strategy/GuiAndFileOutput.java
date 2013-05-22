
package output.strategy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class GuiAndFileOutput implements OutputStrategy {

    private static final String MSG = "GDI | BaseBall-Revenue-Calc v1.1";
    final Icon icon = new ImageIcon("money.jpeg");
    
    /**
     *
     * @param information
     */
    @Override
    public void displayInfo(String information) {
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("gui_total.txt", true));
            
            out.write(information);
            JOptionPane.showMessageDialog(null, information, MSG, JOptionPane.INFORMATION_MESSAGE, icon);
            out.close();
            
            } catch (IOException e){
        }
    }
}
