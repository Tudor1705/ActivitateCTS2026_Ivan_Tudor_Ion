package simpleFactory.clase;
import simpleFactory.clase.MijloaceTransport;
import simpleFactory.clase.TipTransport;
public class FactoryTransport
{
    public MijloaceTransport getMijlocTransport(TipTransport tip, String marca, int nrLinie)
    {
        switch(tip)
        {
            case AUTOBUZ ->
            {
                return new Autobuz(nrLinie, marca);
            }
            case TRAMVAI ->
            {
                return new Tramvai(nrLinie, marca);
            }
            case TROLEIBUZ ->
            {
                return new Troleibuz(nrLinie, marca);
            }
            default ->
            {
                return null;
            }
        }
    }
}
