package vn.com.rfim_api_spring.services.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultResponse {
   public String message;
   public Object data;

    public ResultResponse() {
    }

    public ResultResponse(String message, Object data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}

