/*
 * CynSMSAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.cynojine.sms.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class GetBALANCECHECKInput 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4141187220114827267L;
    private String apiKey;
    private String response = "json";
    /** GETTER
     * Get your account balance
     */
    @JsonGetter("api_key")
    public String getApiKey ( ) { 
        return this.apiKey;
    }
    
    /** SETTER
     * Get your account balance
     */
    @JsonSetter("api_key")
    public void setApiKey (String value) { 
        this.apiKey = value;
    }
 
    /** GETTER
     * Json Responce
     */
    @JsonGetter("response")
    public String getResponse ( ) { 
        return this.response;
    }
    
    /** SETTER
     * Json Responce
     */
    @JsonSetter("response")
    public void setResponse (String value) { 
        this.response = value;
    }
 
}
