package gui;

import com.autobusy.Autobus;
import com.cestujuci.Cestujuci;
import visitor.Visitor;
import visitor.pridajCestujuceho;

public class User extends Cestujuci {
    protected String name;
    protected String password;
    protected int budget;
    protected String casOdchodu;
    protected String koniecTrasy;
    public User(){
        this.name = "";
        this.password = "";
        this.budget = 0;
        this.casOdchodu = "";
        this.koniecTrasy = "";
    }

    public User(String part, String part1, int parseInt, String part2, String part3) {
        this.name = part;
        this.password = part1;
        this.budget = parseInt;
        this.casOdchodu = part2;
        this.koniecTrasy = part3;
    }

    public User(String username, String password, int budget) {
        this.name = username;
        this.password = password;
        this.budget = budget;
        this.casOdchodu = "";
        this.koniecTrasy = "";
    }

    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return this.password;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setBudget(int budget){
        this.budget = budget;
    }
    public void setCasOdchodu(String casOdchodu){
        this.casOdchodu = casOdchodu;
    }
    public void setKoniecTrasy(String koniecTrasy){
        this.koniecTrasy = koniecTrasy;
    }
    public String getName(){
        return this.name;
    }
    public int getBudget(){
        return this.budget;
    }

    @Override
    public void accept(Autobus autobus, Visitor visitor) {
        visitor.pridajUsera(autobus, this);
    }

    public String getCasOdchodu(){
        return this.casOdchodu;
    }

    @Override
    public void printInfo() {
        System.out.println("User: " + this.name + " " + this.password + " " + this.budget + " " + this.casOdchodu + " " + this.koniecTrasy);
    }

    public String getKoniecTrasy(){
        return this.koniecTrasy;
    }

}
