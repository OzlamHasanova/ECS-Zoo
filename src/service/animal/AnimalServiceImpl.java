package service.animal;

import model.entity.Animal;
import service.zookeeper.PhysioZookeeperServiceImpl;
import service.zookeeper.ZookeeperService;

public class AnimalServiceImpl implements AnimalService{
    @Override
    public void decreaseHealth(Animal animal) {
        int healthCount=animal.getHealth()-2;
        animal.setHealth(healthCount);
        System.out.println("health count: "+healthCount);
    }
    @Override
    public boolean canEat(Animal animal,String food) {
        return animal.getEats().contains(food);
    }

    @Override
    public void aMonthPasses(Animal animal) {
        System.out.println("decrease health for "+animal.getName());
        decreaseHealth(animal);
        animal.setLifeExpectancy(animal.getLifeExpectancy()-1);
        System.out.println("life expectancy"+animal.getLifeExpectancy());
        
    }

    @Override
    public void treat(Animal animal) {
        ZookeeperService zookeeper=new PhysioZookeeperServiceImpl();
    }
}
