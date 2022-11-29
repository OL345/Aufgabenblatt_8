import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Mit Dezimalzahlen rechnen");
            System.out.println("2. Mit Pingu Zaheln rechen");
            System.out.println("3. Beenden");
            int input = scanner.nextInt();
            switch (input){
                case 1:
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
                    System.out.println("12 toPinguNumber");
                    input = scanner.nextInt();
                    switch (input){
                        case 1:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            int x = scanner.nextInt();
                            int y = scanner.nextInt();

                            Number zahl1 = new Number(x);
                            Number zahl2 = new Number(y);

                            zahl1.add(zahl2);
                            break;
                        case 2:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            zahl2 = new Number(y);

                            zahl1.subtract(zahl2);
                            break;
                        case 3:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            zahl2 = new Number(y);

                            zahl1.multiply(zahl2);
                            break;
                        case 4:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            zahl2 = new Number(y);

                            zahl1.divide(zahl2);
                            break;
                        case 5:
                            System.out.println("Geben sie zwei Zahlen ein: (1. Zahl = Basis | 2. Zahl = Hochzahl)");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            Number exponent = new Number(y);

                            zahl1.power(exponent);
                            break;
                        case 6:
                            System.out.println("Geben sie eine Zahl ein: ");
                            x = scanner.nextInt();

                            zahl1 = new Number(x);

                            zahl1.isPrime();
                            break;
                        case 7:
                            System.out.println("Geben eine Zahl ein: ");
                            x = scanner.nextInt();

                            zahl1 = new Number(x);

                            zahl1.isOdd();
                            break;
                        case 8:
                            System.out.println("Geben sie eine Zahl ein: ");
                            x = scanner.nextInt();

                            zahl1 = new Number(x);

                            zahl1.isEven();
                            break;
                        case 9:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            zahl2 = new Number(y);

                            zahl1.greaterThan(zahl2);
                            break;
                        case 10:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            zahl2 = new Number(y);

                            zahl1.lessThan(zahl2);
                            break;

                        case 11:
                            System.out.println("Geben sie zwei Zahlen ein: ");
                            x = scanner.nextInt();
                            y = scanner.nextInt();

                            zahl1 = new Number(x);
                            zahl2 = new Number(y);

                            zahl1.equals(zahl2);
                            break;
                        case 12:
                            System.out.println("Geben sie eine Zahl ein: ");
                            x = scanner.nextInt();

                            zahl1 = new Number(x);

                            zahl1.toString();
                            break;








                    }
                case 3:
                    System.exit(0);
            }
        }


    }
}
