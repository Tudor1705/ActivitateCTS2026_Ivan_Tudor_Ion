package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animals.Animal;

public class ZooKeeper {
    public String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal){
        System.out.println("Zookeper- ul "+name+" a hranit "+animal);

    }
}
