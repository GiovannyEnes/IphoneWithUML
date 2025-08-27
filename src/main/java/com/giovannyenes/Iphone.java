package com.giovannyenes;

import java.util.Scanner;

public class Iphone implements InternetBrowser, MusicPlayer, Smartphone{
    @Override
    public void showPage() {
        System.out.println("Showing page!");
    }

    @Override
    public void addNewPage() {
        System.out.println("Page is added!");
    }

    @Override
    public void updatePage() {
        System.out.println("Page is updated!");
    }


    @Override
    public void play() {
        System.out.println("Music is playing!");
    }

    @Override
    public void pause() {
        System.out.println("Music was paused!");
    }

    @Override
    public void musicSelecition() {
        System.out.println("Music Selected is playing!");
    }

    @Override
    public void call() {
        System.out.println("Starting call!");
    }

    @Override
    public void attend() {
        System.out.println("Page is updated!");
    }

    @Override
    public void startVoice() {
        System.out.println("Page is updated!");
    }


    public String selectFunction(int option){
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



        try{

            if(option <1 || option > 9){
                throw new InvalidValueException("Valor inserido invalido, selecione uma opção entre 1 e 10 por favor.");
            } else if (option == 1){
                call();
            }else if (option == 2){
                attend();
            }else if (option == 3){
                startVoice();
            }else if (option == 4){
                play();
            }else if (option == 5){
                pause();
            }else if (option == 6){
                musicSelecition();
            }else if (option == 7){
                showPage();
            }else if (option == 8){
                addNewPage();
            }else if (option == 9){
                updatePage();
            }else if (option == 10){
                System.out.println("Programa encerrado!");
            }

        } catch (InvalidValueException e){
            System.out.println(e.getMessage());
            System.out.println(text);
            option= sc.nextInt();

            return selectFunction(option);
        }
        return null;

    }
}
