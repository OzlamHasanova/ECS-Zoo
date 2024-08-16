package service.animal;

import model.entity.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalServiceImpl implements AnimalService{
    List<Animal> animals = new ArrayList<>();
    Animal animal;

    public AnimalServiceImpl() {
        Animal lion = new Animal(1, 5, 'M', Arrays.asList("steak", "celery"), 1, 24);
        Animal tiger = new Animal(2, 4, 'F', Arrays.asList("steak", "celery"), 1, 24);
        Animal elephant = new Animal(3, 10, 'M', Arrays.asList("hay", "fruit"), 1, 36);
        Animal giraffe = new Animal(4, 7, 'F', Arrays.asList("hay", "fruit"), 1, 28);
        Animal penguin = new Animal(5, 3, 'M', Arrays.asList("fish", "ice cream"), 1, 15);

        animals.add(lion);
        animals.add(tiger);
        animals.add(elephant);
        animals.add(giraffe);
        animals.add(penguin);
    }

    @Override
    public void decreaseHealth() {
        int healthCount=animal.getHealth()-2;
        System.out.println("health count: "+healthCount);
    }
    @Override
    public boolean canEat(String food) {
        return animal.getEats().contains(food);
    }

    @Override
    public boolean aMonthPasses() {//todo: a month
        return false;
    }

    @Override
    public void treat() {
    }
}
