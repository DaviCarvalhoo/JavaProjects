package BasicoDaLinguagem.POO;

import BasicoDaLinguagem.POO.Animais.Cachorro;

public class Main {
    public static void main(String[] args) {
    Cachorro cachorro1 = new Cachorro("Toto","Marrrom",12,14.5,"nada");
    Cachorro cachorro2 = new Cachorro("Rex","Branco", 32,12.4,"carinhos");
    /*cachorro1.setNome("Toto");
    cachorro1.setCor("marrom");
    cachorro1.setAltura(25);
    cachorro1.setPeso(23.3);*/

    cachorro1.latir();
    System.out.println(cachorro1.pegar());
    System.out.println(cachorro1.interagir("carinho"));
    System.out.println(cachorro1.interagir("nada"));
    System.out.println(cachorro2.toString());
    System.out.println(cachorro2.getNumeroDeCachorros());
    }
}
