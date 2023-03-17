import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira três números: ");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double maior = encontrarMaior(num1, num2, num3);
        if (maior == -1) {
            System.out.println("Números não são distintos");
        } else {
            System.out.println("O maior número é " + maior);
        }
    }

    public static double encontrarMaior(double num1, double num2, double num3) {
        if (num1 == num2 || num1 == num3 || num2 == num3) {
            return -1;
        } else {
            double maior = num1;
            if (num2 > maior) {
                maior = num2;
            }
            if (num3 > maior) {
                maior = num3;
            }
            return maior;
        }
    }
}