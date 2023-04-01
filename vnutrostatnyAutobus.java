package com.autobusy;

public abstract class vnutrostatnyAutobus extends Autobus{

    protected int dlzkaCesty;
    public vnutrostatnyAutobus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        super(i, i1, b, b1, b2, b3);
    }
    public vnutrostatnyAutobus(){
        super();
    };
    public abstract void setDlzkaCesty(int dlzkaCesty);
    public abstract int getDlzkaCesty();

    public void setTrasaZaciatok(String trasaZaciatok){
        this.trasaZaciatok = trasaZaciatok;
    };
    public void setTrasaKoniec(String trasaKoniec){
        this.trasaKoniec = trasaKoniec;
    };
}
