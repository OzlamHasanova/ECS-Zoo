package service.food;

import model.entity.FoodStore;

import java.util.HashSet;
import java.util.Set;

public class FoodStoreServiceImpl implements FoodStoreService{
    private final FoodStore foodStore;
    Set<FoodStore> foodStoreList=new HashSet<>();


    public FoodStoreServiceImpl(FoodStore foodStore) {
        this.foodStore = foodStore;
        foodStoreList.add(new FoodStore(1,"hay",1,4,1));
        foodStoreList.add(new FoodStore(2,"steak",3,4,1));
        foodStoreList.add(new FoodStore(3,"fruit",2,3,1));
        foodStoreList.add(new FoodStore(4,"celery",0,1,1));
        foodStoreList.add(new FoodStore(5,"fish",3,2,1));
        foodStoreList.add(new FoodStore(6,"ice cream",1,3,1));
    }



    @Override
    public void addFood(String name, int quantity) {

    }

    @Override
    public void takeFood(String name) {

    }
}
