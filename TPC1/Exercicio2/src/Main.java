import java.util.Scanner;

 class ArmstrongNumber {


    public static boolean checkArmstrong(int number) {
        int num = number;
        int sum = 0;
        int digits = String.valueOf(number).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = input.nextInt();

        if (checkArmstrong(number)) {
            System.out.println(number + " é um número de Armstrong.");
        } else {
            System.out.println(number + " não é um número de Armstrong.");
        }

        input.close();
    }
}