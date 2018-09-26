package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import java.io.Serializable;

public abstract class VWAbstractMessage implements VWMessage {
    private static final long serialVersionUID = -3789213671006332038L;
    private VWMessageCodes code;
    private Serializable content;
    
    public VWAbstractMessage(VWMessageCodes code, Serializable content) {
	this.code = code;
	this.content = content;
    }
    
    @Override
    public VWMessageCodes getCode() {
	return this.code;
    }
    
    @Override
    public Serializable getContent() {
	return this.content;
    }
}