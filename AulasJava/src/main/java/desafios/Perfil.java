package desafios;

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu nome ");
        String nome = scanner.next();

        System.out.println("Olá, " + nome + "!");
        System.out.println("Tudo bem ?");
    }
}
