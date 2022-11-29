package Manager;

import domain.Cars;
import domain.RacingGame;
import view.InputView;
import view.OutputView;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class GameManager {
    private static RacingGame racingGame;

    public static void run(BufferedReader br) throws IOException {
        Cars cars = InputView.readRacingCars(br);
        int count = InputView.readTryCount(br);
        racingGame = new RacingGame(cars);

        IntStream
                .range(0, count)
                .forEach(index -> OutputView.printStatus(racingGame.play()));

        OutputView.print(racingGame.getCurrentStatus().toString());
        OutputView.printResult(racingGame.getWinner());
    }
}
