package domain;

import java.util.List;

public class RacingGame {

    public List<Car> tryMove(List<Car> cars) {
        for (Car car : cars) {
            car.move(Rule.makeRandomNumber());
        }
        return cars;
    }
}
