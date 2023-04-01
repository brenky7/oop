package com.autobusy;

public class comfortMini extends vnutrostatnyAutobus{
    protected boolean sedadla;
    @Override
    public void setCapacita(int capacita) {
        super.capacita = capacita;
    }
    public void setSedadla(boolean sedadla){
        this.sedadla = sedadla;
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
    public void setTrasaKoniec(String trasaKoniec) { super.setTrasaKoniec(trasaKoniec); }
    public void setTrasaZaciatok(String trasaZaciatok){ super.setTrasaZaciatok(trasaZaciatok); }
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
    public boolean getSedadla(){
        return this.sedadla;
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
    @Override
    public void setDlzkaCesty(int dlzkaCesty) {
        super.dlzkaCesty = dlzkaCesty;
    }
    @Override
    public int getDlzkaCesty() {
        return super.dlzkaCesty;
    }
}
