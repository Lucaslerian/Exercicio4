import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

       Scanner sc = new Scanner(System.in);
        // Pedir 4 notas bimestrais
        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        System.out.println("Digite a quarta nota: ");
        double nota4 = sc.nextDouble();
        sc.close();

        // Calcular a média
        double media = (nota1 + nota2 + nota3 + nota4);
        System.out.print("A média das 4 notas é: " + media);

    }
}

