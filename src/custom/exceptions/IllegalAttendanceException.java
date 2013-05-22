
package custom.exceptions;

/**
 *
 * @author Andrew Gunn | amgunn1@hotmail.com
 */
public class IllegalAttendanceException extends Exception {
    private static final String MSG = "Invalid: Attendance input";

    /**
     *
     */
    public IllegalAttendanceException() {
        super(MSG);
    }

    /**
     *
     * @param MSG
     */
    public IllegalAttendanceException(String MSG) {
        super(MSG);
    }

    /**
     *
     * @param MSG
     * @param thrwbl
     */
    public IllegalAttendanceException(String MSG, Throwable thrwbl) {
        super(MSG, thrwbl);
    }

    /**
     *
     * @param thrwbl
     */
    public IllegalAttendanceException(Throwable thrwbl) {
        super(thrwbl);
    }

}
