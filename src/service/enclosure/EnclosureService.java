package service.enclosure;

import model.entity.Animal;

public interface EnclosureService {
   void addAnimal (Animal animal);
   void removeAnimal(Animal animal);
    void addWaste(int waste);
   void removeWaste(int waste);
   void getFoodStore();
   void getWasteSize();
   void sizeAnimalInTheEnclosure();
   boolean aMonthPasses();

}
