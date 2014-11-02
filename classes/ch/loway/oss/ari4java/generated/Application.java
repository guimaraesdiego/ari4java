package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sun Nov 02 19:48:29 CET 2014
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface Application {

// void setEndpoint_ids List<String>
/**********************************************************
 * {tech}/{resource} for endpoints subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setEndpoint_ids(List<String> val );



// void setBridge_ids List<String>
/**********************************************************
 * Id's for bridges subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setBridge_ids(List<String> val );



// List<String> getChannel_ids
/**********************************************************
 * Id's for channels subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<String> getChannel_ids();



// List<String> getBridge_ids
/**********************************************************
 * Id's for bridges subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<String> getBridge_ids();



// void setName String
/**********************************************************
 * Name of this application
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setName(String val );



// List<String> getEndpoint_ids
/**********************************************************
 * {tech}/{resource} for endpoints subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<String> getEndpoint_ids();



// void setChannel_ids List<String>
/**********************************************************
 * Id's for channels subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setChannel_ids(List<String> val );



// String getName
/**********************************************************
 * Name of this application
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getName();



// void setDevice_names List<String>
/**********************************************************
 * Names of the devices subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDevice_names(List<String> val );



// List<String> getDevice_names
/**********************************************************
 * Names of the devices subscribed to.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public List<String> getDevice_names();


}
;
