package ch.loway.oss.ari4java.generated.ari_0_0_1.actions;

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
import ch.loway.oss.ari4java.generated.ari_0_0_1.models.*;

public class ActionAsterisk_impl_ari_0_0_1 extends BaseAriAction  implements ActionAsterisk {
/**********************************************************
 * Asterisk system information (similar to core show settings)
 * 
 * Gets Asterisk system information.
 *********************************************************/
private void buildGetInfo(String only) {
reset();
url = "/asterisk/info";
method = "GET";
lParamQuery.add( BaseAriAction.HttpParam.build( "only", only) );
}

@Override
public AsteriskInfo getInfo(String only) throws RestException {
buildGetInfo(only);
String json = httpActionSync();
return deserializeJson( json, AsteriskInfo_impl_ari_0_0_1.class ); 
}

@Override
public void getInfo(String only, AriCallback<AsteriskInfo> callback) {
buildGetInfo(only);
httpActionAsync(callback, AsteriskInfo_impl_ari_0_0_1.class);
}

/**********************************************************
 * Global variables
 * 
 * Get the value of a global variable.
 *********************************************************/
private void buildGetGlobalVar(String variable) {
reset();
url = "/asterisk/variable";
method = "GET";
lParamQuery.add( BaseAriAction.HttpParam.build( "variable", variable) );
lE.add( BaseAriAction.HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public Variable getGlobalVar(String variable) throws RestException {
buildGetGlobalVar(variable);
String json = httpActionSync();
return deserializeJson( json, Variable_impl_ari_0_0_1.class ); 
}

@Override
public void getGlobalVar(String variable, AriCallback<Variable> callback) {
buildGetGlobalVar(variable);
httpActionAsync(callback, Variable_impl_ari_0_0_1.class);
}

/**********************************************************
 * Global variables
 * 
 * Set the value of a global variable.
 *********************************************************/
private void buildSetGlobalVar(String variable, String value) {
reset();
url = "/asterisk/variable";
method = "POST";
lParamQuery.add( BaseAriAction.HttpParam.build( "variable", variable) );
lParamQuery.add( BaseAriAction.HttpParam.build( "value", value) );
lE.add( BaseAriAction.HttpResponse.build( 400, "Missing variable parameter.") );
}

@Override
public void setGlobalVar(String variable, String value) throws RestException {
buildSetGlobalVar(variable, value);
String json = httpActionSync();
}

@Override
public void setGlobalVar(String variable, String value, AriCallback<Void> callback) {
buildSetGlobalVar(variable, value);
httpActionAsync(callback);
}

/** No missing signatures from interface */
};

