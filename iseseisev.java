import java.util.Scanner;
import java.util.Random;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class iseseisev {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String filepath = "students.csv";
    private static final Random rand = new Random();

    public static void main(String[] args) {
        // loop mis küsib kasutajalt valiku ja käivitab vastava koodi
        boolean loop = true;
        while (loop) {
            System.out.print("Millist programmi soovid?\nLause tagurpidi pööramine (1)\nTakistid (2)\nPaaris või paaritu (3)\nÜhest kuuekümnekuueni (4)\nÕpilaste failist lugemine (5)\nSulge programm (6)\nTee valik: ");
            String valik = scanner.next();

            switch (Integer.parseInt(valik)) {
                case 1:
                    tagurpidi();
                    break;
                case 2:
                    takistid();
                    break;
                case 3:
                    paarisPaaritu();
                    break;
                case 4:
                    yksKuusKuus();
                    break;
                case 5:
                    opilasteFailiProg();
                    break;
                case 6:
                    loop = false;
                    break;   
                default:
                    System.out.println("sellist valikut pole");
                    break;
            }
            // kaks sekundit ootamist et eelmise asja prinditud tekst loetav oleks
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {}
        }
    }
    // "menüü" milles saab valida mida õpilaste failist lugeda
    static void opilasteFailiProg() {
        List<String> read = loeReadFailist(filepath);
        if (read == null) {
            return;
        }
        System.out.println("Mida soovid näha?\nÕpilaste arv (1)\nEsimesed kümme (2)\nSuvalised kolm (3)\nAinult email (4)\nNime esitäht (5)\nPerenimest parool (6)\nTee valik:");
        String valik2 = scanner.next();
        switch (Integer.parseInt(valik2)) {
            case 1:
                opilasteArv(read);
                break;
            case 2:
                essaKymme(read);
                break;
            case 3:
                suvalisedKolm(read);
                break;
            case 4:
                ainultEmail(read);
                break;
            case 5:
                esiTahed(read);
                break;
            case 6:
                perenimePasswd(read);
                break;
            default:
                System.out.println("sellist valikut pole");
                break;
        }
    }

    // prindib numbrid 1-66 ühe reana
    static void yksKuusKuus() {
        for (int i = 0; i < 66; i++) {
            System.out.print(i + 1);
        }
        System.out.println();
    }

    // prindib kas kasutaja sisestatud arv on paaris või paaritu
    static void paarisPaaritu() {
        System.out.print("Sisesta arv: ");
        int arv = scanner.nextInt();
        scanner.nextLine();
        if (arv % 2 == 0) {
            System.out.printf("%d on paaris\n", arv);
        } else {
            System.out.printf("%d on paaritu\n", arv);
        }
    }

    // prindib kasutaja sisestatud lause sõnad tagurpidises järjekorras
    static void tagurpidi() {
        System.out.print("Sisesta lause: ");
        scanner.nextLine();
        String lause = scanner.nextLine();
        String[] sonad = lause.split(" ");
        for (int i = sonad.length - 1; i >= 0; i--) {
            System.out.print(sonad[i] + " ");
        }
        System.out.println();
    }

    // küsib kasutajalt kas ta tahab arvutada rööpühenduse või jadaühenduse  
    // kogutakistust ja arvutab selle vastavalt kasutaja sisestusele
    static void takistid() {
        System.out.print("Rööpühenduse kogutakistus (1)\nJadaühenduse kogutakistus (2)\nTee valik: ");
        String valik = scanner.next();

        System.out.println("Sisesta takistite kogus: ");
        int takistx = scanner.nextInt();

        switch (Integer.parseInt(valik)) {
            case 1:
                double kogutakistus = 0.0;
                double x;
                for (int i = 0; i < takistx; i++) {
                    System.out.println("Sisesta " + (i + 1) + ". takisti takistus(Ohm): ");
                    x = scanner.nextInt();
                    kogutakistus += (1 / x);
                }
                double y = 1 / kogutakistus * 100;
                double z = Math.round(y);
                System.out.println("Kogutakistus on " + (z / 100) + " Ohm");
                break;

            case 2:
                int summa = 0;
                int jadatakistus[] = new int[takistx];
                for (int i = 0; i < takistx; i++) {
                    System.out.println("Sisesta " + (i + 1) + ". takisti takistus(Ohm): ");
                    jadatakistus[i] = scanner.nextInt();
                }
                for (int jadatakisti : jadatakistus) {
                    summa += jadatakisti;
                }
                System.out.println("Kogutakistus on " + summa + " Ohm");
                break;
        }
    }

    // loeb failist read ja paneb need listi
    private static List<String> loeReadFailist(String filepath) {
        try {
            return Files.lines(Paths.get(filepath)).collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("ei saa lugeda faili");
            return null;
        }
    }

    // loeb listist õpilaste arvu ja prindib selle
    private static void opilasteArv(List<String> read) {
        System.out.println("Õpilaste arv on " + (read.size() - 1));
    }

    // prindib listist esimese kümne õpilase info
    private static void essaKymme(List<String> read) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(read.get(i));
        }
    }

    // prindib listist kolme suvalise õpilase info
    private static void suvalisedKolm(List<String> read) {
        for (int i = 0; i < 3; i++) {
            int randInt = rand.nextInt(read.size() - 1);
            System.out.println(read.get(randInt + 1));
        }
    }

    // prindib listist ainult õpilaste emailid
    private static void ainultEmail(List<String> read) {
        for (int i = 0; i < read.size(); i++) {
            String[] split = read.get(i).split(",");
            System.out.println(split[3]);
        }
    }

    // prindib listist õpilaste nime esitähe
    private static void esiTahed(List<String> read) {
        for (int i = 0; i < read.size(); i++) {
            String[] split = read.get(i).split(",");
            System.out.println(split[0].charAt(0) + ". " + split[1]);
        }
    }

    // prindib parooli mis koosneb õpilase perenimest ja suvalisest kolmekohalisest numbrist
    private static void perenimePasswd(List<String> read) {
        for (int i = 0; i < read.size(); i++) {
            int randInt = rand.nextInt(900) + 99;
            String[] split = read.get(i).split(",");
            System.out.println(split[2] + randInt);
        }
    }
}
