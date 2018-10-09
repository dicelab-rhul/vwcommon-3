package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

public class VacuumWorldRuntimeException extends RuntimeException {
    private static final long serialVersionUID = -425287711179721897L;

    public VacuumWorldRuntimeException() {
	super();
    }

    public VacuumWorldRuntimeException(String arg0) {
	super(arg0);
    }

    public VacuumWorldRuntimeException(Throwable cause) {
	super(cause);
    }

    public VacuumWorldRuntimeException(String message, Throwable cause) {
	super(message, cause);
    }

    public VacuumWorldRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
	super(message, cause, enableSuppression, writableStackTrace);
    }
}