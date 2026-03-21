package cts.fabrici;
import cts.clase.FelDeMancare;

public interface FelDeMancareFabrica
{
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii);

    public FelDeMancare getFelDeMancare2(TipFelDeMancare tip, float gramaj, String denumire);

}
