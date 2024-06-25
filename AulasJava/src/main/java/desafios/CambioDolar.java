/*
    Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
    Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares
    para reais e imprima o resultado formatado.
 */

package desafios;

public class CambioDolar {
    public static void main(String[] args) {

        double valorEmDolares = 5.00;
        double valorEmReais = 4.94;
        double conversao = 0;

        // Conversao
        conversao = valorEmDolares * valorEmReais;

        System.out.printf("R$ %.2f", conversao);
    }
}
