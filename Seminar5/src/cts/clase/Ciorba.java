package cts.clase;

public class Ciorba extends Supa
{
    protected float gramaj;
    protected String denumire;


    public Ciorba(float gramaj, String denumire) {
        super(gramaj, denumire);
    }

    @Override
    public void afiseaza()
    {
        System.out.println("Ciorba " + super.denumire + " are "
                + super.gramaj + "gramaj");
    }

    public Ciorba(float gramaj, String denumire, float gramaj1, String denumire1) {
        super(gramaj, denumire);
        this.gramaj = gramaj1;
        this.denumire = denumire1;
    }
}
