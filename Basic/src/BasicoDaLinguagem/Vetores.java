package BasicoDaLinguagem;

import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {
        int[] numeros = { 2,5,4,23,6,2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;
        for(int i=0; i<numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
            if(numeros[i] < menor){
                menor = numeros[i];
            }
            media += numeros[i];
        }
        System.out.println("Números: "+ Arrays.toString(numeros));
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
        System.out.println("Média: "+media/numeros.length);
        System.out.println("Segunda posição: " + numeros[1]);
    }
}
