package net.apmoller.crb.ohm.microservices.domain.constants;

public enum DocumentProcBehaviourTypes {

    PORT("1"), SCV("2"), DIRECT("3"), DISALLOW("10"), ALLOW_EXCEPT_FOR_ORIGINALS("11"), ALLOW("12"),
    ARRIVAL_NOTICE("21"), BOOKING_CONFIRMATION("22"), EQUIPMENT_RELEASE_ORDER("23"), MANIFEST("24"),
    SPECIAL_CARGO_ACCEPTANCE_REQUEST("25"), TPDOC_NEGOTIABLE_RECEIVED_FOR_SHIPMENT("26"),
    TPDOC_SEA_WAYBILL_RECEIVED_FOR_SHIPMENT("27"), TPDOC_NEGOTIABLE_SHIPPED_ON_BOARD("28"),
    TPDOC_SEA_WAYBILL_SHIPPED_ON_BOARD("29"), COPARN_MESSAGE("30"), COUNTER_ISSUE("31"), COREOR_MESSAGE("32"),
    OPERATIONAL_SHIPMENT("33"), INBOUND("41"), OUTBOUND("42"), PRINT_ISSUE("51"), FAX_ISSUE("52"), EMAIL_ISSUE("53"),
    EDI_ISSUE("54"), SYSTEM_ISSUE("55"), WEB_ISSUE("56"), DONT_SEND_ISSUE("57"), SALES_CHANNEL_ISSUE("112"),
    PRINT_DRAFT("61"), FAX_DRAFT("62"), EMAIL_DRAFT("63"), EDI_DRAFT("64"), SYSTEM_DRAFT("65"), WEB_DRAFT("66"),
    DONT_SEND_DRAFT("67"), SALES_CHANNEL_DRAFT("113"), REEFER("71"), DANGEROUS("72"), BREAK_BULK("73"), OOG("74"),
    PRINT("81"), FAX("82"), EMAIL("83"), EDI("84"), SYSTEM("85"), WEB("86"), DONT_SEND("87"), SALES_CHANNEL("114"),
    EQUIPMENT("91"), SHIPMENT("92"), TPDOC("93"), SHIPMENT_CLASS_STANDARD("101"), SHIPMENT_CLASS_VSA("102"),
    SHIPMENT_CLASS_MILITARY("103"), PROCESS_HOUSE_DOCUMENTS("111"), PRICE_SPECIFICATION("115");

    private final String docProcBehType;

    DocumentProcBehaviourTypes(String docProcBehType) {
        this.docProcBehType = docProcBehType;
    }

    public String getDocProcBehaType() {
        return this.docProcBehType;
    }

}