package main;

import clase.Aplicant;
import clase.readers.ReaderAngajati;
import clase.readers.ReaderAplicanti;
import clase.readers.ReaderElevi;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aplicant> listaAngajati;
        Aplicant.setPragPunctaj(85);
        try{
            ReaderAplicanti ra = new ReaderAngajati("C:\\Users\\tudor\\IdeaProjects\\Activitate_CTS_Ivan_Tudor_Ion\\Seminar2\\src\\angajati.txt");
            listaAngajati = ra.readAplicanti();
            for(Aplicant aplicant: listaAngajati){
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afisareStatut();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}