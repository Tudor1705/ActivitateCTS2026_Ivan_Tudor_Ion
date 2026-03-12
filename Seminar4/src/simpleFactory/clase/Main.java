package simpleFactory.clase;

public class Main
{
    public static void main(String[] args)
    {
        FactoryTransport fabricaTransport = new FactoryTransport();
        Autobuz autobuz = (Autobuz) fabricaTransport.getMijlocTransport(TipTransport.AUTOBUZ , "Otokar", 63);
        autobuz.afiseazaTipTransport();
    }
}
