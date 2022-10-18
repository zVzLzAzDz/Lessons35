package by.itstep.vlad.controller;

import by.itstep.vlad.model.abstracts.Car;
import by.itstep.vlad.model.abstracts.Transport;
import by.itstep.vlad.model.abstracts.Truck;
import by.itstep.vlad.model.abstracts.bus;
import by.itstep.vlad.view.logic.GasStation;

public class Main {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5};
//        Car car1 = new Car();
//        Car car2 = new Car();
//        bus bus1 = new bus();
//        bus bus2 = new bus();
//        bus bus3 = new bus();
//
//        Transport[] transports = {car1,car2, bus1, bus2, bus3};

        Transport[] transports = {new Car(50), new Car(40), new bus(110), new bus(200), new bus(300), new Truck(500)};


        int total = GasStation.calc(transports);
        System.out.println("Total oil: " + total);
    }
}
