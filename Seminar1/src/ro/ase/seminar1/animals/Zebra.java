package ro.ase.seminar1.animals;

public class Zebra extends Animal
{
    public int nrDungi;

    public Zebra(String name, int age, int nrDungi) {
        super(name, age);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra mananca "+mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Zebra : ");
        buffer.append(super.toString());
        buffer.append("Numarul de Dungi :");
        buffer.append(this.nrDungi);
        return buffer.toString();
    }
}
