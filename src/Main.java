import fibonacci.Fibonacci;
import inverter_caracteres.InverterString;
import soma_numeros.SomaNumero;

public class Main {
    public static void main(String[] args) {



        // teste para printar o valor de soma
        SomaNumero.somaNumeros(); // respota: 91

        // resposta sobre a verificação se pertence ou nao a sequencia de fibonnaci

        int numero = 13;

       if (Fibonacci.verificaSePertenceFibonacci(numero)){
            System.out.println("Este numero esta na sequencia: " + numero);
        }else{
            System.out.println("Este numero não esta na sequencia: " + numero);
        }

       // inverte as Strings

        InverterString.inverteString("Java");



    }
}