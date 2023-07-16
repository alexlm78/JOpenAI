package dev.kreaker.jopenai;

import java.io.Serializable;
import lombok.Data;

@Data
public class Choice implements Serializable {

    private Integer index;
    private Message message;
    private String finishReason;

}