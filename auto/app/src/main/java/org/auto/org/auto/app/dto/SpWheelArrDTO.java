package org.auto.org.auto.app.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import lombok.Data;

import java.util.UUID;

@Data
public class SpWheelArrDTO {
    @JsonProperty("id")
    private UUID id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cntWheel")
    private int cntWheel;
}
