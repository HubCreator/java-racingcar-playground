package enums;

public enum Delimiter {
    COMMA(","), HYPHEN("-");

    private final String value;

    Delimiter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
