package net.apmoller.crb.ohm.microservices.domain.constants;

public enum RecipientType {

    DIRECT("Direct"), DIRECT_EMAIL("Direct-Email"), DIRECT_FAX("Direct-Fax"), DIRECT_EDI("Direct-EDI"),
    DIRECT_PRINT("Direct-Print"), DIRECT_DONT_SEND("Direct-Do-Not-Send"), DIRECT_EBL("Direct-EBL"), SCV("SCV"),
    PORT("Port"), HAULAGE_SYSTEM("Haulage-System");

    private final String recipientType;

    RecipientType(String recipientType) {
        this.recipientType = recipientType;
    }

    public String getRecipientType() {
        return this.recipientType;
    }

}
