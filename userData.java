package gui;

import java.util.Scanner;
import java.util.*;
import java.io.File;

public class userData{
    HashMap<String, User> loginInfo = new HashMap<String, User>();

    public userData() {
        File file = new File("userInfo.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length < 5) {
                    User user = new User(parts[0], parts[1], Integer.parseInt(parts[2]));
                    loginInfo.put(parts[0], user);
                } else {
                    User user = new User(parts[0], parts[1], Integer.parseInt(parts[2]), parts[3], parts[4]);
                    loginInfo.put(parts[0], user);
                }
            }
            scanner.close();
        } catch (Exception e) {
            //System.out.println("Error");
        }
    } // dokoncit serializaciu  konca trasy a casu odchodu do suboru
    public HashMap<String, User> getLoginInfo() {
        return loginInfo;
    }
}
