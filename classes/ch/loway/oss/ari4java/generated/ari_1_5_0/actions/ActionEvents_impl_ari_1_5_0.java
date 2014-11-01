package ch.loway.oss.ari4java.generated.ari_1_5_0.actions;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 01 15:52:13 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.BaseAriAction;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;
import com.fasterxml.jackson.core.type.TypeReference;
import ch.loway.oss.ari4java.generated.ari_1_5_0.models.*;

public class ActionEvents_impl_ari_1_5_0 extends BaseAriAction  implements ActionEvents {
/**********************************************************
 * Events from Asterisk to applications
 * 
 * WebSocket connection for events.
 *********************************************************/
private void buildEventWebsocket(String app) {
reset();
url = "/events";
method = "GET";
lParamQuery.add( BaseAriAction.HttpParam.build( "app", app) );
wsUpgrade = true;
}

@Override
public Message eventWebsocket(String app) throws RestException {
throw new RestException("No synchronous operation on WebSocket");
}

@Override
public void eventWebsocket(String app, AriCallback<Message> callback) {
buildEventWebsocket(app);
httpActionAsync(callback, Message_impl_ari_1_5_0.class);
}

/**********************************************************
 * Stasis application user events
 * 
 * Generate a user event.
 *********************************************************/
private void buildUserEvent(String eventName, String application, String source, Map<String,String> variables) {
reset();
url = "/events/user/" + eventName + "";
method = "POST";
lParamQuery.add( BaseAriAction.HttpParam.build( "application", application) );
lParamQuery.add( BaseAriAction.HttpParam.build( "source", source) );
lE.add( BaseAriAction.HttpResponse.build( 404, "Application does not exist.") );
lE.add( BaseAriAction.HttpResponse.build( 422, "Event source not found.") );
lE.add( BaseAriAction.HttpResponse.build( 400, "Invalid even tsource URI or userevent data.") );
}

@Override
public void userEvent(String eventName, String application, String source, Map<String,String> variables) throws RestException {
buildUserEvent(eventName, application, source, variables);
String json = httpActionSync();
}

@Override
public void userEvent(String eventName, String application, String source, Map<String,String> variables, AriCallback<Void> callback) {
buildUserEvent(eventName, application, source, variables);
httpActionAsync(callback);
}

/** No missing signatures from interface */
};

