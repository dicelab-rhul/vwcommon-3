package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

/**
 * 
 * Use this class if you want to throw a custom checked (i.e., that you must propagate or catch) exception.<br/><br/>
 * Extends {@link Exception}.
 * 
 * @author cloudstrife9999
 *
 */
public class VacuumWorldCheckedException extends Exception {
    private static final long serialVersionUID = -6518039882456079779L;

    /**
     * 
     * Constructor that calls the superclass ({@link Exception}) empty constructor.
     * 
     */
    public VacuumWorldCheckedException() {
	super();
    }

    /**
     * 
     * Constructor that calls the superclass ({@link Exception}) constructor with the received parameter.
     * 
     * @param arg0 a {@link String} message.
     * 
     */
    public VacuumWorldCheckedException(String arg0) {
	super(arg0);
    }

    /**
     * 
     * Constructor that calls the superclass ({@link Exception}) constructor with the received parameter.
     * 
     * @param cause a {@link Throwable} cause.
     * 
     */
    public VacuumWorldCheckedException(Throwable cause) {
	super(cause);
    }

    /**
     * 
     * Constructor that calls the superclass ({@link Exception}) constructor with the received parameters.
     * 
     * @param message a {@link String} message.
     * @param cause a {@link Throwable} cause.
     * 
     */
    public VacuumWorldCheckedException(String message, Throwable cause) {
	super(message, cause);
    }

    /**
     * 
     * Constructor that calls the superclass ({@link Exception}) constructor with the received parameters.
     * 
     * @param message a {@link String} message.
     * @param cause a {@link Throwable} cause.
     * @param enableSuppression a boolean flag to enable/disable the suppression.
     * @param writableStackTrace a boolean flag to enable/disable the writable stack trace.
     * 
     */
    public VacuumWorldCheckedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}