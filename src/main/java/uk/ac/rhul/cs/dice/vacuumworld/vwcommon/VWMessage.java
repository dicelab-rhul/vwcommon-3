package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import java.io.Serializable;

import org.json.JSONObject;

/**
 * 
 * Interface for messages between the components (model, view, and controller) in VacuumWorld.<br/><br/>
 * <i>Message</i> in this context does not refer to the messages exchanged by the agents.<br/><br/>
 * Extended interfaces: {@link Serializable}.<br/><br/>
 * Known implementations: {@link VWAbstractMessage}.
 * 
 * @author cloudstrife9999
 *
 */
public interface VWMessage extends Serializable {
    
    /**
     * 
     * Returns the message code.
     * 
     * @return the message code as a {@link VWMessageCodes} object.
     * 
     */
    public abstract VWMessageCodes getCode();
    
    /**
     * 
     * Returns the message content.
     * 
     * @return the message content as a {@link JSONObject} object.
     * 
     */
    public abstract JSONObject getContent();
}