package com.laioffer.job.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.laioffer.job.external.MonkeyLearnClient;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Extraction {

    @JsonProperty("tag_name")
    public String tagName;

    @JsonProperty("parsed_value")
    public String parsedValue;

    public int count;

    public String relevance;
    @JsonIgnoreProperties(ignoreUnknown = true)
    public class ExtractResponseItem {

        public List<Extraction> extractions;
    }


}
