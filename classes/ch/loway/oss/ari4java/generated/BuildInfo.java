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

public interface BuildInfo {

// void setUser String
/**********************************************************
 * Username that build Asterisk
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setUser(String val );



// void setOptions String
/**********************************************************
 * Compile time options, or empty string if default.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setOptions(String val );



// void setDate String
/**********************************************************
 * Date and time when Asterisk was built.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setDate(String val );



// String getOptions
/**********************************************************
 * Compile time options, or empty string if default.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getOptions();



// void setOs String
/**********************************************************
 * OS Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setOs(String val );



// String getDate
/**********************************************************
 * Date and time when Asterisk was built.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getDate();



// String getKernel
/**********************************************************
 * Kernel version Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getKernel();



// void setMachine String
/**********************************************************
 * Machine architecture (x86_64, i686, ppc, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setMachine(String val );



// String getUser
/**********************************************************
 * Username that build Asterisk
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getUser();



// String getMachine
/**********************************************************
 * Machine architecture (x86_64, i686, ppc, etc.)
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getMachine();



// String getOs
/**********************************************************
 * OS Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public String getOs();



// void setKernel String
/**********************************************************
 * Kernel version Asterisk was built on.
 * 
 * @since ari_0_0_1
 *********************************************************/
 public void setKernel(String val );


}
;
