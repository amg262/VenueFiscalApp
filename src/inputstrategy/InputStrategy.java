
package inputstrategy;

/**
 *
 * Interface that allows for flexible input
 * 
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public interface InputStrategy {

    /**
     *
     * @return
     */
    public abstract String getName();
    /**
     *
     * @return
     */
    public abstract double getAttendance();
}
