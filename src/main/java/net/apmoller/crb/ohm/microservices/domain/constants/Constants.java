package net.apmoller.crb.ohm.microservices.domain.constants;

public class Constants {

    public static String HEADER_CORRELATION_ID = "X-Correlation-ID";
    public static String HEADER_TENANT_ID = "X-Tenant-ID";
    public static String HEADER_USER_ID = "X-User-ID";
    public static String HEADER_PROFILE_ID = "X-Profile-ID";

    // Event constants
    public static String EVENT_OK = "blIssueHaulageOrderCompletedOKEvent";
    public static String FAILURE_EVENT = "NOTIFICATION";
    public static String NOTIFICATION_EVENT_NAME = "NOTIFICATION";

    // Service constants
    public static String ORIGIN_SERVICE_NAME = "GX4HAREHEIMCR10";
    public static String ORIGIN_SECURITY_STRING = "GCSS_Export.190_1_DocumentProcessingSubmit;EXECUTE";

    // DB No or Yes value
    public static String NO = "N";
    public static String YES = "Y";

    public static String FE_RESP_SUCESS = "0";
    public static String FE_RESP_FAIL = "1";
    public static String COMMA = ",";
    
    public static String TAR_FREIGHT_CHARGE_DISPUTE = "Freight charges under dispute";
    public static String TAR_PARTIAL_PAYMENT_RECEIVED = "Partial payment received, balance approved for credit";
    public static String TAR_PAYMENT_PROCESSING_PENDING = "Payment received, processing pending";
    public static String TAR_OTHERS = "Other";
}
