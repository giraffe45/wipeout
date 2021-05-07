package htw.berlin.wipeout.rest;

public class SurfSpot {
    static private long id=1;
    private final String name;

    public SurfSpot(String name) {
        id++;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
