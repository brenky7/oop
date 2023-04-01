package main;
import com.autobusy.*;
import com.cestujuci.*;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class main {

    public static void main(String[] args) throws IOException {
        ArrayList<Autobus> autobusy = new ArrayList<Autobus>();
        createBuses zapis = new createBuses();
        autobusy.addAll(zapis.createMyBuses(1));
        autobusy.addAll(zapis.createMyBuses(2));
        autobusy.addAll(zapis.createMyBuses(3));

        ArrayList<Cestujuci> cestujuci = new ArrayList<Cestujuci>();
        createCestujuci generacia = new createCestujuci();
        cestujuci = generacia.createMyCestujuci();
        System.out.println("Pocet autobusov: " + autobusy.size() + "\n");
        System.out.println("Pocet cestujucich: " + cestujuci.size() + "\n");
        /*for (Autobus autobus : autobusy) {
            autobus.printInfo();
            System.out.println();
        }*/
        /*for (Cestujuci clovek: cestujuci){
            clovek.printInfo();
            System.out.println();
        }*/

    }

}
