package com.test.automation.api.response;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
@Data
public class Promotions {

    @SerializedName("Id")
    private int id;
    @SerializedName("Name")
    private String name;
    @SerializedName("Description")
    private String description;
    @SerializedName("Price")
    private int price;
    @SerializedName("MinimumPhotoCount")
    private int minphotocount;
}
