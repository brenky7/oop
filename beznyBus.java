package com.autobusy;

public class beznyBus extends vnutrostatnyAutobus{
    public beznyBus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        super(i, i1, b, b1, b2, b3);
    }
    public beznyBus(){
        super();
    };
    @Override
    public void printInfo() {
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
        System.out.println("Dlzka cesty: " + this.getDlzkaCesty() + " km");
        System.out.println("Trasa: " + this.getTrasaZaciatok() + " - " + this.getTrasaKoniec());

    }
}
