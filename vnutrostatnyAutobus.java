package com.autobusy;

public abstract class vnutrostatnyAutobus extends Autobus{

    protected int dlzkaCesty;
    public vnutrostatnyAutobus(int i, int i1, boolean b, boolean b1, boolean b2, boolean b3) {
        super(i, i1, b, b1, b2, b3);
    }
    public vnutrostatnyAutobus(){
        super();
    };
    public void setDlzkaCesty(int dlzkaCesty) {
        this.dlzkaCesty = dlzkaCesty;
    }
    public int getDlzkaCesty() {
        return this.dlzkaCesty;
    }
}
