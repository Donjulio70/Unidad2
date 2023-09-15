/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.de.moneda;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CalculadoraDeMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner abc = new Scanner (System.in);
        System.out.println("Ingrese la cantidad en $ mxn");
        int mxn = abc.nextInt();
        double euro = mxn/18.21;
        double dolares = mxn/17.07;
        double yen = mxn/0.127;
        double libras = mxn/21.18;
        
        System.out.println("La cantidad " +mxn+ " en euro es " +euro+ " en dolar es " +dolares+ " en yen es " +yen+ " en libras es " +libras);
        abc.close();
    }
    
}
