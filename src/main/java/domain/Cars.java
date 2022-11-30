package domain;


import strategy.RandomMovingStrategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cars implements Iterable<Car>{
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public String move() {
        for (Car car : cars) {
            car.move(new RandomMovingStrategy());
        }
        return this.toString();
    }

    public Cars getWinner() {
        Position maxPosition = getMaxPosition();

        List<Car> entry = new ArrayList<>();
        for (Car car : cars) {
            if (car.isWinner(maxPosition)) {
                entry.add(car);
            }
        }
        return new Cars(entry);
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : cars) {
            maxPosition = car.greaterPosition(maxPosition);
        }
        return maxPosition;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            result.append(car.printStatus());
        }
        return result.toString();
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
