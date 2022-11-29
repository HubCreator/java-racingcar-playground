package domain;

public class RacingGame {
    private final Cars cars;

    public RacingGame(Cars cars) {
        this.cars = cars;
    }

    public String play() {
        return cars.move();
    }

    public Cars getWinner() {
        return cars.getWinner();
    }

    public Cars getCurrentStatus() {
        return cars;
    }
}
