import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("<== Soma Inteiros ==>");
        System.out.println("Digite um numero inteiro: ");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo numero: ");
        int n2 = scan.nextInt();
        scan.close();

        int soma = n1 + n2;
        System.out.println("O resultado é: "+ soma);
    }
}
