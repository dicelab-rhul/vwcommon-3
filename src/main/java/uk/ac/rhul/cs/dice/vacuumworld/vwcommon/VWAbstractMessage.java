package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import org.json.JSONObject;

/**
 * 
 * This abstract class serves as the generic skeleton for messages in VacuumWorld.<br/><br/>
 * Implemented interfaces: {@link VWMessage}.<br/><br/>
 * Known subclasses: {@link VacuumWorldMessage}.
 * 
 */
public abstract class VWAbstractMessage implements VWMessage {
    private static final long serialVersionUID = -3789213671006332038L;
    private VWMessageCodes code;
    private String content;
    
    /**
     * 
     * Constructor with the message code, and the message content.
     * 
     * @param code the {@link VWMessageCodes} code of the message.
     * @param content the content of the message, as a {@link JSONObject}.
     * 
     */
    public VWAbstractMessage(VWMessageCodes code, JSONObject content) {
	this.code = code;
	this.content = content == null ? null : content.toString();
    }
    
    /**
     * 
     * Returns the message code.
     * 
     * @return the message code as a {@link VWMessageCodes} object.
     * 
     */
    @Override
    public VWMessageCodes getCode() {
	return this.code;
    }
    
    /**
     * 
     * Returns the message content.
     * 
     * @return the message content as a {@link JSONObject} object.
     * 
     */
    @Override
    public JSONObject getContent() {
	return this.content == null ? null : new JSONObject(this.content);
    }
}