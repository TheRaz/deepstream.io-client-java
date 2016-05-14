package io.deepstream.constants;

import java.util.EnumSet;

public enum Event {
    CONNECTION_ERROR,
    CONNECTION_STATE_CHANGED,
    ACK_TIMEOUT,
    RESPONSE_TIMEOUT,
    DELETE_TIMEOUT,
    UNSOLICITED_MESSAGE,
    MESSAGE_PARSE_ERROR,
    VERSION_EXISTS,
    NOT_AUTHENTICATED,
    LISTENER_EXISTS,
    NOT_LISTENING,
    TOO_MANY_AUTH_ATTEMPTS,
    IS_CLOSED,
    UNKNOWN_CALLEE,
    RECORD_NOT_FOUND;

    static public Event getEvent( String event ) {

        for( Event s : EnumSet.allOf( Event.class ) ) {
            if( s.name().equals( event ) ) {
                return s;
            }
        }
        return null;
    }
}
