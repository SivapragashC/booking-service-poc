package net.apmoller.crb.ohm.microservices.common.model;


import lombok.*;

import java.util.HashMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConnectionConfig {
    private String host;
    private HashMap<String,String> path;
    private String version;
    private String xcdVersion;
    private Long backOffTime;
    private Integer readTimeout;
    private Integer connectionTimeout;
    private FallbackConfig fallbackConfig;

    @Getter
    @Setter
    public static class FallbackConfig {
        private String host;
        private HashMap<String, String> path;
        private boolean enabled;
    }
}
