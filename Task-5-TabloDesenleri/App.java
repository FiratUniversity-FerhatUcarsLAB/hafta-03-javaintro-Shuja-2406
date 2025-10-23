public class App {
    public static void main(String[] args) {
        double[] milDegerleri = {1, 5, 10, 20, 50};
        double donusum = 1.609;

        System.out.println("==================================");
        System.out.println("       MİL → KİLOMETRE TABLOSU    ");
        System.out.println("==================================");
        System.out.printf("%-10s %-15s%n", "Mil", "Kilometre");
        System.out.println("----------------------------------");

        for (double mil : milDegerleri) {
            double km = mil * donusum;
            System.out.printf("%-10.2f %-15.3f%n", mil, km);
        }

        System.out.println("==================================");
    }
}