package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import java.io.Serializable;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;

public class VWHandshakeWhitelister {
    
    private VWHandshakeWhitelister() {}
    
    public static void whitelistHandshakeClasses(ValidatingObjectInputStream is) {
	is.accept(VacuumWorldMessage.class);
	is.accept(VWAbstractMessage.class);
	is.accept(VWMessage.class);
	is.accept(VWMessageCodes.class);
	is.accept(Enum.class);
	is.accept(Serializable.class);
	is.accept(String.class);
	is.accept(Long.class);
    }
}