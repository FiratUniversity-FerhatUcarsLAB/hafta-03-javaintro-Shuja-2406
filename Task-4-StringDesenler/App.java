public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("==============================================");
        System.out.println("                 HESAP ÖZETİ                  ");
        System.out.println("==============================================");
        System.out.printf("%-15s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat");
        System.out.println("----------------------------------------------");

        System.out.printf("%-15s %-10d %-10.2f%n", "Laptop", 1, 24500.00);
        System.out.printf("%-15s %-10d %-10.2f%n", "Mouse", 2, 450.50);
        System.out.printf("%-15s %-10d %-10.2f%n", "Klavye", 1, 900.75);
        System.out.printf("%-15s %-10d %-10.2f%n", "Kulaklık", 1, 750.25);

        System.out.println("----------------------------------------------");
        double toplam = 24500.00 + (2 * 450.50) + 900.75 + 750.25;
        System.out.printf("%-15s %-10s %-10.2f%n", "Toplam", "", toplam);
        System.out.println("==============================================");
    }
}
