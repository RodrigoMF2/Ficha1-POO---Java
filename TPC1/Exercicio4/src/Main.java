import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número total de crianças: ");
        int numCriancas = scanner.nextInt();
        System.out.println("Digite o tamanho dos grupos: ");
        int tamanhoGrupo = scanner.nextInt();
        int numGrupos = numCriancas / tamanhoGrupo;
        int criancasSemGrupo = numCriancas % tamanhoGrupo;
        System.out.println("Número de grupos formados: " + numGrupos);
        System.out.println("Número de crianças sem um grupo: " + criancasSemGrupo);
    }
}