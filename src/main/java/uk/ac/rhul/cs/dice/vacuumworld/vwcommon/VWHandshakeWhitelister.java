package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

import java.io.Serializable;

import org.apache.commons.io.serialization.ValidatingObjectInputStream;
import org.cloudstrife9999.logutilities.LogUtils;

public class VWHandshakeWhitelister {

    private VWHandshakeWhitelister() {}

    public static void whitelistHandshakeClasses(ValidatingObjectInputStream is) {
	if (is == null) {
	    LogUtils.log("The ValidatingInputStream passed as parameter is null. Cannot whitelist anything...");
	}
	else {
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
}