package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import org.json.JSONObject;

public abstract class VWAbstractMessage implements VWMessage {
    private static final long serialVersionUID = -3789213671006332038L;
    private VWMessageCodes code;
    private transient JSONObject content;
    
    public VWAbstractMessage(VWMessageCodes code, JSONObject content) {
	this.code = code;
	this.content = content;
    }
    
    @Override
    public VWMessageCodes getCode() {
	return this.code;
    }
    
    @Override
    public JSONObject getContent() {
	return this.content;
    }
}