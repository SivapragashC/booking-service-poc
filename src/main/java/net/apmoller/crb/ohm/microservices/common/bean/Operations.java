package net.apmoller.crb.ohm.microservices.common.bean;

import java.util.Map;

import net.apmoller.crb.ohm.microservices.common.abstraction.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;


/**
 * This class is a factory class which will return corresponding object based on class name
 */
@Component
@NoArgsConstructor
@Order(0)
public class Operations {
    @Autowired
    private Map<String, Mapper> mapperMap;

    @Autowired
    private Map<String, Validator> validatorMap;

    @Autowired
    private Map<String, Service> serviceMap;

    @Autowired
    private Map<String, Connector> connectorMap;

    @Autowired
    private Map<String, Integrator> integratorMap;

    public <V extends Validator> V validator(Class<V> validatorClass) {

        return validatorClass.cast(validatorMap.get(extractName(validatorClass)));
    }

    public <C extends Service> C service(Class<C> serviceClass) {

        return serviceClass.cast(serviceMap.get(extractName(serviceClass)));
    }

    public <M extends Mapper> M mapper(Class<M> aClass) {
        return aClass.cast(mapperMap.get(extractName(aClass)));
    }

    public <M extends Connector> M connector(Class<M> aClass) {
        return aClass.cast(connectorMap.get(extractName(aClass)));
    }

    public <M extends Integrator> M integrator(Class<M> aClass) {
        return aClass.cast(integratorMap.get(extractName(aClass)));
    }

    private String extractName(Class<?> clazz) {
        String className = clazz.getSimpleName();
        if (Character.isUpperCase(className.charAt(1))) {
            return className;
        }
        return StringUtils.uncapitalize(className);
    }

}
