package main;
import com.cestujuci.*;

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
        for (int j = 0; j < 30; j++) {
            trasa = random.nextInt(3);
            budget = random.nextInt(30) + 10;
            hodina = random.nextInt(5)+3;
            minuta = 0;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleTehotnychZien.add(new tehotnaZena(budget, "Bratislava", koniec, (hodina*2) + 1 , minuta));
        };
        for (int i = 0; i < 1200; i++){
            trasa = random.nextInt(10)+3;
            budget = random.nextInt(15) + 6;
            hodina = random.nextInt(5) + 3;
            minuta = 0;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleBeznychCestujucich.add(new beznyClovek(budget, "Bratislava", koniec, (hodina*2)+1 , minuta));
        };
        for (int i = 0; i < 200; i++){
            trasa = random.nextInt(13);
            budget = random.nextInt(70) + 40;
            hodina = random.nextInt(5) + 3;
            minuta = 0;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleBohatychCestujucich.add( new bohatyCestujuci(budget, "Bratislava", koniec, (hodina*2)+1, minuta));
        }
        for (int i = 0; i < 15; i++){
            trasa = random.nextInt(3) ;
            budget = random.nextInt(35) + 10;
            hodina = random.nextInt(5)+3;
            minuta = 0;
            koniec = mojeZastavky.zastavky.get(trasa);
            poleTelesneZnevyhodnenych.add(new telesneZnevyhodneny(budget, "Bratislava", koniec, (hodina*2)+1 , minuta));
        }
        poleCestujucich.addAll(poleTehotnychZien);
        poleCestujucich.addAll(poleTelesneZnevyhodnenych);
        poleCestujucich.addAll(poleBohatychCestujucich);
        poleCestujucich.addAll(poleBeznychCestujucich);
        return poleCestujucich;
    };
}
