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
 * The value of a channel variable
 * 
 * Defined in file: asterisk.json
 *********************************************************/

public class Variable_impl_ari_0_0_1 implements Variable, java.io.Serializable {
private static final long serialVersionUID = 1L;
  /**  The value of the variable requested  */
  private String value;
 public String getValue() {
   return value;
 }

 @JsonDeserialize( as=String.class )
 public void setValue(String val ) {
   value = val;
 }

/** No missing signatures from interface */
}

