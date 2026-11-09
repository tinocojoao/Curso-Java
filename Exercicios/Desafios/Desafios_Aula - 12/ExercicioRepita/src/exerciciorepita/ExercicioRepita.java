/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author jtino
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, totV = 0, totP = 0, totI = 0, totC = 0, M = 0, s = 0;
        
        do{
        n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "<html>Informe um número <br> (0 interrompe)</html>", 
                "Entrada de Dados", JOptionPane.WARNING_MESSAGE
        )); 
        
        if (n != 0){ //TOTAL VALORES
        totV += 1;
        }
        
        if (n % 2 == 0){ // TOTAL PAR
            totP += 1;
        } else {
            totI += 1;  //TOTAL IMPAR
        }
        
        if(n >= 100){  //MAIOR QUE 100
            totC += 1;
        }
        s += n;
        } while(n != 0);
        
        if (totV > 0){
            M = s / totV; // MEDIA DOS VALORES
        }
        
        JOptionPane.showMessageDialog(null,
                "<html> Resultado: <br>" +
                "Total de Valores: " + totV + "<br>" + 
                "Total de Pares: " + totP + "<br>" +
                "Total de Impar: " + totI + "<br>" +
                "Acima de 100: " + totC + "<br>" +
                "Média dos valores: " + M + "</html>",
                "Resultado Final",
                JOptionPane.WARNING_MESSAGE
        );
        
    }
    
}
