package net.apmoller.crb.ohm.microservices.infrastructure.connector;


import net.apmoller.crb.ohm.microservices.common.abstraction.Connector;
import net.apmoller.crb.ohm.microservices.infrastructure.exception.IntegrationExceptions;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseOrderConnector implements Connector {
    @Autowired
    protected IntegrationExceptions exceptions;
}
