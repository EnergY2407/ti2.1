import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        soma = num1 + num2;

        System.out.println("A soma dos números " + num1 + " e " + num2 + " é " + soma + ".");
    }
}
