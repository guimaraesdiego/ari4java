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
 * Notification that a device state has changed.
 * 
 * Defined in file: events.json
 *********************************************************/

public class DeviceStateChanged_impl_ari_1_5_0 extends Event_impl_ari_1_5_0 implements DeviceStateChanged, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  Device state object  */
  private DeviceState device_state;
 public DeviceState getDevice_state() {
   return device_state;
 }

 @JsonDeserialize( as=DeviceState_impl_ari_1_5_0.class )
 public void setDevice_state(DeviceState val ) {
   device_state = val;
 }

/** No missing signatures from interface */
}

