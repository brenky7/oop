package com.cestujuci;
import com.autobusy.Autobus;
import visitor.*;

public class telesneZnevyhodneny extends Cestujuci implements Visitable{
    public telesneZnevyhodneny() { super(); }
    public telesneZnevyhodneny(int budget, String trasaZaciatok, String trasaKoniec, int hodinaOdchodu, int minutaOdchodu) {
        super(budget, trasaZaciatok, trasaKoniec, hodinaOdchodu, minutaOdchodu);
    }

    @Override
    public void accept(Autobus autobus, Visitor visitor) {
        visitor.pridajZnevyhodneneho(autobus, this);
    }

    @Override
    public void printInfo() {
        System.out.println("Telesne znevyhodneny cestujuci");
        System.out.println("Trasa: " + super.trasaZaciatok + " - " + super.trasaKoniec);
        System.out.println("Cas odchodu: " + super.casOdchodu);
        System.out.println("Budget: " + super.budget + " eur");
    }

    public void checkSluzby(){ System.out.println("Telesne znevyhodneny si pozrie sluzby"); };
}
