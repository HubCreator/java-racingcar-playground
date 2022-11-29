package view;


import domain.Car;
import domain.Cars;
import enums.ViewMessage;

import java.text.MessageFormat;
import java.util.StringJoiner;


public class OutputView {
    public static void printStatus(String cars) {
        print(cars);
    }


    public static void printResult(Cars winner) {
        print(ViewMessage.RESULT_MESSAGE);
        StringJoiner joiner = new StringJoiner(", ");
        for (Car car : winner) {
            joiner.add(car.getName());
        }
        String result = MessageFormat.format(ViewMessage.RESULT_WHOS_WIN.getValue(), joiner);
        print(result);
    }

    public static void print(String message) {
        System.out.println(message);
    }
    public static void print(ViewMessage message) {
        print(message.getValue());
    }
}
