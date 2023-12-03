package com.example.consumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Domain class to contain data that im consuming

@JsonIgnoreProperties(ignoreUnknown = true)
public record Quote (String type, Value value){ }
