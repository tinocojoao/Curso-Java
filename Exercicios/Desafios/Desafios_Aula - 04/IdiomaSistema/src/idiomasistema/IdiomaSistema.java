/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package idiomasistema;
import java.util.Locale;
/**
 *
 * @author jtino
 */
public class IdiomaSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale local = Locale.getDefault();
        System.out.println("O idioma do sistema é: " + local.getDisplayLanguage());
    }
    
}
