/*
    Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
 */

package desafios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        System.out.println("Insira um número ");
        int multiplicador = scanner.nextInt();

        for (i = 0; i <= 10; i++) {
            int resultado = multiplicador * i;
            System.out.printf("\n%d x %d = %d",multiplicador,i,resultado);
        }

    }
}