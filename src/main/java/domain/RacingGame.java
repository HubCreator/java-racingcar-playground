package domain;


import enums.ViewMessage;
import view.OutputView;

import java.util.stream.IntStream;

public class RacingGame {

    public static void run(Cars cars, int count) {
        IntStream
                .range(0, count)
                .forEach(index -> OutputView.printStatus(cars.move()));

        Cars winner = cars.getWinner();
        OutputView.printResult(winner);
    }
}
