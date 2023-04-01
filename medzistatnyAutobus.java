package com.autobusy;

import java.util.ArrayList;

public class medzistatnyAutobus extends Autobus implements zastavky{

    public ArrayList<String> zastavky = new ArrayList<String>();

    public medzistatnyAutobus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        super(i, i1, b, b1, b2, b3);
    }
    public medzistatnyAutobus(){
        super();
    }
    @Override
    public int getCapacita() {
        return super.capacita;
    }
    @Override
    public int getCena() {
        return super.cena;
    }
    @Override
    public boolean getWifi() {
        return super.wifi;
    }
    @Override
    public boolean getKlima() { return super.klima; }
    @Override
    public boolean getToaleta() {
        return super.toaleta;
    }
    @Override
    public boolean getNabijanie() {
        return super.nabijanie;
    }

    @Override
    public String getCasOdchodu() { return super.casOdchodu; }

    public String getTrasaZaciatok() {
        return super.trasaZaciatok;
    }
    public String getTrasaKoniec() {
        return super.trasaKoniec;
    }
    @Override
    public void setCapacita(int capacita) {
        this.capacita = capacita;
    }
    @Override
    public void setCena(int cena) {
        this.cena = cena;
    }
    @Override
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }
    @Override
    public void setKlima(boolean klima) {
        this.klima = klima;
    }
    @Override
    public void setToaleta(boolean toaleta) {
        this.toaleta = toaleta;
    }
    @Override
    public void setNabijanie(boolean nabijanie) {
        this.nabijanie = nabijanie;
    }

    @Override
    public void setCasOdchodu(String casOdchodu) { this.casOdchodu = casOdchodu; }

    public void setTrasaKoniec() { this.trasaKoniec = zastavky.get(zastavky.size() - 1);;}
    public void setTrasaZaciatok() {
        this.trasaZaciatok = zastavky.get(0);
    }
    @Override
    public void addZastavka(String zastavka) {
        zastavky.add(zastavka);
    }
    @Override
    public void printInfo() {
        System.out.println("Typ autobusu: " + this.getClass().getSimpleName());
        System.out.println("Capacita: " + this.getCapacita() + " ludi");
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
    }
}
