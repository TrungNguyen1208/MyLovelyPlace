package nttrung.gapptech.net.mylovelyplace.model;

import java.io.Serializable;

/**
 * Created by TrungNguyen on 8/6/2017.
 */

public class Category implements Serializable{
    private String id;
    private String name;

    public Category() {
    }

    public Category(String name) {
        this.name = name;
    }

    public Category(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
