package ch.loway.oss.ari4java.generated.ari_0_0_1.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sun Nov 02 19:48:29 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Details of a Stasis application
 * 
 * Defined in file: applications.json
 *********************************************************/

public class Application_impl_ari_0_0_1 implements Application, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Id's for bridges subscribed to.  */
  private List<String> bridge_ids;
 public List<String> getBridge_ids() {
   return bridge_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setBridge_ids(List<String> val ) {
   bridge_ids = val;
 }

  /**  Id's for channels subscribed to.  */
  private List<String> channel_ids;
 public List<String> getChannel_ids() {
   return channel_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setChannel_ids(List<String> val ) {
   channel_ids = val;
 }

  /**  Names of the devices subscribed to.  */
  private List<String> device_names;
 public List<String> getDevice_names() {
   return device_names;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setDevice_names(List<String> val ) {
   device_names = val;
 }

  /**  {tech}/{resource} for endpoints subscribed to.  */
  private List<String> endpoint_ids;
 public List<String> getEndpoint_ids() {
   return endpoint_ids;
 }

 @JsonDeserialize( contentAs=String.class )
 public void setEndpoint_ids(List<String> val ) {
   endpoint_ids = val;
 }

  /**  Name of this application  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

/** No missing signatures from interface */
}

