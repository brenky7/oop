package com.autobusy;

public abstract class vnutrostatnyAutobus extends Autobus{

    protected int dlzkaCesty;
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
