package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animals.Animal;
import ro.ase.seminar1.animals.Zebra;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public String name;
    public ZooKeeper zookeper;
    public List<Animal> animale;

    public Zoo(String name, ZooKeeper zookeper) {
        this.name = name;
        this.zookeper = zookeper;
        this.animale = new ArrayList<>();
    }

    public void feedAllAnimals(){
        for(Animal a:animale){
            zookeper.feedAnimal(a);
        }
    }
    public void adaugaAnimal(Zebra a){
        animale.add(a);
    }
}
