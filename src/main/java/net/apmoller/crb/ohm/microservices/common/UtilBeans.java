package net.apmoller.crb.ohm.microservices.common;

import java.util.Objects;

import org.modelmapper.ModelMapper;

public class UtilBeans {

	private static ModelMapper mapper;
	
	public static ModelMapper getModelMapper() {
		if (Objects.isNull(mapper)) {
			synchronized (UtilBeans.class) {
				if (Objects.isNull(mapper)) {
					mapper = new ModelMapper();
				}
			}
		}
		return mapper;
	}  
}
