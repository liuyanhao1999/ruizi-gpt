package gpt.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Choice {

    @JsonProperty(value = "index")
    private int index;

    @JsonProperty(value = "message")
    private Message[] messages;

    @JsonProperty(value = "finish_reason")
    private String finishReason;
}
