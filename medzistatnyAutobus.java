package com.autobusy;

import com.cestujuci.Cestujuci;

import java.util.ArrayList;

public class medzistatnyAutobus extends Autobus implements trasa{
    public ArrayList<String> zastavky = new ArrayList<String>();
    public medzistatnyAutobus(){
        super();
    }
    @Override
    public void setTrasaKoniec() { this.trasaKoniec = zastavky.get(zastavky.size() - 1);;}
    @Override
    public void setTrasaZaciatok() {
        this.trasaZaciatok = zastavky.get(0);
    }
    public void addZastavka(String zastavka) {
        zastavky.add(zastavka);
    }
    @Override
    public void printInfo() {
        System.out.println("Typ autobusu: " + this.getClass().getSimpleName());
        System.out.println("Pocet volnych miest: " + this.getCapacita());
        System.out.println("Cena: " + this.getCena() + " eur");
        String sluzby = "Sluzby: ";
        if (this.getWifi()) {
            sluzby = (sluzby + "Wifi, ");
        }
        if (this.getKlima()) {
            sluzby = (sluzby + "Klimatizacia, ");
        }
        if (this.getToaleta()) {
            sluzby = (sluzby + "Toaleta, ");
        }
        if (this.getNabijanie()) {
            sluzby = (sluzby + "Nabijanie");
        }
        System.out.println(sluzby);
        System.out.println("Cas odchodu: " + this.getCasOdchodu());
        String trasa = "Zastavky: ";
        for ( String zastavka : zastavky) {
            trasa = (trasa + zastavka + " - ");
        }
        trasa = trasa.substring(0, trasa.length() - 3);
        System.out.println(trasa);
        System.out.println("Cestujuci: ");
        for (Cestujuci cestujuci : this.cestujuci) {
            System.out.println(cestujuci.getClass().getSimpleName());
        }
    }
    public boolean najdiZastavku(String zastavka) {
        for (String z : zastavky) {
            if (z.equals(zastavka)) {
                return true;
            }
        }
        return false;
    }
}
