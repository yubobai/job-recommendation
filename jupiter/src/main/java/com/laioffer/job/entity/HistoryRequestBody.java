package com.laioffer.job.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.laioffer.job.external.Item;

public class HistoryRequestBody {

    @JsonProperty("user_id")
    public String userId;
    //一模一样 所以不用写
    public Item favorite;
}

