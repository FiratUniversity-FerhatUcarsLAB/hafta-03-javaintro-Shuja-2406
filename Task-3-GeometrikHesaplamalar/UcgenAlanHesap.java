public class App {
    public static void main(String[] args) throws Exception {
                double a = 3.0, b = 4.0, c = 5.0;

        double s = (a + b + c) / 2; // yarı çevre
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.printf("Kenarlar: a=%.1f, b=%.1f, c=%.1f%n", a, b, c);
        System.out.printf("Yarı çevre (s): %.2f%n", s);
        System.out.printf("Alan: %.4f%n", alan);
    }
}
