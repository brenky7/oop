package com.cestujuci;
import java.util.Random;

public abstract class Cestujuci {
    protected boolean booked;
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
    public void setBudget(int budget){
        this.budget = budget;
    }
    public int getBudget(){
        return this.budget;
    }
    public void setTrasaZaciatok(String trasaZaciatok){
        this.trasaZaciatok = trasaZaciatok;
    };
    public String getTrasaZaciatok(){
        return this.trasaZaciatok;
    };
    public void setTrasaKoniec(String trasaKoniec){
        this.trasaKoniec = trasaKoniec;
    };
    public String getTrasaKoniec(){
        return this.trasaKoniec;
    };
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
    public String getCasOdchodu(){
        return this.casOdchodu;
    };
    public void setHodinaOdchodu(int hodinaOdchodu){
        this.hodinaOdchodu = hodinaOdchodu;
    };
    public int getHodinaOdchodu(){
        return this.hodinaOdchodu;
    };
    public void setMinutaOdchodu(int minutaOdchodu){
        this.minutaOdchodu = minutaOdchodu;
    };
    public int getMinutaOdchodu(){
        return this.minutaOdchodu;
    };
    public void setBooked(boolean booked){
        this.booked = booked;
    };
    public boolean getBooked(){
        return this.booked;
    };
    public abstract void printInfo();
}
