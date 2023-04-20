package com.cestujuci;

import com.autobusy.*;
import visitor.*;

public class bohatyCestujuci extends Cestujuci implements Visitable{
    public bohatyCestujuci() {super(); };
    public bohatyCestujuci(int budget, String trasaZaciatok, String trasaKoniec, int hodinaOdchodu, int minutaOdchodu) {
        super(budget, trasaZaciatok, trasaKoniec, hodinaOdchodu, minutaOdchodu);
    }

    @Override
    public void printInfo() {
        System.out.println("Bohaty cestujuci");
        System.out.println("Budget: " + super.budget + " eur");
        System.out.println("Trasa: " + super.trasaZaciatok + " - " + super.trasaKoniec);
        System.out.println("Cas odchodu: " + super.casOdchodu);
    }
    public void checkSluzby(){ System.out.println("Bohaty cestujuci si pozrie sluzby"); };

    @Override
    public void accept(Autobus autobus, Visitor visitor) {
        visitor.pridajBohateho(autobus, this);
    }

}
