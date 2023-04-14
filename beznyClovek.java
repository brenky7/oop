package com.cestujuci;

public class beznyClovek extends Cestujuci{
    public beznyClovek() { super(); }
    public beznyClovek(int budget, String trasaZaciatok, String trasaKoniec, int hodinaOdchodu, int minutaOdchodu) {
        super(budget, trasaZaciatok, trasaKoniec, hodinaOdchodu, minutaOdchodu);
    }
    @Override
    public void printInfo() {
        System.out.println("Bezny clovek");
        System.out.println("Budget: " + super.budget + " eur");
        System.out.println("Trasa zaciatok: " + super.trasaZaciatok);
        System.out.println("Trasa koniec: " + super.trasaKoniec);
        System.out.println("Cas odchodu: " + super.casOdchodu);
    }
    public void checkSluzby(){ System.out.println("Bezny clovek si pozrie sluzby"); };
}
