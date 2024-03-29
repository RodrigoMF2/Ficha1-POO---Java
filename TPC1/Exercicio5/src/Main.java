import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();
        double area = calcularArea(raio);
        double circunferencia = 2 * Math.PI * raio;
        System.out.println("Área do círculo: " + area);
        System.out.println("Circunferência do círculo: " + circunferencia);
    }

    public static double calcularArea(double raio) {
        return Math.PI * raio * raio;
    }
}