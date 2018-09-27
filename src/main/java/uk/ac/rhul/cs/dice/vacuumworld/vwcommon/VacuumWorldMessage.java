package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import org.json.JSONObject;

public class VacuumWorldMessage extends VWAbstractMessage {
    private static final long serialVersionUID = 673106676945566979L;

    public VacuumWorldMessage(VWMessageCodes code, JSONObject content) {
	super(code, content);
    }
}