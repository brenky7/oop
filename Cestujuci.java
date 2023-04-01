package com.cestujuci;
import java.util.Random;

public abstract class Cestujuci {
    protected int budget;
    protected String trasaZaciatok;
    protected String trasaKoniec;
    protected String casOdchodu;
    protected int hodinaOdchodu;
    protected int minutaOdchodu;
    public Cestujuci() {};
    public Cestujuci( int budget, String trasaZaciatok, String trasaKoniec, int hodinaOdchodu, int minutaOdchodu) {
        this.budget = budget;
        this.trasaZaciatok = trasaZaciatok;
        this.trasaKoniec = trasaKoniec;
        this.hodinaOdchodu = hodinaOdchodu;
        this.minutaOdchodu = minutaOdchodu;
        this.setCasOdchodu();
    }
    public abstract void setBudget(int budget);
    public abstract int getBudget();
    public abstract void setTrasaZaciatok(String trasaZaciatok);
    public abstract String getTrasaZaciatok();
    public abstract void setTrasaKoniec(String trasaKoniec);
    public abstract String getTrasaKoniec();
    public void setCasOdchodu(){
        if (this.hodinaOdchodu < 10) {
            this.casOdchodu = "0" + this.hodinaOdchodu;
        } else {
            this.casOdchodu = "" + this.hodinaOdchodu;
        }
        this.casOdchodu = this.casOdchodu + ":";
        if (this.minutaOdchodu < 10) {
            this.casOdchodu = this.casOdchodu + "0" + this.minutaOdchodu;
        } else {
            this.casOdchodu = this.casOdchodu + this.minutaOdchodu;
        }
    };
    public abstract String getCasOdchodu();
    public abstract void setHodinaOdchodu(int hodinaOdchodu);
    public abstract int getHodinaOdchodu();
    public abstract void setMinutaOdchodu(int minutaOdchodu);
    public abstract int getMinutaOdchodu();
    public abstract void printInfo();
}
