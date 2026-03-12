package main;

import clase.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
         Logger instance = Logger.getInstance("Interfata", "afisare");
         instance.afisareLog("Fisierul JSON este afisat corect");
         instance.afisareLog("Eroare");
         Logger instance2= Logger.getInstance("Frontend", "afisare");
         instance2.afisareLog("Eroare");
         instance2.setCategorie("Test");
         instance2.setSender("Backend");
         instance2.afisareLog("Eroare la inregistrate");
    }
}