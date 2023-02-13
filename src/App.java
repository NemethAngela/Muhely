import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // beolvas
        FileHelper fh = new FileHelper();
        ArrayList<Auto> autok = fh.Beolvas();

        // beolvasott autók kiírása
        for (Auto a : autok) {
            a.TulajdonsagokatKiir();
        }

        // auto osztály -> metódus (szervizel)
        for (Auto a : autok) {
            a.Szervizel();
        }

        // autók kiír (+ tulajdonság : volt-e szewrvizelve)
        for (Auto a : autok) {
            a.TulajdonsagokatKiir();
        }

        // számolja meg az autókat
        System.out.println("Autók száma: " + autok.size());

        // Kiírás fájlba
        fh.FajlbaIras(autok);
    }
}
