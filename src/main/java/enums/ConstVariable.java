package enums;

public enum ConstVariable {
    MAX_LENGTH(5), MOVE_FORWARD_LIMITATION(4), RANDOM_NUMBER_RANGE(10);

    private final int value;

    ConstVariable(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
