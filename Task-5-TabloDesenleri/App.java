public class App {
   public static void main(String[] args) {
        int sayi = 2;

        System.out.println("==================================");
        System.out.println("        2'NİN ÇARPIM TABLOSU      ");
        System.out.println("==================================");
        System.out.printf("%-10s %-10s%n", "İşlem", "Sonuç");
        System.out.println("----------------------------------");

        for (int i = 1; i <= 10; i++) {
            int sonuc = sayi * i;
            System.out.printf("%-10s %-10d%n", sayi + " x " + i, sonuc);
        }

        System.out.println("==================================");
    }
}
