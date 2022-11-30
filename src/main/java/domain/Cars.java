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
        List<Car> entry = new ArrayList<>();
        int maxPosition = getMaxPosition();

        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                entry.add(car);
            }
        }
        return new Cars(entry);
    }

    private int getMaxPosition() {
        int max = 0;
        for (Car car : cars) {
            max = Math.max(max, car.getPosition());
        }
        return max;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            result.append(car.toString());
        }
        return result.toString();
    }

    @Override
    public Iterator<Car> iterator() {
        return cars.iterator();
    }
}
