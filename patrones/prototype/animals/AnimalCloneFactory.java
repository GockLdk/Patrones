package prototype.animals;

/**
 *Factoria de Clonacion
 */
public class AnimalCloneFactory {

    public Animal getClone(Animal animalSample) {
        return animalSample.clone();
    }

}
