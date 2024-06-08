package BasicoDaLinguagem;

public class TiposPrimitivos {
    public static void main(String[] args) {
        byte idade01;
        idade01 = 23;
        double valorPassagem = 2.9;
        float valorTomate = 3.90f;
        int Oct31 = 031;
        int Dec25 = 25;
        System.out.println("Idade: " + idade01);
        System.out.println("Passagem: " + valorPassagem);
        System.out.println("Tomate: " + valorTomate);
        System.out.println("31 de Outubro é igual á 25 de Dezembro: " + (Oct31 == Dec25));
    }
}
