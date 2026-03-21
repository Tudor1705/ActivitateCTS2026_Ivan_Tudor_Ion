package cts.clase;

public class Clatita extends Desert
{
    protected float gramaj;
    protected String denumire;
    protected int calorii;


    public Clatita(float gramaj, String denumire, int calorii, float gramaj1, String denumire1, int calorii1) {
        super(gramaj, denumire, calorii);
        this.gramaj = gramaj1;
        this.denumire = denumire1;
        this.calorii = calorii1;
    }

    public Clatita(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza() {
        System.out.println(("Clatitele cu  " + super.denumire + " au "
                + super.gramaj + "grame" + super.calorii + " calorii "));
    }
}
