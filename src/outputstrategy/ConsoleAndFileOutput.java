
package outputstrategy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class ConsoleAndFileOutput implements OutputStrategy {

    /**
     *
     * @param information
     */
    @Override
    public void displayInfo(String information) {
        
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("gui_total.txt", true));
            
            out.write(information);
            System.out.println(information);
            out.close();
            
            } catch (IOException e){
        }
    }
}
