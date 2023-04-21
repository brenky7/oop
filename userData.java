package gui;

import com.autobusy.*;
import com.cestujuci.*;
import visitor.Visitor;
import java.util.Scanner;
import java.util.*;
import java.io.File;
import java.util.Scanner;

public class userData {
    HashMap<String, String> loginInfo = new HashMap<String, String>();

    public userData() {
        File file = new File("userInfo.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                loginInfo.put(parts[0], parts[1]);
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    } // dokoncit serializaciu - zapisovanie budgetu, konca trasy a casu odchodu do suboru
    public HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
