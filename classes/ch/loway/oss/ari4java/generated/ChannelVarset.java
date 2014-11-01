package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 01 15:52:13 CET 2014
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface ChannelVarset {

// void setValue String
/**********************************************************
 * The new value of the variable.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setValue(String val );



// void setVariable String
/**********************************************************
 * The variable that changed.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setVariable(String val );



// Channel getChannel
/**********************************************************
 * The channel on which the variable was set.
 * 
 * If missing, the variable is a global variable.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public Channel getChannel();



// String getValue
/**********************************************************
 * The new value of the variable.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getValue();



// String getVariable
/**********************************************************
 * The variable that changed.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getVariable();



// void setChannel Channel
/**********************************************************
 * The channel on which the variable was set.
 * 
 * If missing, the variable is a global variable.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel(Channel val );


}
;
