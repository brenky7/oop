package main;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import com.autobusy.*;
import java.util.Scanner;

public class createBuses {
    ArrayList<Autobus> autobusy = new ArrayList<Autobus>();
    ArrayList<medzistatnyAutobus> medziStatneAutobusy = new ArrayList<medzistatnyAutobus>();
    ArrayList<beznyBus> bezneAutobusy = new ArrayList<beznyBus>();
    ArrayList<comfortMini> comfortAutobusy = new ArrayList<comfortMini>();
    File medzistatneBusy = new File("medzistatnyRozpis.txt");
    File bezneBusy = new File("beznyRozpis.txt");
    File comfortBusy = new File("comfortRozpis.txt");




    public ArrayList<Autobus> createMyBuses(int i){
        if (i == 1){
            try {
                Scanner scanner = new Scanner(medzistatneBusy);
                int counter = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.equals("$")) {
                        medziStatneAutobusy.add(new medzistatnyAutobus());
                        medziStatneAutobusy.get(counter).setCapacita(scanner.nextInt());
                        medziStatneAutobusy.get(counter).setCena(scanner.nextInt());
                        medziStatneAutobusy.get(counter).setWifi(true);
                        medziStatneAutobusy.get(counter).setKlima(true);
                        medziStatneAutobusy.get(counter).setToaleta(true);
                        medziStatneAutobusy.get(counter).setNabijanie(true);
                        medziStatneAutobusy.get(counter).addZastavka(scanner.next());
                        medziStatneAutobusy.get(counter).addZastavka(scanner.next());
                        medziStatneAutobusy.get(counter).addZastavka(scanner.next());
                        medziStatneAutobusy.get(counter).addZastavka(scanner.next());
                        medziStatneAutobusy.get(counter).addZastavka(scanner.next());
                        medziStatneAutobusy.get(counter).setCasOdchodu(scanner.next());
                        medziStatneAutobusy.get(counter).setTrasaZaciatok();
                        medziStatneAutobusy.get(counter).setTrasaKoniec();
                        counter++;
                    }
                }
                scanner.close();
                autobusy.addAll(medziStatneAutobusy);
                return autobusy;
            }
            catch (Exception e){
                System.out.println("Error");
            }
        }
        else if (i == 2){
            try {
                Scanner scanner = new Scanner(bezneBusy);
                int counter = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.equals("$")) {
                        bezneAutobusy.add(new beznyBus());
                        bezneAutobusy.get(counter).setCapacita(scanner.nextInt());
                        bezneAutobusy.get(counter).setCena(scanner.nextInt());
                        bezneAutobusy.get(counter).setTrasaZaciatok(scanner.next());
                        bezneAutobusy.get(counter).setTrasaKoniec(scanner.next());
                        bezneAutobusy.get(counter).setCasOdchodu(scanner.next());
                        bezneAutobusy.get(counter).setDlzkaCesty(scanner.nextInt());
                        int wifi = scanner.nextInt();
                        if (wifi == 1) {
                            bezneAutobusy.get(counter).setWifi(true);
                        } else {
                            bezneAutobusy.get(counter).setWifi(false);
                        }

                        bezneAutobusy.get(counter).setKlima(true);
                        bezneAutobusy.get(counter).setToaleta(false);
                        bezneAutobusy.get(counter).setNabijanie(false);
                        counter++;
                    }
                }
                scanner.close();
                autobusy.addAll(bezneAutobusy);
                return autobusy;
            }
            catch (Exception e){
                System.out.println("Error");
            }
        }
        else if(i == 3){
            try {
                Scanner scanner = new Scanner(comfortBusy);
                int counter = 0;
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    if (line.equals("$")) {
                        comfortAutobusy.add(new comfortMini());
                        comfortAutobusy.get(counter).setCapacita(scanner.nextInt());
                        comfortAutobusy.get(counter).setCena(scanner.nextInt());
                        comfortAutobusy.get(counter).setTrasaZaciatok(scanner.next());
                        comfortAutobusy.get(counter).setTrasaKoniec(scanner.next());
                        comfortAutobusy.get(counter).setDlzkaCesty(scanner.nextInt());
                        comfortAutobusy.get(counter).setCasOdchodu(scanner.next());
                        comfortAutobusy.get(counter).setWifi(true);
                        comfortAutobusy.get(counter).setKlima(true);
                        comfortAutobusy.get(counter).setToaleta(false);
                        comfortAutobusy.get(counter).setNabijanie(true);
                        comfortAutobusy.get(counter).setSedadla(true);
                        counter++;
                    }
                }
                scanner.close();
                autobusy.addAll(comfortAutobusy);
                return autobusy;
            }
            catch (Exception e){
                System.out.println("Error");
            }
        }
        return autobusy;
    }

}
