package BasicoDaLinguagem.POO.Animais;

public class Cachorro {
    private String nome;
    private String cor;
    private int altura;
    static int numeroDeCachorros;

    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }

    public Cachorro(){}
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        numeroDeCachorros++;
    }

    private double peso;
    private String estadoDeEspirito;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }




    public void comer(){

    }
    public void latir(){
        System.out.println(nome + " Disse: Au Au");
    }
    public String pegar(){
        return nome + " Pegou a bolinha";
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String interagir(String acao){
        switch (acao){
            case "carinho": this.estadoDeEspirito = nome + " está Feliz";
                    break;
            default: this.estadoDeEspirito = nome + " está Neutro";
        }
       /* if(acao.equals("carinho")){
            this.estadoDeEspirito = nome + " está Feliz";
        }else{
            this.estadoDeEspirito = nome + " está Neutro";
        }*/
        return estadoDeEspirito;


    }
}
