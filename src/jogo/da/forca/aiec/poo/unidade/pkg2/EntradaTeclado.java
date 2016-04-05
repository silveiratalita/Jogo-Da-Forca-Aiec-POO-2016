/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo.da.forca.aiec.poo.unidade.pkg2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Talita
 */
public class EntradaTeclado {
    // propriedades
    ArrayList<String>listachave;
    boolean escolhido;
    
    //Construtor   
    public EntradaTeclado()
    {
        listachave = new ArrayList<String>();
    }
    
    // Adiciona e guarda as entradas no arraylist
    public void escolhechave( String chave )
    {
        listachave.add( chave );
    }
    
    // Verifica se a letra ja não foi escolhida
    public boolean verificaSeJaFoiEscolhido( String chave)
    {
        escolhido = listachave.contains( chave );
        return escolhido;
    }
    
    
    public char pegaNovaLetra() 
    {
        Scanner scan=new Scanner( System.in);
    
        char a;
        boolean escolhido;
        String verificador;    
        
        do
        {   
            System.out.println("Insira uma letra");
            a = scan.next().charAt( 0); 
            verificador = "" + a;
            escolhido = verificaSeJaFoiEscolhido(verificador);
            if(!escolhido)
                escolhechave(verificador);
            else
            {   
                System.out.println("Você já escolheu esta letra antes. Por favor escolha uma nova letra");
                
            }
            
                        
        }
        // Repete o processo até que se coloque uma letra que num foi escolhida. 
        while(escolhido);
        
        return a;  
    }

}
