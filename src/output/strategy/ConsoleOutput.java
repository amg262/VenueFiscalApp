
package output.strategy;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class ConsoleOutput implements OutputStrategy {

    /**
     *
     * @param information
     */
    @Override
    public void displayInfo(String information) {
        System.out.println(information);
    }

}
