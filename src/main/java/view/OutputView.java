package view;

import domain.Cars;
import domain.Name;
import enums.ViewMessage;

import java.text.MessageFormat;


public class OutputView {
    public static void printStatus(String cars) {
        print(cars);
    }

    public static void printResult(Cars currentStatus, Cars winner) {
        print(currentStatus.toString());
        String result = MessageFormat.format(ViewMessage.RESULT_WHOS_WIN.getValue(), Name.getWinnerName(winner));
        print(result);
    }

    public static void print(String message) {
        System.out.println(message);
    }
    public static void print(ViewMessage message) {
        print(message.getValue());
    }
}
