package by.itstep.vlad.view.logic;

import by.itstep.vlad.model.abstracts.Transport;

public class GasStation {
    public static int calc(Transport[] transports) {

        int total = 0;

        for (Transport transport: transports) {
            total += transport.getTank();

        }
        return total;
    }
}
