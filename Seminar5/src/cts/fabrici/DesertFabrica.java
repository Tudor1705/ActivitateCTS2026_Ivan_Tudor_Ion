package cts.fabrici;

import cts.clase.Clatita;
import cts.clase.FelDeMancare;
import cts.clase.Papanasi;

public class DesertFabrica implements FelDeMancareFabrica
{

    @Override
    public FelDeMancare getFelDeMancare(TipFelDeMancare tip, float gramaj, String denumire, int calorii) {
        switch(tip)
        {
            case TipDesert.PAPANSI :
                return new Papanasi(gramaj, denumire, calorii);
            case TipDesert.CLATITE:
                return new Clatita(gramaj, denumire, calorii);
            default:
                return null;

        }
    }

    @Override
    public FelDeMancare getFelDeMancare2(TipFelDeMancare tip, float gramaj, String denumire) {
        return this.getFelDeMancare(tip, gramaj, denumire, 500);
    }
}
