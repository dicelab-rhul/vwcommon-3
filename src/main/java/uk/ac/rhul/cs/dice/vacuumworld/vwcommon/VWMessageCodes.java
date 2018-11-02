package uk.ac.rhul.cs.dice.vacuumworld.vwcommon;

/**
 * 
 * This enumeration contains the values for the message codes used during the handshake between the VacuumWorld components.
 * 
 * @author cloudstrife9999
 *
 */
public enum VWMessageCodes {
    HELLO_CONTROLLER_FROM_VIEW, //HVC (Hello View -> Controller)
    HELLO_MODEL_FROM_VIEW, //HVM (Hello View -> Model)
    HELLO_MODEL_FROM_CONTROLLER, //HCM (Hello Controller -> Model)
    HELLO_VIEW_FROM_CONTROLLER, //HCV (Hello Controller -> View)
    HELLO_CONTROLLER_FROM_MODEL, //HMC (Hello Model -> Controller)
    HELLO_VIEW_FROM_MODEL, //HMV (Hello Model -> View)
    INIT_GAME_FROM_VIEW,
    UPDATE_FROM_MODEL,
    ACK_FROM_VIEW,
    PAUSE_FROM_VIEW,
    RESUME_FROM_VIEW,
    SAVE_AND_QUIT_FROM_VIEW,
    QUIT_FROM_VIEW,
    FATAL_ERROR;
}