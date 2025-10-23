240541608 
Shuja Ahmad Tariq

public class GeometrikSekiller {
    public static void main(String[] args) {
        // 3.1 - Daire
        double r = 5.5;
        double daireAlan = Math.PI * r * r;
        double daireCevre = 2 * Math.PI * r;
        System.out.printf("3.1 - Daire Alan: %.2f, Çevre: %.2f%n", daireAlan, daireCevre);

        // 3.2 - Dikdörtgen
        double en = 4.5, boy = 7.9;
        double dikdortgenAlan = en * boy;
        double dikdortgenCevre = 2 * (en + boy);
        System.out.printf("3.2 - Dikdörtgen Alan: %.2f, Çevre: %.2f%n", dikdortgenAlan, dikdortgenCevre);

        // 3.3 - Üçgen (Heron Formülü)
        double a = 3, b = 4, c = 5;
        double s = (a + b + c) / 2;
        double ucgenAlan = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("3.3 - Üçgen Alan: %.2f%n", ucgenAlan);
    }
}
