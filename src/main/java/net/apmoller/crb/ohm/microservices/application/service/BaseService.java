package net.apmoller.crb.ohm.microservices.application.service;

import lombok.Getter;
import net.apmoller.crb.ohm.microservices.common.abstraction.Service;
import net.apmoller.crb.ohm.microservices.common.bean.Operations;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseService implements Service {
    @Autowired
    @Getter
    public Operations ops;
}
