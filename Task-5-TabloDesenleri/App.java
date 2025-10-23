public class App {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("        ÜSLÜ SAYILAR TABLOSU      ");
        System.out.println("==================================");
        System.out.printf("%-5s %-10s %-10s%n", "a", "a^2", "a^3");
        System.out.println("----------------------------------");

        for (int a = 1; a <= 5; a++) {
            int karesi = (int) Math.pow(a, 2);
            int kupu = (int) Math.pow(a, 3);
            System.out.printf("%-5d %-10d %-10d%n", a, karesi, kupu);
        }

        System.out.println("==================================");
    }
}