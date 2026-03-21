package cts.main;

import cts.clase.Ciorba;
import cts.clase.FelDeMancare;
import cts.clase.Supa;
import cts.clase.SupaCrema;
import cts.fabrici.*;

public class Main
{
    public static void main(String[] args)
    {
        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema = fabrica.getFelDeMancare2(TipSupa.SUPA_CREMA, 300, "Supa de Morcovi");
        FelDeMancare ciorba = fabrica.getFelDeMancare2(TipSupa.CIORBA, 100, "Ciorba de Pui");
        FelDeMancareFabrica fabrica1 = new DesertFabrica();
        FelDeMancare papanasi = fabrica1.getFelDeMancare2(TipDesert.PAPANSI, 90, "Papanasi cu Dulceata");
        FelDeMancare clatite = fabrica1.getFelDeMancare2(TipDesert.CLATITE, 400, "Clatite cu Banane");


        supaCrema.afiseaza();
        papanasi.afiseaza();
        ciorba.afiseaza();
        clatite.afiseaza();
    }
}
