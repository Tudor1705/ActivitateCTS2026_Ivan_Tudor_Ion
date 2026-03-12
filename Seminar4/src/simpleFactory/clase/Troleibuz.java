package simpleFactory.clase;

public class Troleibuz implements MijloaceTransport
{

    private int nrLinie;
    private String marca;

    public Troleibuz(int nrLinie, String marca)
    {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport()
    {
        System.out.println("Troleibuzul de pe linia " + nrLinie + "este de marca " + marca );
    }
}
