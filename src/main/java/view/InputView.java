package view;

import domain.Car;
import domain.Cars;
import enums.ViewMessage;
import util.ValidationUtil;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    public static Cars readRacingCars(BufferedReader input) throws IOException {
        printMessage(ViewMessage.INPUT_RACING_CAR_NAME_MESSAGE);
        List<String> cars = ValidationUtil.getCars(input.readLine());
        return mapCars(cars);
    }

    private static Cars mapCars(List<String> cars) {
        List<Car> result = new ArrayList<>();
        for (String car : cars) {
            result.add(new Car(car));
        }
        return new Cars(result);
    }

    public static int readTryCount(BufferedReader input) throws IOException {
        printMessage(ViewMessage.INPUT_TRY_COUNT_MESSAGE);
        return Integer.parseInt(input.readLine());
    }

    private static void printMessage(ViewMessage message) {
        System.out.println(message.getValue());
    }
}
