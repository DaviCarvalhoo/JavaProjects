package BasicoDaLinguagem;

public class Funcoes {
    public static void main(String[] args) {
        String nome = "Davi";
        ola(nome);
        ola("Mundo!");
        int resultado = soma(2,3);
        System.out.println("Soma dos paramentros: "+ resultado);
    }
    public static int soma(int a, int b){
        return a+b;
    }
    public static  void ola(String nome){
        System.out.println("Olá, "+ nome);
    }
}
