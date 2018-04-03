package nttrung.gapptech.net.mylovelyplace.network.api;

import nttrung.gapptech.net.mylovelyplace.network.pojo.GeocodingRoot;
import nttrung.gapptech.net.mylovelyplace.network.pojo.DirectionRoot;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by TrungNguyen on 9/11/2017.
 */

public interface MapService {

    @GET("geocode/json?")
    Call<GeocodingRoot> getLocationResults(@Query("address") String address,
                                           @Query("key") String key);

    @GET("directions/json?")
    Call<DirectionRoot> getDirectionResults(@Query("origin") String originLatLng,
                                            @Query("destination") String destinationLatLng,
                                            @Query("key") String key);

    @GET("directions/json?")
    Call<DirectionRoot> getDirectionResults(@Query("origin") String originLatLng,
                                            @Query("destination") String destinationLatLng);
}
