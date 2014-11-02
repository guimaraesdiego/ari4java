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

public interface BridgeAttendedTransfer {

// Channel getTransfer_target
/**********************************************************
 * The channel that is being transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getTransfer_target();



// void setDestination_threeway_channel Channel
/**********************************************************
 * Transferer channel that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_threeway_channel(Channel val );



// void setDestination_application String
/**********************************************************
 * Application that has been transferred into
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_application(String val );



// String getDestination_type
/**********************************************************
 * How the transfer was accomplished
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getDestination_type();



// String getResult
/**********************************************************
 * The result of the transfer attempt
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getResult();



// Channel getTransferee
/**********************************************************
 * The channel that is being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getTransferee();



// Channel getDestination_threeway_channel
/**********************************************************
 * Transferer channel that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getDestination_threeway_channel();



// Bridge getTransferer_second_leg_bridge
/**********************************************************
 * Bridge the transferer second leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getTransferer_second_leg_bridge();



// Bridge getDestination_threeway_bridge
/**********************************************************
 * Bridge that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getDestination_threeway_bridge();



// Bridge getTransferer_first_leg_bridge
/**********************************************************
 * Bridge the transferer first leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Bridge getTransferer_first_leg_bridge();



// boolean getIs_external
/**********************************************************
 * Whether the transfer was externally initiated or not
 * 
 * @since ari_1_5_0
 *********************************************************/
 public boolean getIs_external();



// Channel getDestination_link_second_leg
/**********************************************************
 * Second leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getDestination_link_second_leg();



// void setDestination_bridge String
/**********************************************************
 * Bridge that survived the merge result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_bridge(String val );



// String getDestination_application
/**********************************************************
 * Application that has been transferred into
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getDestination_application();



// Channel getTransferer_second_leg
/**********************************************************
 * Second leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getTransferer_second_leg();



// void setIs_external boolean
/**********************************************************
 * Whether the transfer was externally initiated or not
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setIs_external(boolean val );



// void setDestination_link_first_leg Channel
/**********************************************************
 * First leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_link_first_leg(Channel val );



// void setTransferer_second_leg_bridge Bridge
/**********************************************************
 * Bridge the transferer second leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_second_leg_bridge(Bridge val );



// String getDestination_bridge
/**********************************************************
 * Bridge that survived the merge result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public String getDestination_bridge();



// void setTransfer_target Channel
/**********************************************************
 * The channel that is being transferred to
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransfer_target(Channel val );



// void setDestination_link_second_leg Channel
/**********************************************************
 * Second leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_link_second_leg(Channel val );



// void setTransferer_first_leg Channel
/**********************************************************
 * First leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_first_leg(Channel val );



// void setDestination_type String
/**********************************************************
 * How the transfer was accomplished
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_type(String val );



// void setTransferee Channel
/**********************************************************
 * The channel that is being transferred
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferee(Channel val );



// void setDestination_threeway_bridge Bridge
/**********************************************************
 * Bridge that survived the threeway result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setDestination_threeway_bridge(Bridge val );



// void setReplace_channel Channel
/**********************************************************
 * The channel that is replacing transferer_first_leg in the swap
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setReplace_channel(Channel val );



// Channel getDestination_link_first_leg
/**********************************************************
 * First leg of a link transfer result
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getDestination_link_first_leg();



// void setTransferer_second_leg Channel
/**********************************************************
 * Second leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_second_leg(Channel val );



// Channel getReplace_channel
/**********************************************************
 * The channel that is replacing transferer_first_leg in the swap
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getReplace_channel();



// Channel getTransferer_first_leg
/**********************************************************
 * First leg of the transferer
 * 
 * @since ari_1_5_0
 *********************************************************/
 public Channel getTransferer_first_leg();



// void setTransferer_first_leg_bridge Bridge
/**********************************************************
 * Bridge the transferer first leg is in
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setTransferer_first_leg_bridge(Bridge val );



// void setResult String
/**********************************************************
 * The result of the transfer attempt
 * 
 * @since ari_1_5_0
 *********************************************************/
 public void setResult(String val );


}
;
