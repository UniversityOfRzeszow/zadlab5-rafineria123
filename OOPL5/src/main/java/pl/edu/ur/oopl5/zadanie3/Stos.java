/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zadanie3;

/**
 *
 * @author rafineria123
 */
public class Stos {

    private int[] stos;
    private int wskaznik_stos;

    public Stos(int rozmiar_stos) {
        stos = new int[rozmiar_stos];
        this.wskaznik_stos = -1;
    }

    public void push(int x) {
//        if (wskaznik_stos == stos.length - 1) {
//            
//
//        }
        try{
        this.wskaznik_stos++;    
        this.stos[wskaznik_stos] = x;
        System.out.println("Podana liczba zostala umieszczona na stosie");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Stos przepelniony!!!");
            System.exit(3500);
        }
    }

    public void pop() {
        try{
        System.out.println("Sciagnieto wartosc: " + stos[wskaznik_stos]+ " ze szczytu stosu");
        wskaznik_stos--;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Stos pusty!!!");
            System.exit(3500);
        }
    }

}
