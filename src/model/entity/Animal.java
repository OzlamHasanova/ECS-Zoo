package model.entity;

import java.util.List;

public class Animal {
    private Integer id;
    private String name;
    private int age;
    private char gender;
    private List<String> eats;
    private int health;
    private int lifeExpectancy;
    private Enclosure enclosure;

    public Animal() {
    }

    public Animal(Integer id,String name, int age, char gender, List<String> eats, int health, int lifeExpectancy) {
        this.id = id;
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Animal{" +
                "name="+name+
                ", age=" + age +
                ", gender=" + gender +
                ", eats=" + eats +
                ", health=" + health +
                ", lifeExpectancy=" + lifeExpectancy +
                '}'+"\n";
    }
}
