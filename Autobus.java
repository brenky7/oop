package com.autobusy;
import com.cestujuci.Cestujuci;

import java.util.ArrayList;
import java.util.Observable;

public abstract class Autobus extends Observable{
    protected ArrayList<Cestujuci> cestujuci = new ArrayList<Cestujuci>();
    protected int capacita;
    protected int cena;
    protected boolean wifi;
    protected boolean klima;
    protected boolean toaleta;
    protected boolean nabijanie;
    protected String trasaZaciatok;
    protected String trasaKoniec;
    protected String casOdchodu;
    protected boolean plny;
    public Autobus() {}
    public Autobus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        this.capacita = i;
        this.cena = i1;
        this.wifi = b;
        this.klima = b1;
        this.toaleta = b2;
        this.nabijanie = b3;
    }
    public boolean getPlny() { return plny; }
    public void setPlny(boolean plny) {
        this.plny = plny;
        setChanged();
        notifyObservers(plny);
    }
    public int getCena() { return cena; }
    public void setCena(int cena) { this.cena = cena; }
    public int getCapacita() { return capacita; }
    public void setCapacita(int capacita) {
        this.capacita = capacita;
        if (capacita == 0) {
            this.setPlny(true);
        }
    }
    public void addCestujuci(Cestujuci cestujuci) {
        this.cestujuci.add(cestujuci);
        this.setCapacita(this.getCapacita() - 1);
    }
    public String getCasOdchodu() { return casOdchodu; };
    public void setCasOdchodu(String casOdchodu) { this.casOdchodu = casOdchodu; };
    public void setWifi(boolean wifi){ this.wifi = wifi; } ;
    public void setKlima(boolean klima){ this.klima = klima; } ;
    public void setToaleta(boolean toaleta){ this.toaleta = toaleta; } ;
    public void setNabijanie(boolean nabijanie){ this.nabijanie = nabijanie; } ;
    public boolean getWifi() { return wifi; }
    public boolean getKlima() { return klima; }
    public boolean getToaleta() { return toaleta; }
    public boolean getNabijanie() { return nabijanie; }
    public String getTrasaZaciatok(){ return trasaZaciatok; } ;
    public String getTrasaKoniec(){ return trasaKoniec; } ;
    public void setTrasaZaciatok(String trasaZaciatok){ this.trasaZaciatok = trasaZaciatok; };
    public void setTrasaKoniec(String trasaKoniec){ this.trasaKoniec = trasaKoniec; };
    public void printInfo(){
        System.out.println("Typ autobusu: " + this.getClass().getSimpleName());
        System.out.println("Pocet volnych miest: " + this.getCapacita());
        System.out.println("Cena: " + this.getCena() + " eur");
        String sluzby = "Sluzby: ";
        if (this.getWifi()) {
            sluzby = (sluzby + "Wifi ");
        }
        if (this.getKlima()) {
            sluzby = (sluzby + "Klimatizacia ");
        }
        if (this.getToaleta()) {
            sluzby = (sluzby + "Toaleta ");
        }
        if (this.getNabijanie()) {
            sluzby = (sluzby + "Nabijanie");
        }
        System.out.println(sluzby);
        System.out.println("Cas odchodu: " + this.getCasOdchodu());
        System.out.println("Trasa: " + this.getTrasaZaciatok() + " - " + this.getTrasaKoniec());
        System.out.println("Cestujuci: ");
        for (Cestujuci cestujuci : this.cestujuci) {
            System.out.println(cestujuci.getClass().getSimpleName());
        }
    } ;
}
