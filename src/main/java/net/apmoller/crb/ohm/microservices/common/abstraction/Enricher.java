package net.apmoller.crb.ohm.microservices.common.abstraction;

import java.util.function.BiFunction;

public interface Enricher<T,U,R> extends BiFunction<T,U,R> {
}
