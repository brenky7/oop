package com.autobusy;

public class comfortMini extends vnutrostatnyAutobus{
    protected boolean sedadla;
    public void setSedadla(boolean sedadla){
        this.sedadla = sedadla;
    }
    public boolean getSedadla(){
        return this.sedadla;
    }
    @Override
    public void printInfo() {
        System.out.println("Typ autobusu: " + this.getClass().getSimpleName());
        System.out.println("Pocet volnych miest: " + this.getCapacita());
        System.out.println("Cena: " + this.getCena()+ " eur");
        String sluzby = "Sluzby: ";
        if (this.getWifi()) {
            sluzby += "Wifi, ";
        }
        if (this.getKlima()) {
            sluzby += "Klimatizacia, ";
        }
        if (this.getToaleta()) {
            sluzby += "Toaleta, ";
        }
        if (this.getNabijanie()) {
            sluzby += "Nabijanie, ";
        }
        if (this.getSedadla()) {
            sluzby += "Specialne sedadla";
        }
        System.out.println(sluzby);
        System.out.println("Cas odchodu: " + this.getCasOdchodu());
        System.out.println("Dlzka cesty: " + this.getDlzkaCesty()+ " km");
        System.out.println("Trasa: " + this.getTrasaZaciatok() + " - " + this.getTrasaKoniec());
    }
}
