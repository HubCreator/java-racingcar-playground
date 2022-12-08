package domain;

import enums.Delimiter;

import java.util.Objects;
import java.util.stream.IntStream;

public class Position {

    public static final int START_INDEX = 0;

    private int position;

    public Position() {
        this.position = START_INDEX;
    }

    public Position(int position) {
        this.position = position;
    }

    public void moveForward() {
        position++;
    }

    public Position isGreaterThan(Position maxPosition) {
        if (this.position > maxPosition.position) {
            return this;
        }
        return maxPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Position target = (Position) o;
        return position == target.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        IntStream
                .range(0, position)
                .forEach((index) -> result.append(Delimiter.HYPHEN.getValue()));
        return result.toString();
    }
}
