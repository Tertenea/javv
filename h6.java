import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class h6 {
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<String> arvud = new ArrayList<String>();

    public static void main(String[] args) {
        kogumeArvud();
        double[] tulem = arvudeKeskmine();
        arvudFaili(arvud, tulem);
    }

    static ArrayList<String> kogumeArvud() {
        while (true) {
            System.out.println("Sisesta number või lõpetamiseks vajuta Enter: ");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            } else {
                arvud.add(input);
                System.out.println("Arvud: " + arvud);
            }
        }
        return arvud;
    }

    static double[] arvudeKeskmine() {
        double[] tulem = new double[2];

        if (arvud.isEmpty()) {
            System.out.println("Sisestatud arvude hulk on tühi.");
            return tulem;
        }

        int summa = 0;
        for (String arv : arvud) {
            summa += Integer.parseInt(arv);
        }

        double keskmine = (double) summa / arvud.size();

        System.out.println("Arvude summa: " + summa);
        System.out.println("Arvude keskmine: " + keskmine);

        tulem[0] = (double) summa;
        tulem[1] = keskmine;
        return tulem;
    }

    static void arvudFaili(ArrayList<String> arvud, double[] tulem) {
        File fail = new File("arvud.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fail));
            
            bw.write("Arvud: " + arvud.toString() + "\n");
            bw.write("Arvude summa: " + tulem[0] + "\n");
            bw.write("Arvude keskmine: " + tulem[1] + "\n");

            bw.close();
            System.out.println("Fail loodud!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
