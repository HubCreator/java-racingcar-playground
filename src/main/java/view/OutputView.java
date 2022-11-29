package view;


import domain.Car;
import domain.Cars;
import enums.ViewMessage;

import java.text.MessageFormat;
import java.util.StringJoiner;

public class OutputView {
    public static void printStatus(String cars) {
        System.out.println(cars);
    }


    public static void printResult(Cars winner) {
        StringJoiner joiner = new StringJoiner(", ");
        for (Car car : winner) {
            joiner.add(car.getName());
        }
        String result = MessageFormat.format(ViewMessage.RESULT_WHOS_WIN.getValue(), joiner);
        System.out.println(result);
    }
}
