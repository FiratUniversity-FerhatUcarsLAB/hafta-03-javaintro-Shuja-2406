public class App {
    public static void main(String[] args) throws Exception {
        double en = 4.5;
        double boy = 7.9;

        double alan = en * boy;
        double cevre = 2 * (en + boy);

        System.out.printf("En: %.2f, Boy: %.2f%n", en, boy);
        System.out.printf("Alan: %.4f%n", alan);
        System.out.printf("Çevre: %.4f%n", cevre);
    }
}
