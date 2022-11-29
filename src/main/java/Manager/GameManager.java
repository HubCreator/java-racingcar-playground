package Manager;

import domain.Cars;
import domain.RacingGame;
import enums.ViewMessage;
import view.InputView;
import view.OutputView;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.IntStream;

public class GameManager {
    private RacingGame racingGame;

    public  void run(BufferedReader br) throws IOException {
        Cars cars = InputView.readRacingCars(br);
        int count = InputView.readTryCount(br);
        racingGame = new RacingGame(cars);

        OutputView.print(ViewMessage.RESULT_MESSAGE);
        IntStream
                .range(0, count)
                .forEach(index -> OutputView.printStatus(racingGame.play()));

        OutputView.print(racingGame.getCurrentStatus().toString());
        OutputView.printResult(racingGame.getWinner());
    }
}
