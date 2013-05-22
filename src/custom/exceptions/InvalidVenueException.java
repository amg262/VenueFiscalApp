
package custom.exceptions;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class InvalidVenueException extends Exception {
    
    private static final String MSG = "Invalid: Venue name input";

    /**
     *
     */
    public InvalidVenueException() {
        super(MSG);
    }

    /**
     *
     * @param MSG
     */
    public InvalidVenueException(String MSG) {
        super(MSG);
    }

    /**
     *
     * @param MSG
     * @param thrwbl
     */
    public InvalidVenueException(String MSG, Throwable thrwbl) {
        super(MSG, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public InvalidVenueException(Throwable thrwbl) {
        super(thrwbl);
    }
}
