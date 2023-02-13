public class Auto {
    private String Nev;
    private String Szin;
    private int Ev;
    private boolean IsSzervizelt;

    public Auto(String nev, String szin, int ev) {
        Nev = nev;
        Szin = szin;
        Ev = ev;
    }

    public void Szervizel() {
        System.out.println("A " + Nev + " pont most van a szervizben");
        IsSzervizelt = true;
    }

    public void TulajdonsagokatKiir() {
        System.out.println(Nev + " (" + Ev + "), szín: " + Szin + ", szervizelt? " + IsSzervizelt);
    }

    public String GetNev() {
        return Nev;
    }
}
