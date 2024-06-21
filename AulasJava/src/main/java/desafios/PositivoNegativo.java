/*
    Crie um programa que solicite ao usuário digitar um número.
    Se o número for positivo, exiba "Número positivo", caso contrário,
    exiba "Número negativo".
 */

package desafios;

import java.util.Scanner;

public class PositivoNegativo {
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