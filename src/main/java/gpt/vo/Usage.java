package gpt.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usage {

    @JsonProperty(value = "prompt_tokens")
    private long promptTokens;

    @JsonProperty(value = "completion_tokens")
    private long completionTokens;

    @JsonProperty(value = "total_tokens")
    private long totalTokens;
}
