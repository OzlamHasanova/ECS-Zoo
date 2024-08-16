package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Zookeeper> zookeepers=new ArrayList<>();

    public List<Zookeeper> getZookeepers() {
        return zookeepers;
    }

    public void setZookeepers(List<Zookeeper> zookeepers) {
        this.zookeepers = zookeepers;
    }
}
