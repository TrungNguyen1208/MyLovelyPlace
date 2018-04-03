package nttrung.gapptech.net.mylovelyplace.network.pojo;

import java.util.List;

/**
 * Created by TrungNguyen on 9/11/2017.
 */

public class GeocodingRoot {
    private List<Result> results;
    private String status;

    public GeocodingRoot() {
    }

    public GeocodingRoot(List<Result> results, String status) {
        this.results = results;
        this.status = status;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
