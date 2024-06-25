/*
    Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o
    preço original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um
    valor percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais,
    aplique-o ao preço original e imprima o novo preço com desconto.
 */
package desafios;

public class Percentual {
    public static void main(String[] args) {

        double precoOriginal = 1000.00;
        double percentualDesconto = 10;
        double desconto = 0;
        double precoComDesconto = 0;

        desconto = precoOriginal * (percentualDesconto/100);
        precoComDesconto = precoOriginal - desconto;
        System.out.printf("Preço com Desconto R$ %.2f", precoComDesconto);
    }
}