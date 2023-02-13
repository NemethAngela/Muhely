import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {
    public ArrayList<Auto> Beolvas() {
        ArrayList<Auto> autok = new ArrayList<Auto>();

        FileReader reader = null;
        try {
            reader = new FileReader("autok.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("Nincs meg a fájl!");
        }
        Scanner scan = new Scanner(reader);
        while (scan.hasNext()) {
            String row = scan.nextLine();
            String rowSplittelt[] = row.split(";");
            Auto auto = new Auto(rowSplittelt[0], rowSplittelt[1], Integer.parseInt(rowSplittelt[2]));
            autok.add(auto);
        }
        scan.close();

        return autok;
    }

    public void FajlbaIras(ArrayList<Auto> autok) {
        try {
            FileWriter writer = new FileWriter("output.txt", false);
            for (Auto auto : autok) {
                writer.write(auto.GetNev() + "\n");
            }
            writer.close();
        } catch(Exception e) {
            System.out.println("Hiba az írás során.");
        }
    }
}
