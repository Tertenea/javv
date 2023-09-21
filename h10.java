// loom
class Loom {
    String nimi;

    Loom(String nimi) {
        this.nimi = nimi;
    }

    void toit() {
        System.out.println(nimi + " sööb erinevaid asju.");
    }
}

// ussid vmidagi
class Roomaja extends Loom {
    String liik;

    Roomaja(String nimi, String liik) {
        super(nimi);
        this.liik = liik;
    }

    @Override
    void toit() {
        System.out.println(nimi + " on " + liik + " ja sööb putukaid.");
    }
}

// birb
class Lind extends Loom {
    String lendamiseKiirus;

    Lind(String nimi, String lendamiseKiirus) {
        super(nimi);
        this.lendamiseKiirus = lendamiseKiirus;
    }

    @Override
    void toit() {
        System.out.println(nimi + " on " + lendamiseKiirus + " ja sööb ussikesi ja putukaid ja saia.");
    }
}

// feesh
class Kala extends Loom {
    String veekeskkond;

    Kala(String nimi, String veekeskkond) {
        super(nimi);
        this.veekeskkond = veekeskkond;
    }

    @Override
    void toit() {
        System.out.println(nimi + " elab vees ja sööb planktonit.");
    }
}

public class App {
    public static void main(String[] args) {
        Loom roomaja = new Roomaja("Uss", "roomaja");
        Loom lind = new Lind("Tuvi", "kiire");
        Loom kala = new Kala("Lõhe", "jõgi");

        roomaja.toit();
        lind.toit();
        kala.toit();
    }
}
