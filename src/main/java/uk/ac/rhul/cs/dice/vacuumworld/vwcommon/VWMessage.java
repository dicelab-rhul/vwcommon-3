package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import java.io.Serializable;

import org.json.JSONObject;

public interface VWMessage extends Serializable {
    public abstract VWMessageCodes getCode();
    public abstract JSONObject getContent();
}