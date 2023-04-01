package main;
import com.autobusy.zastavky;
import com.cestujuci.*;
import com.autobusy.*;

import java.util.ArrayList;
import java.util.Random;
public class createCestujuci {
    ArrayList<Cestujuci> poleCestujucich = new ArrayList<Cestujuci>();
    ArrayList<beznyClovek> poleBeznychCestujucich = new ArrayList<beznyClovek>();
    ArrayList<tehotnaZena> poleTehotnychZien = new ArrayList<tehotnaZena>();
    ArrayList<bohatyCestujuci> poleBohatychCestujucich = new ArrayList<bohatyCestujuci>();
    ArrayList<telesneZnevyhodneny> poleTelesneZnevyhodnenych = new ArrayList<telesneZnevyhodneny>();
    public ArrayList<Cestujuci> createMyCestujuci() {
        Random random = new Random();
        zastavka mojeZastavky = new zastavka();
        int trasa, budget, hodina, minuta;
        String koniec;
        for (int j = 0; j < 10; j++) {
            trasa = random.nextInt(13);
            budget = random.nextInt(30) + 5;
            hodina = random.nextInt(16)+6;
            minuta = random.nextInt(2)*30;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleTehotnychZien.add(new tehotnaZena(budget, "Bratislava", koniec, hodina, minuta));
        };
        for (int i = 0; i < 200; i++){
            trasa = random.nextInt(12) + 1;
            budget = random.nextInt(10) + 4;
            hodina = random.nextInt(16)+6;
            minuta = random.nextInt(2)*30;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleBeznychCestujucich.add(new beznyClovek(budget, "Bratislava", koniec, hodina, minuta));
        };
        for (int i = 0; i < 50; i++){
            trasa = random.nextInt(12) + 1;
            budget = random.nextInt(70) + 40;
            hodina = random.nextInt(16)+6;
            minuta = random.nextInt(2)*30;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleBohatychCestujucich.add( new bohatyCestujuci(budget, "Bratislava", koniec, hodina, minuta));
        }
        for (int i = 0; i < 7; i++){
            trasa = random.nextInt(12) + 1;
            budget = random.nextInt(35) + 10;
            hodina = random.nextInt(16)+6;
            minuta = random.nextInt(2)*30;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleTelesneZnevyhodnenych.add(new telesneZnevyhodneny(budget, "Bratislava", koniec, hodina, minuta));
        }
        poleCestujucich.addAll(poleBeznychCestujucich);
        poleCestujucich.addAll(poleBohatychCestujucich);
        poleCestujucich.addAll(poleTehotnychZien);
        poleCestujucich.addAll(poleTelesneZnevyhodnenych);
        return poleCestujucich;
    };
}
