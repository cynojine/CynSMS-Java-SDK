/*
 * CynSMSAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.cynojine.sms.models;

import java.util.*;

public class GetBALANCECHECKInputBuilder {
    //the instance to build
    private GetBALANCECHECKInput getBALANCECHECKInput;

    /**
     * Default constructor to initialize the instance
     */
    public GetBALANCECHECKInputBuilder() {
        getBALANCECHECKInput = new GetBALANCECHECKInput();
    }

    /**
     * Get your account balance
     */
    public GetBALANCECHECKInputBuilder apiKey(String apiKey) {
        getBALANCECHECKInput.setApiKey(apiKey);
        return this;
    }

    /**
     * Json Responce
     */
    public GetBALANCECHECKInputBuilder response(String response) {
        getBALANCECHECKInput.setResponse(response);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public GetBALANCECHECKInput build() {
        return getBALANCECHECKInput;
    }
}