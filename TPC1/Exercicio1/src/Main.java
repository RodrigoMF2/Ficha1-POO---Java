public class Main {

    public static void main(String[] args) {
        double tempF = 68.0; // temperatura em Fahrenheit
        double tempC = converter(tempF); // conversão para Celsius
        System.out.println(tempF + " graus Fahrenheit correspondem a " + tempC + " graus Celsius.");
    }

    public static double converter(double tempF) {
        double tempC = (tempF - 32) * 5 / 9;
        return tempC;
    }

}