package BasicoDaLinguagem;

public class Praia {
    public static void main(String[] args) {
        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        String mensagem = vamosAPraia ? "Vamos a praia" : "Não vamos a praia";
        System.out.println(mensagem);
    }
}
