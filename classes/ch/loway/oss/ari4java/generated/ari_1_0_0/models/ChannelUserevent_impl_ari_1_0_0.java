package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 01 15:52:13 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * User-generated event with additional user-defined fields in the object.
 * 
 * Defined in file: events.json
 *********************************************************/

public class ChannelUserevent_impl_ari_1_0_0 extends Event_impl_ari_1_0_0 implements ChannelUserevent, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The channel that signaled the user event.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_0_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

  /**  The name of the user event.  */
  private String eventname;
 public String getEventname() {
   return eventname;
 }

 @JsonDeserialize( as=String.class )
 public void setEventname(String val ) {
   eventname = val;
 }

  /**  Custom Userevent data  */
  private String userevent;
 public String getUserevent() {
   return userevent;
 }

 @JsonDeserialize( as=String.class )
 public void setUserevent(String val ) {
   userevent = val;
 }

/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setBridge(Bridge val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setEndpoint(Endpoint val ){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * A endpoint that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Endpoint getEndpoint(){
  throw new UnsupportedOperationException("Method availble from ...");
};

/**********************************************************
 * A bridge that is signaled with the user event.
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getBridge(){
  throw new UnsupportedOperationException("Method availble from ...");
};

}

