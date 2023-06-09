package com.cestujuci;
import com.autobusy.Autobus;
import visitor.*;
public class tehotnaZena extends Cestujuci implements Visitable{
    public tehotnaZena() { super(); }
    public tehotnaZena(int budget, String trasaZaciatok, String trasaKoniec, int hodinaOdchodu, int minutaOdchodu) {
        super(budget, trasaZaciatok, trasaKoniec, hodinaOdchodu, minutaOdchodu);
    }

    @Override
    public void printInfo() {
        System.out.println("Tehotna zena");
        System.out.println("Budget: " + super.budget + " eur");
        System.out.println("Trasa: " + super.trasaZaciatok + " - " + super.trasaKoniec);
        System.out.println("Cas odchodu: " + super.casOdchodu);
    }
    public void checkSluzby(){
        System.out.println("Tehotna zena si pozrie sluzby");
    };

    @Override
    public void accept(Autobus autobus, Visitor visitor) {
        visitor.pridajTehotnu(autobus, this);
    }
}
