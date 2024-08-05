package org.example;

public class Strings {
    public static void main(String[] args) {

        // String representa sequencia de caracteres
        String nome = "Maria";
        String saudacao = "Bom dia ";

        // Concatenar Strings
        String mensagem = nome + saudacao;

        // Comparar conteudo Strings
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        // Text Block
        String texto = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
    }
}