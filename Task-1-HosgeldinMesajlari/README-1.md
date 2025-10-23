240541608
Shuja Ahmad Tariq

/*
 * Görev 1.1 - Üç Mesaj
 * Bu program ekrana üç farklı mesaj yazdırır:
 * "Java'ya Hoş Geldiniz", "Bilgisayar Bilimine Hoş Geldiniz",
 * ve "Programlama Eğlencelidir". Her biri ayrı satırda gösterilir.
 */

public class Task1_1 {
    public static void main(String[] args) {
        System.out.println("Java'ya Hoş Geldiniz");
        System.out.println("Bilgisayar Bilimine Hoş Geldiniz");
        System.out.println("Programlama Eğlencelidir");
    }
}

/*
 * Görev 1.2 - Beş Kere Tekrar
 * Bu program "Java'ya Hoş Geldiniz" mesajını
 * ekrana beş kez yazar. 
 * Döngü (for) yapısı kullanılarak tekrarlama işlemi yapılır.
 */

public class Task1_2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Java'ya Hoş Geldiniz");
        }
    }
}


/*
 * Görev 1.3 - Desen Çizme
 * Bu program döngü kullanmadan, yalnızca println satırlarıyla
 * "JAVA" kelimesinden oluşan bir desen çizer.
 * Her satır ayrı bir System.out.println ifadesiyle yazılmıştır.
 */

public class Task1_3 {
    public static void main(String[] args) {
        System.out.println("  JJJJJ    AAAAA    V     V    AAAAA");
        System.out.println("    J      A   A     V   V     A   A");
        System.out.println("    J      A   A      V V      A   A");
        System.out.println("    J      AAAAA       V       AAAAA");
        System.out.println("J   J      A   A       V       A   A");
        System.out.println(" JJJ       A   A       V       A   A");
    }
}
