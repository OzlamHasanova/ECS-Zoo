package service.animal;

import model.entity.Animal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalServiceImpl implements AnimalService{
    List<Animal> animals = new ArrayList<>();

    public AnimalServiceImpl() {
        Animal lion = new Animal(1, 5, 'M', Arrays.asList("steak", "celery"), 80, 24);
        Animal tiger = new Animal(2, 4, 'F', Arrays.asList("steak", "celery"), 75, 24);
        Animal elephant = new Animal(3, 10, 'M', Arrays.asList("hay", "fruit"), 90, 36);
        Animal giraffe = new Animal(4, 7, 'F', Arrays.asList("hay", "fruit"), 85, 28);
        Animal penguin = new Animal(5, 3, 'M', Arrays.asList("fish", "ice cream"), 70, 15);

        animals.add(lion);
        animals.add(tiger);
        animals.add(elephant);
        animals.add(giraffe);
        animals.add(penguin);
    }

    @Override
    public void decreaseHealth() {

    }
    @Override
    public boolean canEat(String food) {
        return false;
    }

    @Override
    public boolean aMonthPasses() {
        return false;
    }

    @Override
    public void treat() {

    }
}
