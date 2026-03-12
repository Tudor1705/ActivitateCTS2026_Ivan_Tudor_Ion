package ro.ase.seminar1.main;

import ro.ase.seminar1.animals.Lion;
import ro.ase.seminar1.animals.Zebra;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper=new ZooKeeper("Gioconda");
        Lion l1=new Lion("Simba",25,44);
        Zebra z=new Zebra("Mufasa",27,3);
        Zoo gradinaZoo=new Zoo("Scar",zooKeeper);
        gradinaZoo.adaugaAnimal(z);
        gradinaZoo.feedAllAnimals();
    }
}