package nttrung.gapptech.net.mylovelyplace.network.pojo;

/**
 * Created by TrungNguyen on 9/11/2017.
 */

public class Geometry {
    public Geometry() {
    }

    private Location location;

    public Geometry(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
