package simpleFactory.clase;

public class Autobuz implements MijloaceTransport
{
    private int nrLinie;
    private String marca;

    public Autobuz(int nrLinie, String marca)
    {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport()
    {
        System.out.println("Autobuzul de pe linia " + nrLinie + "este de marca " + marca );
    }
}
