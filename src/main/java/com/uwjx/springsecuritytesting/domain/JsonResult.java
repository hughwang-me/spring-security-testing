package com.uwjx.springsecuritytesting.domain;

import lombok.Data;

@Data
public class JsonResult {

    private Integer code;
    private String message;

    public JsonResult(int i, String toString) {
        this.code = i;
        this.message = toString;
    }
}
