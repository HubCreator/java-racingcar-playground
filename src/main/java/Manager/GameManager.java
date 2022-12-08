package Manager;

import domain.Cars;
import domain.RacingGame;
import enums.ViewMessage;
import view.InputView;
import view.OutputView;

import java.io.BufferedReader;
import java.io.IOException;

public final class GameManager {
    private RacingGame racingGame;

    public void run(BufferedReader br) throws IOException {
        Cars cars = InputView.readRacingCars(br);
        int count = InputView.readTryCount(br);
        racingGame = new RacingGame(cars);

        OutputView.print(ViewMessage.RESULT_MESSAGE);
        for (int index = 0; index < count; index++) {
            OutputView.printStatus(racingGame.play());
        }

        OutputView.printResult(racingGame.getCurrentStatus(), racingGame.getWinner());
    }
}
