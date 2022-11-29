package enums;

public enum Delimeter {
    COMMA(","), HIPEN("-");

    private final String value;

    Delimeter(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
