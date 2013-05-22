
package custom.exceptions;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class InvalidAttendanceException extends Exception {
    private static final String MSG = "Invalid: Attendance input";

    /**
     *
     */
    public InvalidAttendanceException() {
        super(MSG);
    }

    /**
     *
     * @param MSG
     */
    public InvalidAttendanceException(String MSG) {
        super(MSG);
    }

    /**
     *
     * @param MSG
     * @param thrwbl
     */
    public InvalidAttendanceException(String MSG, Throwable thrwbl) {
        super(MSG, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public InvalidAttendanceException(Throwable thrwbl) {
        super(thrwbl);
    }

}
