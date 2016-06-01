/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.forca.aiec.poo.unidade.pkg2;

import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class JogoDaForca {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        {

            int totalerros = 0;

            boolean b = false;

            bemVindo();

            PalavraSecreta palavra = new PalavraSecreta();
            System.out.println("Sua dica é: " + palavra.getDica());

            System.out.println("_____");
            System.out.println("|     |");
            System.out.println("| ");
            System.out.println("|");
            System.out.println("| ______");
            System.out.println("|/     /|");
            System.out.println("/_____/");
            System.out.println("|     |");

            EntradaTeclado entrada = new EntradaTeclado();
            while (totalerros < 6 && !palavra.resolvido()) {
                System.out.println("Palavra: " + palavra);

                char c = entrada.pegaNovaLetra(totalerros);
                if (!palavra.update(c)) {
                    totalerros = totalerros + 1;
                    System.out.println("Cuidado você só pode ter no máximo 6 erros e você já errou " + totalerros + " vezes. ");

                }
                System.out.println("_________________________________________________________________________");
                System.out.println("");
                System.out.println("");
                switch (totalerros) {
                    case 0:
                        System.out.println("______");
                        System.out.println("|     |");
                        System.out.println("| ");
                        System.out.println("|");
                        System.out.println("|");
                        System.out.println("| ______");
                        System.out.println("|/     /|");
                        System.out.println("/_____/");
                        System.out.println("|     |");

                        break;
                    case 1:
                        System.out.println("_____");
                        System.out.println("|     |");
                        System.out.println("|     O");
                        System.out.println("|");
                        System.out.println("| ______");
                        System.out.println("|/     /|");
                        System.out.println("/_____/");
                        System.out.println("|     |");

                        break;
                    case 2:
                        System.out.println("_____");
                        System.out.println("|     |");
                        System.out.println("|     O");
                        System.out.println("|     |");
                        System.out.println("| ______");
                        System.out.println("|/     /|");
                        System.out.println("/_____/");
                        System.out.println("|     |");

                        break;
                    case 3:
                        System.out.println("_____");
                        System.out.println("|     |");
                        System.out.println("|   \\O");
                        System.out.println("|     |");
                        System.out.println("| ______");
                        System.out.println("|/     /|");
                        System.out.println("/_____/");
                        System.out.println("|     |");

                        break;
                    case 4:
                        System.out.println("_____");
                        System.out.println("|     |");
                        System.out.println("|   \\O/");
                        System.out.println("|     |");
                        System.out.println("| ______");
                        System.out.println("|/     /|");
                        System.out.println("/_____/");
                        System.out.println("|     |");

                        break;
                    case 5:
                        System.out.println("______");
                        System.out.println("|     |");
                        System.out.println("|   \\O/");
                        System.out.println("|     |");
                        System.out.println("     / ");
                        System.out.println("| _______");
                        System.out.println("|/      /|");
                        System.out.println("/__/___/");
                        System.out.println("|     |");

                        break;
                    case 6:
                        System.out.println("_____");
                        System.out.println("|     |");
                        System.out.println("|   \\O/");
                        System.out.println("|     |");
                        System.out.println("     /\\");
                        System.out.println(" |______");
                        System.out.println("|/     /|");
                        System.out.println("/_____/");
                        System.out.println("|     |");

                        break;

                    default:
                        System.out.println("Numero de erros liberados");
                }

            }
            if (palavra.resolvido()) {
                System.out.println("Muito bem, você conseguiu");
            } else {
                System.out.println("Que pena, Você errou muitas letras. Que tal tentar novamente?");
            }

        }

        /**
         *
         */
        /*
         //public static void bemVindo()
         {
         System.out.println( "Bem vindo ao jogo da forca da AIEC! Somos alunos do segundo semestre de Análise de sistema!" );
        
        
         }*/
    }

    public static void bemVindo() {
        System.out.println("Bem vindo ao jogo da forca da AIEC! Somos alunos do segundo semestre de Análise de sistema! Esta é a disciplina de Programação orientada a objetos, ministrada pelo professor Andrei Cardoso Vanderlei!!!");

    }
}
