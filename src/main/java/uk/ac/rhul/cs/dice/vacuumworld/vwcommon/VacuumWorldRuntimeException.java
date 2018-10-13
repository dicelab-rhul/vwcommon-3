package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

/**
 * 
 * Use this class if you want to throw a custom unchecked (i.e., runtime) exception.<br/><br/>
 * Extends {@link RuntimeException}.
 * 
 * @author cloudstrife9999
 *
 */
public class VacuumWorldRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -425287711179721897L;

    /**
     * 
     * Constructor that calls the superclass ({@link RuntimeException}) empty constructor.
     * 
     */
    public VacuumWorldRuntimeException() {
	super();
    }

    /**
     * 
     * Constructor that calls the superclass ({@link RuntimeException}) constructor with the received parameter.
     * 
     * @param arg0 a {@link String} message.
     * 
     */
    public VacuumWorldRuntimeException(String arg0) {
	super(arg0);
    }

    /**
     * 
     * Constructor that calls the superclass ({@link RuntimeException}) constructor with the received parameter.
     * 
     * @param cause a {@link Throwable} cause.
     * 
     */
    public VacuumWorldRuntimeException(Throwable cause) {
	super(cause);
    }

    /**
     * 
     * Constructor that calls the superclass ({@link RuntimeException}) constructor with the received parameters.
     * 
     * @param message a {@link String} message.
     * @param cause a {@link Throwable} cause.
     * 
     */
    public VacuumWorldRuntimeException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * 
     * Constructor that calls the superclass ({@link RuntimeException}) constructor with the received parameters.
     * 
     * @param message a {@link String} message.
     * @param cause a {@link Throwable} cause.
     * @param enableSuppression a boolean flag to enable/disable the suppression.
     * @param writableStackTrace a boolean flag to enable/disable the writable stack trace.
     * 
     */
    public VacuumWorldRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}