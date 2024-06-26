package BasicoDaLinguagem;

import java.util.Locale;
import java.util.Scanner;

public class LerDados {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Para usar ponto no leitor do double/float no lugar da virgula
        scan.useLocale(Locale.US);


        /*System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Seu nome é: "+ nome);

        System.out.println("Digite apenas seu primeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: "+  primeiroNome);

        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: "+  idade);*/

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e se tem bichinho de estimação:");
        String primeiroNome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        double altura = scan.nextDouble();
        boolean temPet = scan.nextBoolean();

        System.out.println("Você digitou os seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);
        scan.close();
    }
}
