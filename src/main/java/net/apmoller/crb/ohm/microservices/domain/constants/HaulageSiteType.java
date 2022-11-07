package net.apmoller.crb.ohm.microservices.domain.constants;

public enum HaulageSiteType {
    FULL_CONTAINER_DETAILS("6"), ACT_EMPTY_CONTAINER_DETAILS("8"), CARGO_DELIVERY_DETAILS("2"),
    EMPTY_CONTAINER_DETAILS("4"), INTERIM_PICKUP_LOCATION("5"), INTERIM_DELIVERY_LOCATION("6");

    private final String value;

    public String getValue() {
        return this.value;
    }

    HaulageSiteType(String value) {
        this.value = value;
    }
}
