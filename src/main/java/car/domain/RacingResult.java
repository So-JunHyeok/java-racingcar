package car.domain;

import car.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class RacingResult {

    private int max = 0;

    private List<String> winnerCars;


    public RacingResult(List<Car> cars) {
        winnerCars = new ArrayList<>();
        racingMaxPosition(cars);
        winnerConfirm(cars);
    }

    private void setMax(int carPosition) {
        if (carPosition >= this.max) {
            this.max = carPosition;
        }
    }
    public void racingMaxPosition(List<Car> cars) {
        for (Car car : cars) {
            setMax(car.getPosition());
        }
    }

    private void addWinnerCar(Car car){
        if(car.getPosition() == this.max){
            this.winnerCars.add(car.getName());
        }
    }

    public void winnerConfirm(List<Car> cars){
        for (Car car : cars) {
            addWinnerCar(car);
        }
    }

    public List<String> getWinnerCarsName(){
        return this.winnerCars;
    }
}