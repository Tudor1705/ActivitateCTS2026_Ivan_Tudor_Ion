package simpleFactory.clase;

public class Tramvai implements MijloaceTransport
{

    private int nrLinie;
    private String marca;

    public Tramvai(int nrLinie, String marca)
    {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport()
    {
        System.out.println("Tramvaiul de pe linia " + nrLinie + "este de marca " + marca );
    }
}
