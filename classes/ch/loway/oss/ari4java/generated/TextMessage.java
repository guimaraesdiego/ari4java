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

public interface TextMessage {

// void setFrom String
/**********************************************************
 * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setFrom(String val );



// void setVariables List<? extends TextMessageVariable>
/**********************************************************
 * Technology specific key/value pairs associated with the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setVariables(List<? extends TextMessageVariable> val );



// String getBody
/**********************************************************
 * The text of the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getBody();



// void setTo String
/**********************************************************
 * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTo(String val );



// void setBody String
/**********************************************************
 * The text of the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBody(String val );



// String getFrom
/**********************************************************
 * A technology specific URI specifying the source of the message. For sip and pjsip technologies, any SIP URI can be specified. For xmpp, the URI must correspond to the client connection being used to send the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getFrom();



// String getTo
/**********************************************************
 * A technology specific URI specifying the destination of the message. Valid technologies include sip, pjsip, and xmp. The destination of a message should be an endpoint.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getTo();



// List<? extends TextMessageVariable> getVariables
/**********************************************************
 * Technology specific key/value pairs associated with the message.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public List<? extends TextMessageVariable> getVariables();


}
;
