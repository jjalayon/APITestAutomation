package com.test.automation.api.response;

import lombok.Data;

@Data
public class ResponseContainer {

    private long CategoryId;
    private String Path;
    private String Name;
    private String CanRelist;
    private String CanListClassifieds;
    private String LegalNotice;
    private int DefaultDuration;
    private int[] AllowedDurations;
    private Promotions[] Promotions;
}
