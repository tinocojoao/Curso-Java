/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor02;

import java.time.LocalDate;

/**
 *
 * @author jtino
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {
            "jan", "fev", "mar", "abr", 
            "mai", "jun", "jul", "ago", 
            "set", "out", "nov", "dez"
        };
        int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        LocalDate data = LocalDate.now();
        int ano = data.getYear();
      
        if(ano % 100 == 0){
            if(ano % 400 == 0){
                dia[1] = 29;
                System.out.println(ano + " é Bissexto");
            }
        } else if (ano % 4 == 0){
            dia[1] = 29;
            System.out.println( ano + " é Bissexto");
        } else{
            System.out.println(ano + " não é Bissexto");
        }
       
        
        for (int c = 0; (c < mes.length); c++){
            System.out.println("O mes de " + mes[c] + " tem " 
                    + dia[c] + " dias ao todo");
        }
      
    
    }
}
