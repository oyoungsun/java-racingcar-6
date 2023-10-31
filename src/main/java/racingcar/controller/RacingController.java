package racingcar.controller;

import racingcar.model.Information;
import racingcar.model.RacingCar;
import racingcar.model.RacingCars;

import java.util.ArrayList;
import java.util.List;

public class RacingController {
    public final RacingCars racingCars;
    public final int times;
    public RacingController(Information information){
        racingCars = init(information.getNames());
        this.times = information.getTimes();
    }

    private RacingCars init(List<String> names) {
        List<RacingCar> racingCars = new ArrayList<>();
        for(String name : names){
            racingCars.add(RacingCar.from(name));
        }
        return RacingCars.from(racingCars);
    }

    public void go() {
    }
}
