package model.entity;

public class FoodStore {
    private Integer id;
    private String name;
    private int health;
    private int waste;
    private int quantity;

    public FoodStore() {
    }

    public FoodStore(Integer id, String name, int health, int waste, int quantity) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.waste = waste;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getWaste() {
        return waste;
    }

    public void setWaste(int waste) {
        this.waste = waste;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
