package ch.loway.oss.ari4java.generated.ari_1_5_0.models;

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
 * Channel changed Caller ID.
 * 
 * Defined in file: events.json
 *********************************************************/

public class ChannelCallerId_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements ChannelCallerId, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The integer representation of the Caller Presentation value.  */
  private int caller_presentation;
 public int getCaller_presentation() {
   return caller_presentation;
 }

 @JsonDeserialize( as=int.class )
 public void setCaller_presentation(int val ) {
   caller_presentation = val;
 }

  /**  The text representation of the Caller Presentation value.  */
  private String caller_presentation_txt;
 public String getCaller_presentation_txt() {
   return caller_presentation_txt;
 }

 @JsonDeserialize( as=String.class )
 public void setCaller_presentation_txt(String val ) {
   caller_presentation_txt = val;
 }

  /**  The channel that changed Caller ID.  */
  private Channel channel;
 public Channel getChannel() {
   return channel;
 }

 @JsonDeserialize( as=Channel_impl_ari_1_5_0.class )
 public void setChannel(Channel val ) {
   channel = val;
 }

/** No missing signatures from interface */
}

