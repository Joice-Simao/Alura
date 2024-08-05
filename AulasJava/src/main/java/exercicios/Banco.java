package exercicios;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;
        double valorTranferencia = 0;
        double valorSaque = 0;

        System.out.println("*****************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("*****************************************");

        String menu = """
                \n** Digite sua opção **
                1 - Consultar saldo
                2 - Transferir valor
                3 - Sacar valor
                4 - Sair 
                """;

        Scanner leitura = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao){
                case 1:
                    System.out.printf("Saldo .......... R$ %.2f\n", saldo);
                    break;
                case 2:
                    System.out.println("Qual valor será transferido?");
                    valorTranferencia = leitura.nextDouble();

                    if (saldo > valorTranferencia){
                        saldo = saldo - valorTranferencia;
                        System.out.printf("Transferencia realizada com sucesso\n "+
                                "Saldo atualizado .......... R$ %.2f\n", saldo);
                    } else
                        System.out.println("Saldo insuficiente\n");

                    break;
                case 3:
                    System.out.println("Qual valor de saque?");
                    valorSaque = leitura.nextDouble();

                    if (saldo > valorSaque){
                        saldo = saldo - valorSaque;
                        System.out.printf("Saque realizado com sucesso\n"+
                                "Saldo atualizado .......... R$ %.2f\n", saldo);
                    } else
                        System.out.println("Saldo insuficiente");
                    break;
                case 4:
                    System.out.println("Fim");
                    break;
            }
        }
    }
}