package net.apmoller.crb.ohm.microservices.domain.constants;

public enum HaulageSiteSequence {
    FULL_CONTAINER_DETAILS(9999), ACT_EMPTY_CONTAINER_DETAILS(1), CARGO_DELIVERY_DETAILS(null),
    EMPTY_CONTAINER_DETAILS(0);

    private final Integer value;

    public Integer getValue() {
        return this.value;
    }

    HaulageSiteSequence(Integer value) {
        this.value = value;
    }
}
