import domain.Cars;
import domain.RacingGame;
import view.InputView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Cars cars = InputView.readRacingCars(br.readLine());
        int count = InputView.readTryCount(br.readLine());
        RacingGame.run(cars, count);
    }
}
