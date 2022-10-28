package Task1;

import java.time.LocalDateTime;

public class Pasanger {
    private String name;
    private LocalDateTime time;

    public Pasanger(String name, LocalDateTime time) {
        this.name = name;
        this.time = time;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public String getName() {
        return name;
    }
}