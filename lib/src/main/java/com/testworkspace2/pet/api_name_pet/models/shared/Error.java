/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.testworkspace2.pet.api_name_pet.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Error {
    @JsonProperty("code")
    public Integer code;

    public Error withCode(Integer code) {
        this.code = code;
        return this;
    }
    
    @JsonProperty("message")
    public String message;

    public Error withMessage(String message) {
        this.message = message;
        return this;
    }
    
    public Error(@JsonProperty("code") Integer code, @JsonProperty("message") String message) {
        this.code = code;
        this.message = message;
  }
}
