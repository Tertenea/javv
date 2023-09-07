import java.util.Scanner;

public class h7 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        korrutamine();
    }

    static void korrutamine() {
        
        while(true)
        {
            try {
                System.out.println("Sisesta arv 1: ");
                int arv1 = Integer.parseInt(scanner.nextLine());

                System.out.println("Sisesta arv 2: ");
                int arv2 = Integer.parseInt(scanner.nextLine());

                int korrutis = arv1 * arv2;
                System.out.println("Korrutis: " + korrutis);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sisestatud arv ei ole number.");
            }
        }
    }
}
