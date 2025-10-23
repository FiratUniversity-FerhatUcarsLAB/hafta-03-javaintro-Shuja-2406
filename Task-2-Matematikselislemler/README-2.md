240541608
Shuja Ahmad Tariq

public class Hesaplama {
    public static void main(String[] args) {
        // 2.1 - Toplama Serisi
        int toplam = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9;
        System.out.println("2.1 - Toplama Serisi Sonucu: " + toplam);

        // 2.2 - İki İşlem Sonucu
        double pay = 9.5 * 4.5 - 2.5 * 3;
        double payda = 45.5 - 3.5;
        double sonuc = pay / payda;
        System.out.printf("2.2 - İki İşlem Sonucu: %.4f%n", sonuc);

        // 2.3 - Faktöriyel Hesabı
        int sayi = 5;
        int faktoriyel = 1;
        System.out.print("2.3 - Faktöriyel Hesap Adımları: ");
        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;
            System.out.print(i);
            if (i > 1) System.out.print(" x ");
        }
        System.out.println(" = " + faktoriyel);
    }
}
