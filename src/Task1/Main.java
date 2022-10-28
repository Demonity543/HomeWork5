package Task1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Boat boat = new Boat("R-101", 10 + rand.nextInt(20));
        Berth beath = new Berth();
        beath.arrival(boat);

        System.out.println(beath);
        System.out.println(boat);
    }
}
