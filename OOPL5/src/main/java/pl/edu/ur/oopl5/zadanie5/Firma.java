/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zadanie5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rafineria123
 */
public class Firma {

    private ArrayList<Pracownik> list;
    
    public Firma() {
        this.list = new ArrayList(100);

    }

    public void dodajpracownik() {
        Scanner wczytaj = new Scanner(System.in);
        Pracownik pracownik = new Pracownik();
        System.out.printf("Podaj imie pracownika: ");
        pracownik.setImie(wczytaj.next());
        System.out.printf("\n");
        System.out.printf("Podaj nazwisko pracownika: ");
        pracownik.setNazwisko(wczytaj.next());
        System.out.printf("\n");
        System.out.printf("Podaj wiek pracownika: ");
        pracownik.setWiek(wczytaj.nextInt());
        System.out.printf("\n");
        System.out.printf("Podaj stanowisko pracownika: ");
        pracownik.setStanowisko(wczytaj.next());
        System.out.printf("\n");
        list.add(pracownik);
    }
    public void wyswietlpracownik(){
        Pracownik p=new Pracownik();
        for(int i=0;i<list.size();i++){
            p=list.get(i);
            System.out.println(p); 
        }
    }

}
