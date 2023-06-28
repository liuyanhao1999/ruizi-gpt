package gpt.vo;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessagesReq {

    @JsonProperty(value = "role")
    private String role;

    @JsonProperty(value = "content")
    private String content;

    @JsonProperty(value = "name")
    private String name;

    @JsonProperty(value = "functions_all")
    private JSONObject functionsAll;
}
