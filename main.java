package main;
import java.util.Observer;
import gui.*;
import com.autobusy.*;
import com.cestujuci.*;
import observer.*;
import java.io.IOException;
import java.util.ArrayList;



public class main {
    public static void main(String[] args) throws IOException {
        ArrayList<Autobus> autobusy = new ArrayList<Autobus>();
        createBuses zapis = new createBuses();
        autobusy.addAll(zapis.createMyBuses(1));
        autobusy.addAll(zapis.createMyBuses(2));
        autobusy.addAll(zapis.createMyBuses(3));
        Observer pozorovatel = new pozorovatelBusov();
        for (Autobus autobus : autobusy) {
            autobus.addObserver(pozorovatel);
        }
        ArrayList<Cestujuci> cestujuci = new ArrayList<Cestujuci>();
        createCestujuci generacia = new createCestujuci();
        cestujuci = generacia.createMyCestujuci();
        System.out.println("Pocet autobusov: " + autobusy.size() + "\n");
        System.out.println("Pocet cestujucich: " + cestujuci.size() + "\n");
        matchMaking sparuj = new matchMaking(autobusy, cestujuci);
        sparuj.match();
        int counter2 = 0;
        for (Autobus autobus : autobusy) {
            if (autobus.getCapacita() == 0) {
                autobus.printInfo();
                System.out.println();
                counter2++;
            }
            else{
                autobus.printInfo();
                System.out.println();
            }
        }
        System.out.println("Pocet autobusov, ktore su plne: " + counter2);
        /*for (Cestujuci clovek: cestujuci){
            if (clovek instanceof bohatyCestujuci) {
                clovek.printInfo();
                System.out.println();
            }
        }*/
        mojFrame frame = new mojFrame();

        /*JLabel label = new JLabel("Autobusy");
        ImageIcon icon = new ImageIcon("logo.png");
        label.setForeground(Color.cyan);
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setForeground(Color.blue);
        label.setVisible(true);

        label.setBounds(200, 200, 150, 150);
        frame.getContentPane().add(label);
        frame.setVisible(true);*/

    }

}
