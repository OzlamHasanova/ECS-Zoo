package model.entity;

import model.enums.ZookeeperTypeEnum;

public class Zookeeper {
    private ZookeeperTypeEnum type;

    public Zookeeper(ZookeeperTypeEnum type) {
        this.type = type;
    }
}
