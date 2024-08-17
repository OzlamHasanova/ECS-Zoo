package service.enclosure;

import model.entity.Animal;
import model.entity.Enclosure;
import model.entity.FoodStore;
import model.entity.Zookeeper;
import model.enums.ZookeeperTypeEnum;
import service.animal.AnimalService;
import service.animal.AnimalServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnclosureServiceImpl implements EnclosureService{
    List<Enclosure> enclosureList=new ArrayList<>();

    public EnclosureServiceImpl() {
        Enclosure enclosure1 = new Enclosure(1, createAnimalList1(), createZookeeperList(),Arrays.asList(new FoodStore(1,"steak",3,4,1),new FoodStore(1,"fish",3,2,1)), 0);
        Enclosure enclosure2 = new Enclosure(2, createAnimalList2(), createZookeeperList(),Arrays.asList(new FoodStore(1,"hay",3,4,1),new FoodStore(1,"fruit",3,2,1)) , 0);
        enclosureList.add(enclosure1);
        enclosureList.add(enclosure2);
    }
    private List<Animal> createAnimalList1() {
        Animal lion = new Animal(1,"lion", 5, 'M', Arrays.asList("steak", "celery"), 100, 24);
        Animal tiger = new Animal(2,"tiger", 4, 'F', Arrays.asList("steak", "celery"), 100, 24);
        return Arrays.asList(lion, tiger);
    }

    private List<Animal> createAnimalList2() {
        Animal elephant = new Animal(3,"elephant", 10, 'M', Arrays.asList("hay", "fruit"), 100, 36);
        Animal giraffe = new Animal(4,"giraffe", 7, 'F', Arrays.asList("hay", "fruit"), 100, 28);
        return Arrays.asList(elephant, giraffe);
    }
    private List<Zookeeper> createZookeeperList() {
        Zookeeper zookeeper1=new Zookeeper(ZookeeperTypeEnum.General_Zookeeper);
        Zookeeper zookeeper2=new Zookeeper(ZookeeperTypeEnum.Play_Zookeeper);
        Zookeeper zookeeper3=new Zookeeper(ZookeeperTypeEnum.Specialist_Zookeeper);
        return Arrays.asList(zookeeper1,zookeeper2,zookeeper3);
    }

    @Override
    public void addAnimal(Animal animal,int encloserNumber){
        enclosureList.get(encloserNumber-1).getAnimals().add(animal);
    }

    @Override
    public void removeAnimal(Animal animal,int encloserNumber) {
        enclosureList.get(encloserNumber-1).getAnimals().remove(animal);
    }

    @Override
    public void addWaste(int waste) {
    }

    @Override
    public void removeWaste(int waste) {

    }

    @Override
    public void getFoodStore(Enclosure enclosure) {
        enclosure.getFoodList().forEach(foodStore ->
                System.out.println(foodStore.getName() + ":" + foodStore.getQuantity()));
    }

    @Override
    public void getWasteSize(Enclosure enclosure) {
        System.out.println("waste: "+enclosure.getWaste());
    }

    @Override
    public int sizeAnimalInTheEnclosure() {
        return enclosureList.size()+1;
    }

    @Override
    public boolean aMonthPasses() throws InterruptedException {
        for (int i = 1; i <sizeAnimalInTheEnclosure() ; i++) {
            Enclosure enclosure=enclosureList.get(i-1);
            System.out.println("enclosure: "+enclosure.getNumber());
            getFoodStore(enclosure);
            enclosure.getAnimals().stream().forEach(System.out::println);
            getWasteSize(enclosure);
            System.out.println("Let's see what happened in 1 month inside enclosure");
            Thread.sleep(3000);
            for (int j = 0; j < enclosure.getAnimals().size(); j++) {
                Animal animal=enclosure.getAnimals().get(j);
                AnimalService animalService=new AnimalServiceImpl();
                animalService.aMonthPasses(animal);

            }
            System.out.println();
        }

        return true;
    }
}
