/*
    Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar
     e exiba uma mensagem correspondente.
 */

package desafios;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int numeroDigitado = scanner.nextInt();

        if (numeroDigitado % 2 == 0){
            System.out.println("Número Par");
        } else
            System.out.println("Número Impar");
    }
}
