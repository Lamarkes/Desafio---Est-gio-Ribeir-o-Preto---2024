package inverter_caracteres;

public class InverterString {

    public static void inverteString(String palavra){

        char[] letras = palavra.toCharArray(); // necessario utilizar para converter a string para um array de caracteres

        int inicio = 0;
        int fim = letras.length -1;

        while (inicio < fim){
            char temp = letras[inicio];
            letras[inicio] = letras[fim];
            letras[fim] = temp;


            inicio++;
            fim--;
        }

        String palavraInvertida = new String(letras);

        System.out.println(palavraInvertida);

    }
}
