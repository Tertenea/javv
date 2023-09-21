import java.util.Date;
import java.util.Scanner;

// tsikl
class Tsikkel {
    private String mark;
    private String mudel;
    private int aasta;
    private int kiirus;

    public Tsikkel(String mark, String mudel, int aasta, int kiirus) {
        this.mark = mark;
        this.mudel = mudel;
        this.aasta = aasta;
        this.kiirus = kiirus;
    }

    public void kiirenda() {
        this.kiirus += 10;
    }

    public String getMark() {
        return mark;
    }

    public int getAasta() {
        return aasta;
    }

    public int getKiirus() {
        return kiirus;
    }
}

// soitja
class Soitja {
    private String nimi;
    private int vanus;

    public Soitja(String nimi, int vanus) {
        this.nimi = nimi;
        this.vanus = vanus;
    }

    public void soidaTsikliga(Tsikkel tsikkel) {
        System.out.println(this.nimi + " soidab " + tsikkel.getMark() + " tsikliga mis on aastast " + tsikkel.getAasta() + ".");
        tsikkel.kiirenda();
        System.out.println(tsikkel.getMark() + " kiirus nüüd: " + tsikkel.getKiirus() + " km/h");
    }

    public String getNimi() {
        return nimi;
    }
}

// trenni rajad
class Treeningrada {
    private String nimi;
    private double pikkusKm;

    public Treeningrada(String nimi, double pikkusKm) {
        this.nimi = nimi;
        this.pikkusKm = pikkusKm;
    }

    public String getNimi() {
        return nimi;
    }
}

// teeb koik yheks klassiks
class TreeningSession {
    private Soitja soitja;
    private Tsikkel tsikkel;
    private Treeningrada treeningrada;
    private Date algusaeg;

    public TreeningSession(Soitja soitja, Tsikkel tsikkel, Treeningrada treeningrada) {
        this.soitja = soitja;
        this.tsikkel = tsikkel;
        this.treeningrada = treeningrada;
        this.algusaeg = new Date(); // trenni algus
    }

    public void lopetaTreening() {
        Date lopuAeg = new Date(); // Praegune aeg
        long kestusMillis = lopuAeg.getTime() - this.algusaeg.getTime(); // Kestuse arvutamine millisekundites
        double kestusSekundites = kestusMillis / 1000.0; // Kestus sekundites
        System.out.println(this.soitja.getNimi() + " treenis " + this.treeningrada.getNimi() +
                "rajal " + String.format("%.2f", kestusSekundites) + " sekundit.");
    }
}

public class h9 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // tsikl, soitja ja trenniraja objektid
        Tsikkel tsikkel1 = new Tsikkel("Honda", "Hornet", 2009, 210);
        Soitja soitja1 = new Soitja("Kenti isa", 40);
        Treeningrada treeningrada1 = new Treeningrada("Tallinna ring", 5.0);

        Tsikkel tsikkel2 = new Tsikkel("Yamaha", "R1", 1998, 200);
        Soitja soitja2 = new Soitja("Marko", 52);
        Treeningrada treeningrada2 = new Treeningrada("Pärnu ring", 4.0);

        // trenni sesh
        TreeningSession treeningSession1 = new TreeningSession(soitja1, tsikkel1, treeningrada1);
        TreeningSession treeningSession2 = new TreeningSession(soitja2, tsikkel2, treeningrada2);

        soitja1.soidaTsikliga(tsikkel1);
        soitja2.soidaTsikliga(tsikkel2);

        System.out.println("Kui soovid lõpetada treeningu, vajuta ENTER");
        scanner.nextLine();

        treeningSession1.lopetaTreening();
        treeningSession2.lopetaTreening();
    }
}
