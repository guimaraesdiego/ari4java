package ch.loway.oss.ari4java.generated.ari_1_0_0.models;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sun Nov 02 19:48:30 CET 2014
// ----------------------------------------------------

import ch.loway.oss.ari4java.generated.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**********************************************************
 * Represents the state of a device.
 * 
 * Defined in file: deviceStates.json
 *********************************************************/

public class DeviceState_impl_ari_1_0_0 implements DeviceState, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Name of the device.  */
  private String name;
 public String getName() {
   return name;
 }

 @JsonDeserialize( as=String.class )
 public void setName(String val ) {
   name = val;
 }

  /**  Device's state  */
  private String state;
 public String getState() {
   return state;
 }

 @JsonDeserialize( as=String.class )
 public void setState(String val ) {
   state = val;
 }

/** No missing signatures from interface */
}

