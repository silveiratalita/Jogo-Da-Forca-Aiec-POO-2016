/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.forca.aiec.poo.unidade.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Talita
 */
public class PalavraSecreta {
    
    String dica, visivel, secreto;
    
    public PalavraSecreta(){
        
        String [] listapalavras = { "metalica", "bruno e Marrone", "silvester stalone", "peixe" };
    
    String [] listadicas = { "banda de metal", "dupla sertaneja", "Os mercenários", "Tem no mar" };
    int gerador;
    gerador = (int) (Math.random()*4);
    secreto = listapalavras[gerador];
    dica = listadicas[gerador];
    int contapalavra = secreto.length();
    
    visivel = "";
   
    for ( int i = 0; i < secreto.length(); i++)
    {
        char c = secreto.charAt(i);
        
        if ( c == ' ' )
            visivel += c;
        else
            visivel += '_';
    }
}

public String getDica()
{
    return dica;
}

public String toString()
{

    
    return visivel;
}


    public boolean update(char c)
    {
        char[] arraysecreto = new char [secreto.length()];
        char[] arrayvisivel = new char [secreto.length()];
        String s = "";
        boolean conteudo = false ;
        
        //a string secreta vira um array
        for(int i = 0; i < secreto.length(); i++)
        {
            arraysecreto[i] = secreto.charAt(i);
            arrayvisivel[i] = visivel.charAt(i);
        }
        
        //atualizando nosso array visível
        for(int k = 0; k < secreto.length();k++)
        {
            
            if(arraysecreto[k] == c)
            {
                arrayvisivel[k] = c;
                conteudo = true;
            }
        }
        //transforma o array visivel em na string visivel
        for(int m=0; m < secreto.length(); m++ )
        {
            s = s + arrayvisivel[m];
        }
        visivel = s;
        
        return conteudo;
   }
    //este metodo checa se a palavra esta correta
    public boolean resolvido()
    {   
        return secreto.equalsIgnoreCase(visivel);
       
    }
}

        
    
    
