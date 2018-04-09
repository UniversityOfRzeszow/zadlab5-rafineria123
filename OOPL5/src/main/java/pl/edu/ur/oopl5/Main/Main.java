package pl.edu.ur.oopl5.Main;

import pl.edu.ur.oopl5.zadanie3.Stos;
import java.util.Scanner;
import pl.edu.ur.oopl5.zadanie5.Firma;
import pl.edu.ur.oopl5.zadanie6.Liczba;

public class Main {

    public static void main(String[] args) {
        // TODO zad 3, 5, 6
        Scanner wczytaj = new Scanner(System.in);
        while (true) {
            System.out.println("1. Zadanie 3");
            System.out.println("2. Zadanie 5");
            System.out.println("3. Zadanie 6");
            System.out.printf("Wybierz zadanie: ");
            switch (wczytaj.nextInt()) {
                case 1:
                    zad3();
                    break;
                case 2:
                    zad5();
                    break;
                case 3:
                    zad6();
                    

                    break;
                default:
                    System.out.println("Wybierz od 1 do 3!");
                    break;

            }
        }

    }

    public static void zad3() {
        Scanner wczytaj = new Scanner(System.in);
        System.out.println("Podaj rozmiar stosu: ");
        Stos stos = new Stos(wczytaj.nextInt());
        while (true) {
            System.out.println("1. Dodac liczbe ");
            System.out.println("2. Pobrac liczbe ");
            System.out.printf("Co chcesz zrobic?: ");
            switch (wczytaj.nextInt()) {
                case 1:
                    System.out.println("Podaj liczbe: ");
                    stos.push(wczytaj.nextInt());
                    break;
                case 2:
                    stos.pop();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void zad5() {
        Scanner wczytaj = new Scanner(System.in);
        Firma firma = new Firma();
        while (true) {
            System.out.println("1. Dodac pracownika ");
            System.out.println("2. Wyswietlic pracownikow ");
            System.out.println("Co chcesz zrobic?: ");
            switch (wczytaj.nextInt()) {
                case 1:
                    firma.dodajpracownik();
                    break;
                case 2:
                    firma.wyswietlpracownik();
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }
    public static void zad6() {
        Scanner wczytaj = new Scanner(System.in);
        Liczba liczba = new Liczba("12");
        while (true) {
            System.out.println("1. Wczytaj do tablicy ");
            System.out.println("2. Wypisz ");
            System.out.println("2. Wypisz silnię ");
            System.out.println("Co chcesz zrobic?: ");
            switch (wczytaj.nextInt()) {
                case 1:
                    liczba.wczytaniedotab();
                    break;
                case 2:
                    liczba.wypisz();
                    break;
                case 3:
                    System.out.println("Podaj liczbe: ");
                    int n = wczytaj.nextInt();
                    System.out.println("Silnia wynosi: "+liczba.silnia(n));
                    break;

                default:
                    System.exit(0);
                    break;
            }
        }
    }
        
}
