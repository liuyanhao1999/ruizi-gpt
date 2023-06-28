package gpt.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GPTResponse {

    @JsonProperty(value = "id")
    private String id;

    @JsonProperty(value = "object")
    private String object;

    @JsonProperty(value = "created")
    private long created;

    @JsonProperty(value = "choices")
    private List<Choice> choice;

    @JsonProperty(value = "usage")
    private Usage usage;

}
