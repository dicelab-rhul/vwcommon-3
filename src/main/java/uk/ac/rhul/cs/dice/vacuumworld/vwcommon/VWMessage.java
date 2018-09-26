package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import java.io.Serializable;

public interface VWMessage extends Serializable {
    public abstract VWMessageCodes getCode();
    public abstract Serializable getContent();
}