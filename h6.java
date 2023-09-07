import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class h6 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        arvudLoendisse();
    }

    static void arvudLoendisse() {
        ArrayList<Integer> arvud = new ArrayList<Integer>();
        int arv = 345;
        arvud.add(arv);
        System.out.println(arvud);
    }

}
