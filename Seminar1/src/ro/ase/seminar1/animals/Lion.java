package ro.ase.seminar1.animals;

public class Lion extends Animal {
    public int greutate;

    public Lion(String name, int age, int greutate) {
        super(name, age);
        this.greutate = greutate;
    }

    @Override
    public void eat(String mancare) {
    System.out.println("Leul s-a hranit cu "+mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append("Leul:");
        buffer.append(super.toString());
        buffer.append(" Kilograme:  ");
        buffer.append(greutate);
        return buffer.toString();
    }
}
