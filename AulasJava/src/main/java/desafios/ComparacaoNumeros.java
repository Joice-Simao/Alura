/*
    Peça ao usuário para inserir dois números inteiros. Compare os números
    e imprima uma mensagem indicando se são iguais, diferentes, o primeiro
    é maior ou o segundo é maior.
 */

package desafios;

import java.util.Scanner;

public class ComparacaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2){
            System.out.println("Números iguais");
        } else {
            System.out.println("Números diferentes");
        }

        if (numero1 > numero2){
            System.out.println(numero1 + " é maior que " +numero2);
        } else if (numero1 < numero2){
            System.out.println(numero1 + " é menor que " +numero2);
        } else
            System.out.println("Os números digitados são iguais");
    }
}
