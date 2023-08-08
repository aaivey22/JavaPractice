package anotherPack;

import com.example.lib.Car;

public class Test {
    public void justTesting() {
        Car yellowCar = new Car(70,2024);
        yellowCar.speed = 80;

        yellowCar.accelerate();
    }
}
