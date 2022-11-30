import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        String a, b;

        Number zahl1;
        Number zahl2;

        while (true) {
            System.out.println("1. Addition");
            System.out.println("2. Subtrakrtion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Potenz");
            System.out.println("6. isPrime");
            System.out.println("7. isOdd");
            System.out.println("8. IsEven");
            System.out.println("9. gratherThan");
            System.out.println("10. lessThan");
            System.out.println("11. equals");
            System.out.println("12. toPinguNumber");
            System.out.println("13. Beenden");
            int input = scanner.nextInt();
            switch (input) {
                case 1 -> {
                    System.out.println("1. Integer");
                    System.out.println("2. String");
                    input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("Geben sie zwei Zahlen ein: ");
                        x = scanner.nextInt();
                        y = scanner.nextInt();

                        zahl1 = new Number(x);
                        zahl2 = new Number(y);

                        zahl1.add(zahl2);
                    } else {
                        System.out.println("Gib zwei Pingu zahlen ein: (Pin = 2 | Gu = 1 | In = 0)");
                        a = scanner.next();
                        b = scanner.next();

                        zahl1 = new Number(a);
                        zahl2 = new Number(b);

                        zahl1.add(zahl2);
                    }
                }
                case 2 -> {
                    System.out.println("Geben sie zwei Zahlen ein: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl2 = new Number(y);
                    zahl1.subtract(zahl2);
                }
                case 3 -> {
                    System.out.println("Geben sie zwei Zahlen ein: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl2 = new Number(y);
                    zahl1.multiply(zahl2);
                }
                case 4 -> {
                    System.out.println("Geben sie zwei Zahlen ein: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl2 = new Number(y);
                    zahl1.divide(zahl2);
                }
                case 5 -> {
                    System.out.println("Geben sie zwei Zahlen ein: (1. Zahl = Basis | 2. Zahl = Hochzahl)");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    Number exponent = new Number(y);
                    zahl1.power(exponent);
                }
                case 6 -> {
                    System.out.println("Geben sie eine Zahl ein: ");
                    x = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl1.isPrime();
                }
                case 7 -> {
                    System.out.println("Geben eine Zahl ein: ");
                    x = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl1.isOdd();
                }
                case 8 -> {
                    System.out.println("Geben sie eine Zahl ein: ");
                    x = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl1.isEven();
                }
                case 9 -> {
                    System.out.println("Geben sie zwei Zahlen ein: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl2 = new Number(y);
                    zahl1.greaterThan(zahl2);
                }
                case 10 -> {
                    System.out.println("Geben sie zwei Zahlen ein: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl2 = new Number(y);
                    zahl1.lessThan(zahl2);
                }
                case 11 -> {
                    System.out.println("Geben sie zwei Zahlen ein: ");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    zahl1 = new Number(x);
                    zahl2 = new Number(y);
                    System.out.println(zahl1.equals(zahl2));
                }
                case 12 -> {
                    System.out.println("Geben sie eine Zahl ein: ");
                    x = scanner.nextInt();
                    zahl1 = new Number(x);
                    System.out.println(zahl1);
                }
                case 13 -> System.exit(0);
            }
        }
    }
}
