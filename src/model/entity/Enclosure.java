package model.entity;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private Integer number;
    private List<Animal> animals;
    private List<Zookeeper> zookeepers;
    private List<FoodStore> foodList;
    private int waste;

    public Enclosure(Integer number, List<Animal> animals, List<Zookeeper> zookeepers, List<FoodStore> foodList, int waste) {
        this.number = number;
        this.animals = animals;
        this.zookeepers = zookeepers;
        this.foodList = foodList;
        this.waste = waste;
    }

    public Integer getNumber() {
        return number;
    }

    public void setId(Integer number) {
        this.number = number;
    }

    public List<Zookeeper> getZookeepers() {
        return zookeepers;
    }

    public void setZookeepers(List<Zookeeper> zookeepers) {
        this.zookeepers = zookeepers;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public List<FoodStore> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<FoodStore> foodList) {
        this.foodList = foodList;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }
}
