package net.apmoller.crb.ohm.microservices.domain.constants;

public class HaulageOrderConstants {

    public final static String HAULAGE_ARRANGEMENT_TYPE_MERCHANT = "Merchant";

    public final static String HAULAGE_ARRANGEMENT_TYPE_CARRIER = "Carrier";

    public final static String CARRIER_CODE_MAEU = "MAEU";

    public final static String QUESTION_MARK = "?";

    public final static String RECEIPT_DELIVERY_MODE_CY = "1";

    public final static String RECEIPT_DELIVERY_MODE_CFS = "2";

    public final static String RECEIPT_DELIVERY_MODE_STORE_DOOR = "4";

    public final static String DATE_TIME_FORMAT = "yyyy-MM-dd HH.mm.ss";

    public final static Long IMPORT_FULL_DEPOT_SEQUENCE_NO = 0L;

    public final static Long IMPORT_EMPTY_CONTAINER_DEPOT_SEQUENCE_NO = 9999L;

    public final static String HAULAGE_SITE_TYPE_FULL_EQUIPMENT_PICKUP_TERMINAL = "6";

    public final static String HAULAGE_SITE_TYPE_ACTUAL_EMPTY_CONTAINER_RETURN = "8";

    public final static String HAULAGE_SITE_TYPE_EMPTY_CONTAINER_RETURN = "4";

    public final static String HAULAGE_SITE_TYPE_CARGO_DELIVERY = "2";

    public final static String UNIQUE_ID_GENERATOR_NAME = "instance_id_generator";
    public final static String UNIQUE_ID_GENERATOR_STRATEGY = "net.apmoller.crb.ohm.microservices.haulage.utilities.InstanceIdGenerator";
    public final static String RAISE_MERCHANT_ON_SD_BOOKING_NOTIFICATION_TITLE = "Amend Import Inland Haulage Rate";
    public final static String RAISE_CARRIER_ON_CY_BOOKING_NOTIFICATION_TITLE = "Specify Import Inland Haulage Rate";

    public final static String REVIEW_NOTIFICATION_DOCUMENTATION_ID = "1000000000076";

    public final static String TASK_STATUS_CLOSED = "4"; // to be confirmed

    public final static String TASK_STATUS_OPEN = "2"; // to be confirmed
    public final static String LBS = "US LBS";

    public final static String KGS = "US KGS";

    public final static String LBS_UNIT_ID = "1";
    public final static String KGS_UNIT_ID = "2";

    public final static String BOOL_YES = "Y";

    public final static String GEOGRAPHIC_AREA_GEO_AREA_TYPE_NAME_CITY = "CITY";

    public final static String GEOGRAPHIC_AREA_GEO_AREA_TYPE_NAME_STATE = "STATE";

    public final static String GEOGRAPHIC_AREA_GEO_AREA_TYPE_NAME_COUNTRY = "COUNTRY";

    public final static String TPDOC_RELEASE_TO_PARTY_ROLE_TYPE = "31";

    public final static String ARRANGE_CARGO_RELEASE_ID = "1000000000073"; // to be confirmed

    public final static String DB_YES = "Y";

    public final static String PARTY_ROLE_TYPE_IMPORT_DEMURRAGE_DEAL_OWNER = "42";

    public final static String MILITARY_CARGO = "6";

    public final static String VSA_SHIPMENT = "5";

    public final static String ORDINARY_TRANSPORT_ORDER = "3";

    public final static String BOOKING_BILL_OF_LADING = "1";

    public final static String PRELIMINARY_SHIPMENT = "7";

    public final static String RECEIPT_DELIVERY_MODE_CY_NAME = "CY";
    public final static String RECEIPT_DELIVERY_MODE_CFS_NAME = "CFS";
    public final static String RECEIPT_DELIVERY_MODE_BB_NAME = "BB";
    public final static String RECEIPT_DELIVERY_MODE_SD_NAME = "SD";
    public final static String RECEIPT_DELIVERY_MODE_CC_NAME = "CC";

