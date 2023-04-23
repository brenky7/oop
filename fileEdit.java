package gui;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fileEdit {


    public fileEdit(userData data, User user){
        File file = new File("userInfo.txt");
        try {
            Scanner scanner = new Scanner(file);
            List <String> lines = new ArrayList<String >();
            int index = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts[0].equals(user.getName())){
                    line = user.getName() + " " + user.getPassword() + " " + user.getBudget() + " " + user.getKoniecTrasy() + " " + user.getCasOdchodu();
                }
                lines.add(line);
            }
            scanner.close();
            PrintWriter writer = new PrintWriter(new FileWriter("userInfo.txt"));
            for (String s : lines) {
                writer.println(s);
            }
            writer.close();

        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
