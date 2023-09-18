public class Ruumalad {
    public static double risttahukasV(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus;
        return s;
    }

    public static double silinderV(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus;
        return s;
    }

    public static double ballsV(String a, String h) {
        float alus = Float.parseFloat(a);
        float korgus = Float.parseFloat(h);
        double s = alus * korgus/2;
        return s;
    }
}
