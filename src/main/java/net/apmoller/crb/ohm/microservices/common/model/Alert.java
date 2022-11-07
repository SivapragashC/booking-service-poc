package net.apmoller.crb.ohm.microservices.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import net.apmoller.crb.ohm.microservices.common.model.enumeration.AlertType;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Alert {
    @EqualsAndHashCode.Exclude
    private AlertType type;

    @EqualsAndHashCode.Include
    private String code;

    @EqualsAndHashCode.Include
    private String message;

    @EqualsAndHashCode.Exclude
    private String messageCode;
}
