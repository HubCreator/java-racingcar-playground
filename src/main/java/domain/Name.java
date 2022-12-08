package domain;

import java.util.StringJoiner;

public class Name {
    private final String name;

    public Name(String name) {
        this.name = name;
    }

    public static String getWinnerName(Cars winner) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Car car : winner) {
            joiner.add(car.toString());
        }
        return joiner.toString();
    }

    @Override
    public String toString() {
        return name;
    }
}
