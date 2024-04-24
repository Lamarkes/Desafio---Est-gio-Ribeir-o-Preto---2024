package fibonacci;

public class Fibonacci {

    //utilizando algoritmos recursivos para calcular fibonnaci

    public static int fibonacci(int num){
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static boolean verificaSePertenceFibonacci(int numero){
        int termo = 0;
        int indice = 0;

        while (termo <= numero) {
            termo = fibonacci(indice);
            if (termo == numero) {
                return true;
            }
            indice++;
        }

        return false;

    }
}
