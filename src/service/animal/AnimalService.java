package service.animal;

import model.entity.Animal;

public interface AnimalService {
    void decreaseHealth(Animal animal);
    boolean canEat(Animal animal,String food);
    void aMonthPasses(Animal animal);
    void treat(Animal animal);
}
