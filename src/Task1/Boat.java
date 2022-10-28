package Task1;

public class Boat {
    private String number;
    private int passengers;
    private int capacity;

    public Boat(String number, int capacity) {
        this.capacity = capacity;
        this.number = number;
    }

    public boolean addPassenger(int count) {
        if (passengers + count <= capacity) {
            passengers += count;
            return true;
        }
        return false;
    }

    public int getFreeCapacity() {
        return this.capacity - passengers;
    }

    public void removePassenger(int count) {
        passengers = passengers - count < 0 ? 0 : passengers - count;
    }

    public String getNumber() {
        return number;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassangers() {
        return this.passengers;
    }

    @Override
    public String toString() {
        return "Boat number " + getNumber() + " passangers {" + getPassangers() + "} capacity {" + getFreeCapacity()
                + "}";
    }
}
