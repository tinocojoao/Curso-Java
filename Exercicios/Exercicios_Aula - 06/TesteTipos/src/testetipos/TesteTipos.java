/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetipos;

/**
 *
 * @author jtino
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
       int idade = 30;
       String valor = idade;                   [ERRO]
       String valor = (String)  idade;         [ERRO]
       String valor = Integer.toString(idade); [CONVERTIDO]
       System.out.println(valor);
       */
        
        /*
        String valor = "30";
        int idade = valor;                     [ERRO]
        int idade = (int) valor;               [ERRO]
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */
        
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
    }    
}
