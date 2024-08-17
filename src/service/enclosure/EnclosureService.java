package service.enclosure;

import model.entity.Animal;
import model.entity.Enclosure;

public interface EnclosureService {
   void addAnimal (Animal animal,int encloserNumber);
   void removeAnimal(Animal animal,int encloserNumber);
    void addWaste(int waste);
   void removeWaste(int waste);
   void getFoodStore(Enclosure enclosure);
   void getWasteSize(Enclosure enclosure);
   int sizeAnimalInTheEnclosure();
   boolean aMonthPasses() throws InterruptedException;

}
