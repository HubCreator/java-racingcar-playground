package domain;

public class Position {
    public static final int START_INDEX = 0;

    int position = START_INDEX;

    public void moveForward() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
