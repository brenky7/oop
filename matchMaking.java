package main;
import com.cestujuci.*;
import com.autobusy.*;

import java.util.ArrayList;

public class matchMaking {
    public ArrayList<Autobus> poleAutobusov = new ArrayList<Autobus>();
    public ArrayList<Cestujuci> poleCestujucich = new ArrayList<Cestujuci>();
    public matchMaking(ArrayList<Autobus> autobusy, ArrayList<Cestujuci> cestujuci){
        this.poleAutobusov = autobusy;
        this.poleCestujucich = cestujuci;
    }
    public void match(){
        int counter = 0, counterZnevyhodnenych = 0, counterTehotnych = 0, counterBohatych = 0, counterBeznych = 0;
        for (Cestujuci clovek: poleCestujucich){
            for (Autobus autobus : poleAutobusov) {
                if (autobus instanceof medzistatnyAutobus) {
                    if ((((medzistatnyAutobus) autobus).najdiZastavku(clovek.getTrasaKoniec())) && (clovek.getCasOdchodu().equals(autobus.getCasOdchodu()))) {
                        int capacita = autobus.getCapacita();
                        int budget = clovek.getBudget();
                        if ((capacita > 0) && (budget >= autobus.getCena())) {
                            if (clovek instanceof telesneZnevyhodneny) {
                                counterZnevyhodnenych++;
                            } else if (clovek instanceof tehotnaZena) {
                                counterTehotnych++;
                            } else if (clovek instanceof bohatyCestujuci) {
                                counterBohatych++;
                            } else if (clovek instanceof beznyClovek) {
                                counterBeznych++;
                            }
                            autobus.setCapacita(capacita - 1);
                            clovek.setBooked(true);
                            counter++;
                            break;
                        }
                    }
                }
                else {
                    if ((autobus.getTrasaKoniec().equals(clovek.getTrasaKoniec())) && (clovek.getCasOdchodu().equals(autobus.getCasOdchodu()))) {
                        int capacita = autobus.getCapacita();
                        int budget = clovek.getBudget();
                        if ((capacita > 0) && (budget >= autobus.getCena())) {
                            if (clovek instanceof telesneZnevyhodneny) {
                                counterZnevyhodnenych++;
                            } else if (clovek instanceof tehotnaZena) {
                                counterTehotnych++;
                            } else if (clovek instanceof bohatyCestujuci) {
                                counterBohatych++;
                            } else if (clovek instanceof beznyClovek) {
                                counterBeznych++;
                            }
                            autobus.setCapacita(capacita - 1);
                            clovek.setBooked(true);
                            counter++;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("Pocet cestujucich, ktorym sa podarilo najst autobus: " + counter);
        System.out.println("Pocet telesne znevyhodnenych: " + counterZnevyhodnenych);
        System.out.println("Pocet tehotnych zien: " + counterTehotnych);
        System.out.println("Pocet bohatych cestujucich: " + counterBohatych);
        System.out.println("Pocet beznych cestujucich: " + counterBeznych);
    }
}
