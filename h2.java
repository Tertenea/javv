import java.util.Scanner;

public class h2 {

    private static final Scanner scanner = new Scanner(System.in);

    // main prog
    public static void main(String[] args) {

        double[] kiirused = sportKiirus();
        double kiirus1 = kiirused[0];
        double kiirus2 = kiirused[1];
        kiirusteVahe(kiirus1, kiirus2);
        tollMeetriks();
        ellips();
        minutTunniks();
    }

    // tollid meetriks conversion
    static void tollMeetriks() {
        System.out.print("Sisesta tollid: ");
        double toll = scanner.nextDouble();

        double meeter = toll * 0.0254;
        System.out.println(toll + " tolli on " + meeter + " meetrit");
    }

    // ellipsi pindala
    static void ellips() {
        System.out.print("Sisesta pooltelg a pikkus (cm): ");
        double a = scanner.nextDouble();

        System.out.print("Sisesta pooltelg b pikkus (cm): ");
        double b = scanner.nextDouble();

        double pi = Math.PI;

        double pindala = Math.round(pi * a * b * 100.0) / 100.0;

        System.out.println(
                "Ellipsi mille pooltelg A on " + a + " ja pooltelg B on " + b + " pindala on " + pindala + "cm^2");
    }

    // minutid tundideks
    public static void minutTunniks() {
        System.out.print("Sisesta minutid: ");
        int minut = scanner.nextInt();

        double tund = (double) minut / 60;
        int x = (int) Math.floor(tund);
        double minutid = Math.round((tund - x) * 60);

        System.out.println(minut + " minutit = " + x + " tund(i) ja " + minutid + " minutit");

    }

    static double[] sportKiirus() {
        System.out.print("Sisesta distants (km): ");
        double distants = scanner.nextDouble();

        System.out.print("Sisesta 1. sportlase aeg (h): ");
        double aeg1 = scanner.nextDouble();

        System.out.print("Sisesta 2. sportlase aeg (h): ");
        double aeg2 = scanner.nextDouble();

        double kiirus1 = Math.round(distants / aeg1 * 100.0) / 100.0;
        double kiirus2 = Math.round(distants / aeg2 * 100.0) / 100.0;

        System.out.println("1. sportlase kiirus: " + kiirus1 + "km/h, 2. sportlase kiirus: " + kiirus2 + "km/h");

        double[] kiirused = { kiirus1, kiirus2 };

        return kiirused;

    }

    // sportlaste kiiruste vahe
    static void kiirusteVahe(double kiirus1, double kiirus2) {
        double vahe = Math.round(Math.abs(kiirus1 - kiirus2) * 100.0) / 100.0;
        System.out.println("Sportlaste kiiruse vahe on: " + vahe + "km/h");
    }
}
