package com.crowdin.client.core.model;

import lombok.Data;

@Data
public class ResponseObject<T> {
    private T data;

    public static <T> ResponseObject<T> of(T data) {
        ResponseObject<T> responseObject = new ResponseObject<T>();
        responseObject.setData(data);
        return responseObject;
    }
}
