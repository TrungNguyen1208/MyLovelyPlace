package nttrung.gapptech.net.mylovelyplace.network.pojo;

/**
 * Created by TrungNguyen on 9/11/2017.
 */

public class Result {
    private Geometry geometry;

    public Result() {
    }

    public Result(Geometry geometry) {
        this.geometry = geometry;
    }

    public Geometry getGeometry() {
        return geometry;
    }

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }
}
