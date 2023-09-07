import java.util.Scanner;

public class h5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            jagamine();
        }
    }

    static void jagamine() {
        System.out.print("Sisesta esimene arv: ");
        int arv1 = scanner.nextInt();
        System.out.print("Sisesta teine arv: ");
        int arv2 = scanner.nextInt();

        if (arv1 >= 0 && arv2 > 0) {
            double jagatis = (double) arv1 / arv2;
            System.out.println(String.format("%d / %d = %f", arv1, arv2, jagatis));
            return;
        } else {
            System.out.println("Arvud peavad olema positiivsed!");
        }

    }
}
