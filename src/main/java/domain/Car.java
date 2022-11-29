package domain;

import enums.ConstVariable;
import enums.Delimiter;

import java.text.MessageFormat;
import java.util.stream.IntStream;

public class Car {
    private static final String MESSAGE_FORMAT = "{0} : {1}\n";

    private final String name;
    private Position position;

    public Car(String name) {
        this.name = name;
        position = new Position();
    }

    public void move(int randomNumber) {
        if (randomNumber > ConstVariable.MOVE_FORWARD_LIMITATION.getValue()) {
            position.moveForward();
        }
    }

    public int getPosition() {
        return position.getPosition();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        IntStream
                .range(0, position.getPosition())
                .forEach((index) -> result.append(Delimiter.HYPHEN.getValue()));
        return MessageFormat.format(MESSAGE_FORMAT, name, result.toString());
    }
}
