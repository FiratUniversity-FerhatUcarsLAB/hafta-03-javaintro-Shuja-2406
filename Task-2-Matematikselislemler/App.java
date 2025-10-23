public class App {
    public static void main(String[] args) throws Exception {
     int n = 5;
        int faktoriyel = 1;

        System.out.println(n + "! hesaplama adımları:");
        for (int i = n; i >= 1; i--) {
            int onceki = faktoriyel;
            faktoriyel *= i; // faktoriyel = faktoriyel * i

            if (onceki == 0 || onceki == 1) {
                // ilk çarpım (1 * 5) olarak göstermek yerine temiz gösterim
                System.out.println("Adım: " + i + " -> ara sonuç = " + faktoriyel);
            } else {
                System.out.println("Adım: çarp " + i + " -> ara sonuç = " + faktoriyel);
            }
        }
        System.out.println("Sonuç: " + n + "! = " + faktoriyel);
    }
}