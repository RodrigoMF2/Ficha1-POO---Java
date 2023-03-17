import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do raio r: ");
        double r = scanner.nextDouble();
        System.out.print("Digite o valor da altura h: ");
        double h = scanner.nextDouble();

        double sphereVolume = sphereVolume(r);
        double sphereSurface = sphereSurface(r);
        double cylinderVolume = cylinderVolume(r, h);
        double cylinderSurface = cylinderSurface(r, h);
        double coneVolume = coneVolume(r, h);
        double coneSurface = coneSurface(r, h);

        System.out.println("Volume da esfera: " + sphereVolume);
        System.out.println("Área da superfície da esfera: " + sphereSurface);
        System.out.println("Volume do cilindro: " + cylinderVolume);
        System.out.println("Área da superfície do cilindro: " + cylinderSurface);
        System.out.println("Volume do cone: " + coneVolume);
        System.out.println("Área da superfície do cone: " + coneSurface);

        scanner.close();
    }

    public static double sphereVolume(double r) {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }

    public static double sphereSurface(double r) {
        return 4.0 * Math.PI * Math.pow(r, 2);
    }

    public static double cylinderVolume(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double cylinderSurface(double r, double h) {
        return 2.0 * Math.PI * r * (r + h);
    }

    public static double coneVolume(double r, double h) {
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * h;
    }

    public static double coneSurface(double r, double h) {
        return Math.PI * r *(r + Math.sqrt(Math.pow(h,2)+Math.pow(r,2)));
    }
}