package enums;

public enum Delimiter {
    COMMA(",", "쉼표"), HYPHEN("-", "하이픈");

    private final String value;
    private final String information;

    Delimiter(String value, String information) {
        this.value = value;
        this.information = information;
    }

    public String getValue() {
        return value;
    }

    public String getInformation() {
        return information;
    }
}
