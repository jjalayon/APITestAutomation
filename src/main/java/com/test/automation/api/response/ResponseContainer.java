package com.test.automation.api.response;

import lombok.Data;

@Data
public class ResponseContainer {

    private String Name;
    private String CanRelist;
    private Promotions[] Promotions;
}
