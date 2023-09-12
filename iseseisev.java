import java.util.Scanner;
import java.util.Random;

public class iseseisev {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        takistid();
        //tagurpidi();
        //yksKuniKuus();
        //liitmine();
        //randInt();

    }

    static void liitmine() {
        System.out.print("Sisesta esimene arv: ");
        int arv1 = scanner.nextInt();
        System.out.print("Sisesta teine arv: ");
        int arv2 = scanner.nextInt();
        System.out.printf("%d + %d = %d\n", arv1, arv2, arv1 + arv2);
    }

    static void randInt() {
        Random rand = new Random();
        int randInt = rand.nextInt(6);
        System.out.printf("Arv on %d\n", randInt);
    }

    static void yksKuniKuus() {
        for (int i = 0; i < 66; i++) {
            System.out.println(i + 1);
        }
    }

    static void paarisPaaritu() {
        System.out.print("Sisesta arv: ");
        int arv = scanner.nextInt();
        if (arv % 2 == 0) {
            System.out.printf("%d on paaris\n", arv);
        } else {
            System.out.printf("%d on paaritu\n", arv);
        }
    }

    static void tagurpidi() {
        System.out.print("Sisesta lause: ");
        String lause = scanner.nextLine();
        String[] sonad = lause.split(" ");
        for (int i = sonad.length - 1; i >= 0; i--) {
            System.out.println(sonad[i] + " ");
        }
    }

    static void takistid() {
        System.out.println("Sisesta takistite kogus: ");
        int takistx = scanner.nextInt();

        System.out.print("Rööpühenduse kogutakistus (1)\nJadaühenduse kogutakistus (2)\nTee valik: ");
        String valik = scanner.next();

        switch (Integer.parseInt(valik)) {
            case 1:
            for (int i = 0; i < takistx; i++) {
                System.out.println("seksikiisu" + i);
            }
        }
    }   
}
