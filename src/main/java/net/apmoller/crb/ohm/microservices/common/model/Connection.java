package net.apmoller.crb.ohm.microservices.common.model;

import lombok.Builder;
import lombok.Getter;
import org.springframework.web.reactive.function.client.WebClient;

@Getter
@Builder
public class Connection {
    private WebClient webClient;
    private WebClient fallbackClient;
    private ConnectionConfig connectionConfig;
}
