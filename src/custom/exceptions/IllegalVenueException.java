
package custom.exceptions;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class IllegalVenueException extends Exception {
    
    private static final String MSG = "Invalid: Venue name input";

    /**
     *
     */
    public IllegalVenueException() {
        super(MSG);
    }

    /**
     *
     * @param MSG
     */
    public IllegalVenueException(String MSG) {
        super(MSG);
    }

    /**
     *
     * @param MSG
     * @param thrwbl
     */
    public IllegalVenueException(String MSG, Throwable thrwbl) {
        super(MSG, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public IllegalVenueException(Throwable thrwbl) {
        super(thrwbl);
    }
}
