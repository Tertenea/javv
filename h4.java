import java.util.Scanner;

public class h4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta mingi tekst: ");
        String tekst = scanner.nextLine();
        System.out.println("Sisestatud tekst: " + tekst);
        System.out.println("Sisestatud tekst suurtähtedena: " + tekst.toUpperCase());
        System.out.println("Sisestatud teksti märkide arv: " + tekst.length());
        System.out.println("Sisestatud teksti sõnade arv: " + tekst.split(" ").length);

        String[] tykeldus = tekst.split(" ");
        System.out.println(String.format("Teksti esimene sõna on %s", tykeldus[0]));
    }
}