    public final static String GEO_AREA_EXTENSION_TYPE_DELIVERY_CITY_RESTRICTIONS = "13";

    public final static String GCSS_FE_DATEFORMAT = "yyyy-MM-dd hh:mm:ss";

    public final static String DOCUMENT_PROC_BEHAVIOUR_ALLOWED_MOCS_FOR_ISSUE = "5";

    public final static String GCSS_MSL_OPERATOR = "1";
    public final static String RECEIPT_DELIVERY_MODE_BREAK_BULK = "3";
    public final static String RECEIPT_DELIVERY_MODE_CC = "5";
    public final static String CN_TYPE_ORGANIZATION = "1";
    public final static int WORD_LENGTH_EIGHT = 8;
    public final static String OPS_TASK_DELIVERY = "DELIVERY";
    public final static String SERVICE_MODE_CARRIER = "SD";
    public final static String OPS_TASK_OUT = "OUT";
    public final static String OPS_ID = "1000000000037";// DEF_DATA_CONST(OPSId, "1000000000037");
    public final static String ENTITY_TYPE_EQUIPMENT_ASSIGNMENT = "302";
    public final static String SHIPMENT_PROPERTY_TYPE_HAULAGE_IMPORT_PIN_NUMBER = "1004";
    public final static String HAULAGE_ORDER_TRANSACTION_TYPE_CANCELLATION = "Cancellation";
    public final static String HAULAGE_ORDER_TRANSACTION_TYPE_ORIGINAL = "Original";
    public final static String HAULAGE_ORDER_TRANSACTION_TYPE_AMENDMENT = "Amendment";
    public final static String HAULAGE_ORDER_REASON_HAULAGE_DEARRANGED = "Container Release Cancelled";
    public final static String HAULAGE_ORDER_REASON_RECEIVER_REMOVED = "Receiver is removed";
    public final static String HAULAGE_ORDER_TRANSACTION_TYPE_RECIPIENT_DEPENDENT = "Recipient Dependent";
    public final static String DOCUMENT_TYPE_HAULAGE_ORDER = "2";

    // This defines the MOC choices within the DPE.
    public static final String COMMUNICATION_SELECTION_EMAIL = "Email";
    public static final String COMMUNICATION_SELECTION_FAX = "Fax";
    public static final String COMMUNICATION_SELECTION_EDI = "EDI";
    public static final String COMMUNICATION_SELECTION_PRINT = "Print";
    public static final String COMMUNICATION_SELECTION_EBL = "EBL";
    public static final String COMMUNICATION_SELECTION_SYSTEM = "System";
    public static final String COMMUNICATION_SELECTION_DONT_SEND = "Don't Send";
    public static final String COMMUNICATION_SELECTION_AS_SALES_CHANNEL = "As Sales Channel";
    public static final String OPERATIONAL_STAGE_IMPORT = "2";

    public static final String COMMUNICATION_MEDIA_TYPE_EMAIL = "1";
    public static final String COMMUNICATION_MEDIA_TYPE_FACSIMILE = "2";
    public static final String COMMUNICATION_MEDIA_TYPE_EDI = "8";
    public static final String COMMUNICATION_MEDIA_TYPE_INTERNET = "10";
    public static final String COMMUNICATION_MEDIA_TYPE_NO_SYSTEM = "12";
    public static final String COMMUNICATION_MEDIA_TYPE_SYSTEM = "13";
    public static final String COMMUNICATION_MEDIA_TYPE_PRINT = "15";
    public static final String COMMUNICATION_MEDIA_TYPE_AS_SALES_CHANNEL = "16";

    public final static String IMPORT_HAULAGE_ORDER_REASON_HAULAGE_ARRANGED = "Haulage details are changed";
    public final static String CONTINGENCY_USER_ID = "CSCS";

    public final static String SHIPMENT_ID = "shipmentId";

    public static final String SHIPMENT_NOTE_TYPE_INTERMODAL = "13";
    public static final String CASE_FALSE = "FALSE";
}
