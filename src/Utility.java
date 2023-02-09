
import javax.print.DocFlavor;
import java.io.*;
import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Utility {
    public static List<AccountClass> readFromCSV(String path)  throws IOException {
        List <String> data = new ArrayList<>();
        List<AccountClass> accounts = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
        }
        for (String row : data) {
            String[] rowArray = row.split(",");
            if (rowArray[0].equalsIgnoreCase("checking")) {
                accounts.add(new Checking(rowArray[0], rowArray[1], Double.parseDouble(rowArray[3])));
            } else {
                accounts.add(new Savings(rowArray[0], rowArray[1], Double.parseDouble(rowArray[3])));
            }
        }
        return accounts;
    }
}




