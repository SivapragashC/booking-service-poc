package net.apmoller.crb.ohm.microservices.domain.constants;

public enum DocumentPropertiesConstants {
    GDS_DOWNLOAD_FLAG_YES("Yes"), GDS_DOWNLOAD_FLAG_NO("No"), REQUEST_TYPE_DRAFT("Draft"), REQUEST_TYPE_ISSUE("Issue"),
    KIND_SCV("scv"), KIND_DIRECT("direct"), KIND_PORT("port"), CENTRICITY_SHIPMENT("SHIPMENT"),
    CENTRICITY_TRANSPORT_DOC("TRANSPORT_DOCUMENT"), ARCHIVE_PROP("ARCHIVE_DOC_ID"), SHIPMENT_ENTITY_REF_TYPE("1"),
    TPDOC_ENTITY_REF_TYPE("5"), HOUSE_TPDOC_ENTITY_REF_TYPE("174");

    private final String documentProperties;

    DocumentPropertiesConstants(String documentProperties) {
        this.documentProperties = documentProperties;
    }

    public String getDocumentProperties() {
        return this.documentProperties;
    }
}
