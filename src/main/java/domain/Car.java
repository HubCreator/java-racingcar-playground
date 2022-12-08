package domain;

import enums.ConstVariable;
import strategy.MoveStrategy;

import java.text.MessageFormat;

public class Car {
    private static final String MESSAGE_FORMAT = "{0} : {1}\n";

    private final Name name;
    private Position position;

    public Car(String name) {
        this.name = new Name(name);
        position = new Position();
    }

    public void move(MoveStrategy strategy) {
        if (strategy.movable()) {
            position.moveForward();
        }
    }

    public void move(int randomNumber) {
        if (randomNumber > ConstVariable.MOVE_FORWARD_LIMITATION.getValue()) {
            position.moveForward();
        }
    }

    public Position greaterPosition(Position maxPosition) {
        return position.isGreaterThan(maxPosition);
    }

    public String printStatus() {
        return MessageFormat.format(MESSAGE_FORMAT, name.toString(), position.toString());
    }

    @Override
    public String toString() {
        return name.toString();
    }

    public boolean isWinner(Position maxPosition) {
        return this.position.equals(maxPosition);
    }
}
