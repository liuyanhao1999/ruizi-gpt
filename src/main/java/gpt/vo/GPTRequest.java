package gpt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GPTRequest {

    @JsonProperty(value = "model")
    private String model;

    @JsonProperty(value = "messages")
    private MessagesReq[] messages;

    @JsonProperty(value = "functions")
    private Functions[] functions;

    @JsonProperty(value = "function_call")
    private String functionCall;

    @JsonProperty(value = "temperature")
    private double temperature;

    @JsonProperty(value = "top_p")
    private double topP;

    private Integer n;

    private Boolean stream;
}
