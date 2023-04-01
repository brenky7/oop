package com.cestujuci;

public class telesneZnevyhodneny extends Cestujuci{
    public telesneZnevyhodneny() { super(); }
    public telesneZnevyhodneny(int budget, String trasaZaciatok, String trasaKoniec, int hodinaOdchodu, int minutaOdchodu) {
        super(budget, trasaZaciatok, trasaKoniec, hodinaOdchodu, minutaOdchodu);
        checkSluzby();
    }
    @Override
    public void setBudget(int budget) { super.budget = budget; }
    @Override
    public int getBudget() { return super.budget; }
    @Override
    public void setTrasaZaciatok(String trasaZaciatok) { super.trasaZaciatok = trasaZaciatok; }
    @Override
    public String getTrasaZaciatok() { return super.trasaZaciatok; }
    @Override
    public void setTrasaKoniec(String trasaKoniec) { super.trasaKoniec = trasaKoniec; }
    @Override
    public String getTrasaKoniec() { return super.trasaKoniec; }
    @Override
    public String getCasOdchodu() { return super.casOdchodu; }
    @Override
    public void setHodinaOdchodu(int hodinaOdchodu) { super.hodinaOdchodu = hodinaOdchodu; }
    @Override
    public int getHodinaOdchodu() { return super.hodinaOdchodu; }
    @Override
    public void setMinutaOdchodu(int minutaOdchodu) { super.minutaOdchodu = minutaOdchodu;}
    @Override
    public int getMinutaOdchodu() { return super.minutaOdchodu; }
    @Override
    public void printInfo() {
        System.out.println("Telesne znevyhodneny cestujuci");
        System.out.println("Trasa: " + super.trasaZaciatok + " - " + super.trasaKoniec);
        System.out.println("Cas odchodu: " + super.casOdchodu);
        System.out.println("Budget: " + super.budget + " eur");
    }

    public void checkSluzby(){ System.out.println("Telesne znevyhodneny si pozrie sluzby"); };
}
