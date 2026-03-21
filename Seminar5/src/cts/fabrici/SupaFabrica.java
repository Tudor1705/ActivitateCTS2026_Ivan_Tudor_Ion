package cts.fabrici;

import cts.clase.Ciorba;
import cts.clase.FelDeMancare;
import cts.clase.Papanasi;
import cts.clase.SupaCrema;

import static cts.fabrici.TipSupa.CIORBA;
import static cts.fabrici.TipSupa.SUPA_CREMA;

public class SupaFabrica implements FelDeMancareFabrica
{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        return null;
    }

    @Override
    public FelDeMancare getFelDeMancare2(TipFelDeMancare tip, float gramaj, String denumire) {
        switch (tip)
        {
            case SUPA_CREMA:
                return new SupaCrema(gramaj, denumire);
            case CIORBA:
                return new Ciorba(gramaj, denumire);
            default:
                return null;
        }
    }
}
