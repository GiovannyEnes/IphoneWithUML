package com.giovannyenes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Scanner sc = new Scanner(System.in);

        String text = """
                Qual função deseja utilizar em seu Iphone? 
                1- Fazer um ligação? 
                2- Atender uma ligação?
                3- Iniciar o correio de Voz?
                4- Reproduzir uma musica?
                5- Pausar uma musica?
                6- Selecionar uma musica?
                7- Exibir uma pagina da Internet?
                8- Adicionar uma nova Aba? 
                9- Atualizar a pagina atual?
                10- Encerrar o programa?
                """;

        System.out.println(text);

        int option = -1;
        option = sc.nextInt();

        iphone.selectFunction(option);

    }
}