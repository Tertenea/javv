import java.util.Scanner;

public class h8_2 {
    private String mudel;
    private String varv;
    private int kiirus;

    private static Scanner scanner = new Scanner(System.in);
    // (mait) konts truktor
    public h8_2(String mudel, String varv) {
        this.mudel = mudel;
        this.varv = varv;
        this.kiirus = 50;
    }

    public static void main(String[] args) {
        // kaks objekti näitena
        h8_2 auto1 = new h8_2("Bemm", "must");
        h8_2 auto2 = new h8_2("Mersu", "valge");

        // auto statid enne muutusi
        System.out.println("h8_2 1: " + auto1.autoKirjeldus());
        System.out.println("h8_2 2: " + auto2.autoKirjeldus());

        // auto 1 kiirendas
        System.out.println("Kui palju kiirendab auto 1 (kiiruse muutus km/h): ");
        int kiiruseMuutus1 = scanner.nextInt();

        auto1.suurendaKiirust(kiiruseMuutus1);

        // auto 2 pani pidurit
        System.out.println("Kui palju pidurdab auto 2 (kiiruse muutus km/h): ");
        int kiiruseMuutus2 = scanner.nextInt();

        auto2.vahendaKiirust(kiiruseMuutus2);

        // auto statid peale muutusi
        System.out.println("h8_2 1: " + auto1.autoKirjeldus());
        System.out.println("h8_2 2: " + auto2.autoKirjeldus());
    }

    // kiirendus
    public void suurendaKiirust(int kiiruseMuutus) {
        this.kiirus += kiiruseMuutus;
        System.out.println("h8_2 kiirendas " + kiiruseMuutus + " km/h võrra, uus kiirus: " + this.kiirus + " km/h");
    }

    // pidurid
    public void vahendaKiirust(int kiiruseMuutus) {
        this.kiirus -= kiiruseMuutus;
        System.out.println("h8_2 pani pidurit ja aeglustas " + kiiruseMuutus + " km/h võrra, uus kiirus: " + this.kiirus + " km/h");
    }

    // auto statid
    public String autoKirjeldus() {
        return "h8_2 mudel: " + this.mudel + ", värv: " + this.varv + ", kiirus: " + this.kiirus + " km/h";
    }
}
