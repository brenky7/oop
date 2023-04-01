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
    public abstract void setCapacita(int capacita) ;
    public abstract void setCena(int cena) ;
    public abstract void setWifi(boolean wifi) ;
    public abstract void setKlima(boolean klima) ;
    public abstract void setToaleta(boolean toaleta) ;
    public abstract void setNabijanie(boolean nabijanie) ;
    public abstract void setCasOdchodu(String casOdchodu) ;
    public abstract int getCapacita() ;
    public abstract int getCena() ;
    public abstract boolean getWifi() ;
    public abstract boolean getKlima() ;
    public abstract boolean getToaleta() ;
    public abstract boolean getNabijanie() ;
    public abstract String getCasOdchodu() ;
    public abstract String getTrasaZaciatok() ;
    public abstract String getTrasaKoniec() ;
    public abstract void printInfo() ;

}
