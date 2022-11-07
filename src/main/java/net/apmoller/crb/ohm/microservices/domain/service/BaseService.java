package net.apmoller.crb.ohm.microservices.domain.service;

import net.apmoller.crb.ohm.microservices.common.abstraction.Service;
import net.apmoller.crb.ohm.microservices.common.bean.Operations;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.Getter;

@Getter
public abstract class BaseService implements Service {

    @Autowired
    private Operations ops;
}
