package cts.clase;

public class Papanasi extends Desert
{

    protected float gramaj;
    protected String denumire;
    protected int calorii;


    public Papanasi(float gramaj, String denumire, int calorii, float gramaj1, String denumire1, int calorii1) {
        super(gramaj, denumire, calorii);
        this.gramaj = gramaj1;
        this.denumire = denumire1;
        this.calorii = calorii1;
    }

    public Papanasi(float gramaj, String denumire, int calorii) {
        super(gramaj, denumire, calorii);
    }

    @Override
    public void afiseaza()
    {
        System.out.println("Papanasii " + super.denumire + " au "
                    + super.gramaj + "grame" + " si " + super.calorii + " calorii ");

    }
}
