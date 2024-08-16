package model.entity;

import java.util.List;

public class Animal {
    private Integer id;
    private int age;
    private char gender;
    private List<String> eats;
    private int health;
    private int lifeExpectancy;
    private Enclosure enclosure;

    public Animal() {
    }

    public Animal(Integer id, int age, char gender, List<String> eats, int health, int lifeExpectancy) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public List<String> getEats() {
        return eats;
    }

    public void setEats(List<String> eats) {
        this.eats = eats;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(int lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public Enclosure getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this.enclosure = enclosure;
    }
}
