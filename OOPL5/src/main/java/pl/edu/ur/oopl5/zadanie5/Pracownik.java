/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5.zadanie5;

/**
 *
 * @author rafineria123
 */
public class Pracownik {

    private String imie;      //
    private String nazwisko;  // Pola klasy osoba
    private int wiek;         //  
    private String stanowisko;//

    public Pracownik() {
    }

    @Override
    public String toString() {
        return "imie= " + imie + ", nazwisko= " + nazwisko + ", wiek= " + wiek + ", stanowisko= " + stanowisko;
    }
    

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    
    

} //end class

