package com.autobusy;

public abstract class Autobus {
    protected int capacita;
    protected int cena;
    protected boolean wifi;
    protected boolean klima;
    protected boolean toaleta;
    protected boolean nabijanie;
    protected String trasaZaciatok;
    protected String trasaKoniec;
    protected String casOdchodu;
    public Autobus() {}
    public Autobus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        this.capacita = i;
        this.cena = i1;
        this.wifi = b;
        this.klima = b1;
        this.toaleta = b2;
        this.nabijanie = b3;
    }
    public int getCena() { return cena; }
    public void setCena(int cena) { this.cena = cena; }
    public int getCapacita() { return capacita; }
    public void setCapacita(int capacita) { this.capacita = capacita; }
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
    public abstract void printInfo() ;
}
