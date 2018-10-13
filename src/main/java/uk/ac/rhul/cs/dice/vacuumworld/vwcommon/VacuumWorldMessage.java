package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import org.json.JSONObject;

/**
 * 
 * This class is the prototype for all the messages exchanged by the VacuumWorld components.<br/><br/>
 * Extends {@link VWAbstractMessage}.<br/><br/>
 * Known subclasses: none.
 * 
 * @author cloudstrife9999
 *
 */
public class VacuumWorldMessage extends VWAbstractMessage {
    private static final long serialVersionUID = 673106676945566979L;

    /**
     * 
     * Constructor that simply calls the superclass ({@link VWAbstractMessage}) constructor with the received parameters.
     * 
     * @param code the {@link VWMessageCodes} code of the message.
     * @param content the content of the message, as a {@link JSONObject}.
     * 
     */
    public VacuumWorldMessage(VWMessageCodes code, JSONObject content) {
	super(code, content);
    }
}