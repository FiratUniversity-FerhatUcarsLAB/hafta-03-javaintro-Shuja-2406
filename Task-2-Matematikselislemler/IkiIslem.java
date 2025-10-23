public class App {
    public static void main(String[] args) throws Exception {
         double pay = (9.5 * 4.5) - (2.5 * 3);   // 42.75 - 7.5 = 35.25
        double payda = 45.5 - 3.5;             // 42.0
        double sonuc = pay / payda;            // ~0.839285714...

        System.out.printf("Pay: %.4f%n", pay);
        System.out.printf("Payda: %.4f%n", payda);
        System.out.printf("Sonuç (4 ondalık basamak): %.4f%n", sonuc);
    }
}
