package com.autobusy;

public class beznyBus extends vnutrostatnyAutobus{
    public beznyBus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        super(i, i1, b, b1, b2, b3);
    }
    public beznyBus(){
        super();
    };
    @Override
    public void setCapacita(int capacita) {
        super.capacita = capacita;
    }
    @Override
    public void setCena(int cena) {
        super.cena = cena;
    }
    @Override
    public void setWifi(boolean wifi) {
        super.wifi = wifi;
    }
    @Override
    public void setKlima(boolean klima) {
        super.klima = klima;
    }
    @Override
    public void setToaleta(boolean toaleta) {
        super.toaleta = toaleta;
    }
    @Override
    public void setNabijanie(boolean nabijanie) {
        super.nabijanie = nabijanie;
    }
    @Override
    public void setCasOdchodu(String casOdchodu) {
        super.casOdchodu = casOdchodu;
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
    public boolean getKlima() {
        return super.klima;
    }
    @Override
    public boolean getToaleta() {
        return super.toaleta;
    }
    @Override
    public boolean getNabijanie() {
        return super.nabijanie;
    }
    @Override
    public String getCasOdchodu() {
        return super.casOdchodu;
    }

    @Override
    public String getTrasaZaciatok() {
        return super.trasaZaciatok;
    }

    @Override
    public String getTrasaKoniec() {
        return super.trasaKoniec;
    }

    @Override
    public void printInfo() {
        System.out.println("Typ autobusu: " + this.getClass().getSimpleName());
        System.out.println("Capacita: " + this.getCapacita() + " ludi");
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
        System.out.println("Dlzka cesty: " + this.getDlzkaCesty() + " km");
        System.out.println("Trasa: " + this.getTrasaZaciatok() + " - " + this.getTrasaKoniec());

    }
    @Override
    public void setDlzkaCesty(int dlzkaCesty) {
        super.dlzkaCesty = dlzkaCesty;
    }
    @Override
    public int getDlzkaCesty() {
        return super.dlzkaCesty;
    }
}
