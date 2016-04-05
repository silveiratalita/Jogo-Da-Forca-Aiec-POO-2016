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
        public static void main( String[] args) 
    {
        Scanner scan = new Scanner( System.in);
        {


        
        int totalerros=0;
        boolean b=false;
        
        bemVindo();
       
        PalavraSecreta palavra=new PalavraSecreta();
        System.out.println("Sua dica é: " + palavra.getDica());
        EntradaTeclado  entrada= new EntradaTeclado();
        while (totalerros < 4 && !palavra.resolvido())
        {
            System.out.println(palavra);
            char c = entrada.pegaNovaLetra();
            if (!palavra.update(c))
                totalerros = totalerros + 1 ;
        }
        if (palavra.resolvido())
            System.out.println("Muito bem, você conseguiu");
        else
            System.out.println("Que pena, Você errou muitas letras. Que tal tentar novamente?");
       
    }
        
    /**
     *
     */
    /*
       public static void bemVindo()
        {
            System.out.println( "Bem vindo ao jogo da forca da AIEC! Somos alunos do segundo semestre de Análise de sistema!" );
        
        
}*/

}
public static void bemVindo()
        {
            System.out.println( "Bem vindo ao jogo da forca da AIEC! Somos alunos do segundo semestre de Análise de sistema! Esta é a disciplina de Programação orientada a objetos com, ministrada pelo professor Andrei Cardoso Vanderlei!!!" );
        
        
}
}
