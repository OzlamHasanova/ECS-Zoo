package service.animal;

public interface AnimalService {
    void decreaseHealth();
    boolean canEat(String food);
    boolean aMonthPasses();
    void treat();
}
