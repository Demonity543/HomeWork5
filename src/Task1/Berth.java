package Task1;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Berth {
    private static final Random rand = new Random();
    private int passengers = 1 + rand.nextInt(5);
    private Map<String, List<BoatEvent>> history = new HashMap<>();

    class BoatEvent {
        public BoatEvent(Boat boat2, LocalTime arrival) {
            this.boat = boat2;
            this.arrival = arrival;
        }

        private Boat boat;
        private LocalTime arrival;
        private LocalTime departure;

        public void setDeparture(LocalTime now) {
            this.arrival = now;
        }
    }

    public void arrival(Boat boat) {
        int passengers;
        if (boat.getPassangers() > 0) {
            passengers = rand.nextInt(boat.getPassangers());
            boat.removePassenger(passengers);
            this.passengers += passengers;

        }
        passengers = boat.getCapacity() - boat.getCapacity();
        if (boat.getFreeCapacity() > this.passengers) {
            boat.addPassenger(this.passengers);
            this.passengers = 0;
        } else {
            int freeCapacity = boat.getFreeCapacity();
            this.passengers -= freeCapacity;
            boat.addPassenger(freeCapacity);
        }
        BoatEvent event = new BoatEvent(boat, LocalTime.now());
        history.computeIfAbsent(boat.getNumber(), b -> new ArrayList()).add(event);
    }

    public void departure(Boat boat) {
        List<BoatEvent> boats = history.get(boat.getNumber());
        boats.get(boats.size() - 1).setDeparture(LocalTime.now());
    }

    @Override
    public String toString() {
        return "Berth{" + "passaengers = " + passengers + "}";
    }
}
