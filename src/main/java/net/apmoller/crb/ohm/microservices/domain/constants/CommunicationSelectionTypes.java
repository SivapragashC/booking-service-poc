package net.apmoller.crb.ohm.microservices.domain.constants;

import java.util.HashMap;
import java.util.Map;

public enum CommunicationSelectionTypes {

    EMAIL("Email"), FAX("Fax"), EDI("EDI"), PRINT("Print"), EBL("EBL"), WEB("WEB"), SYSTEM("System"),
    NO_SYSTEM("No system"), DONT_SEND("Don't Send"), FACSIMILE("Facsimile"), AS_SALES_CHANNEL("As Sales Channel"),
    TEL("Telephone");

    private final String commSelection;

    CommunicationSelectionTypes(String commSelection) {
        this.commSelection = commSelection;
    }

    public String getSelectionTypes() {
        return this.commSelection;
    }

    private static final Map<String, CommunicationSelectionTypes> map;
    static {
        map = new HashMap<>();
        for (CommunicationSelectionTypes v : CommunicationSelectionTypes.values()) {
            map.put(v.commSelection, v);
        }
    }

    public static CommunicationSelectionTypes findByLabel(String label) {
        return map.get(label);
    }
}
