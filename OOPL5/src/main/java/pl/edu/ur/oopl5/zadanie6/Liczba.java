/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zadanie6;


/**
 *
 * @author rafineria123
 */
public class Liczba {
//    private double[] cyfry;
//    private  double liczba;
//    public Liczba(String tekst){
//        liczba = Double.parseDouble(tekst);
//    }
//    
//    public double rozmiar(){
//        double x = Math.floor(liczba);
//        while(x>10){
//            
//        }
//    }
//
//    public double getLiczba() {
//        return Math.floor(liczba) ;
//    }

    private int liczba;
    private int[] cyfry;

    public Liczba(String tekst) {
        this.liczba = Integer.parseInt(tekst);
        cyfry = new int[rozmiar(liczba)];
    }

    public int rozmiar(int liczba) {
        int i = 0;
        while (liczba / 10 != 0) {
            liczba = liczba / 10;
            i++;
        }
        return i;
    }

    public void wczytaniedotab() {
        int x=this.liczba;
        for (int i = 0; i < rozmiar(this.liczba); i++) {
            cyfry[i] = x % 10;
            x = x / 10;
        }
    }

    public void wypisz() {
        System.out.println("podana liczba: " + this.liczba);
    }

    public int silnia(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * silnia(n - 1);
        }
    }
}
