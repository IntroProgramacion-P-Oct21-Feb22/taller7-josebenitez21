/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;

/**
 *
 * @author USUARIO
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 15;
        String signo1 = "-";
        String signo2 = "+";
        int numerador = 1;
        int denominador1 = 3;
        int denominador2 = 5;
        int numero = 1;
        int contador = 3;
        int denominadorAux = 3;
        String signo;
        String acumuladora = " ";    
        String cadenaFinal = " ";
        
        while (contador <= limite) {
            if (denominadorAux == contador) {
                signo = signo1;
                
                acumuladora= String.format("%s%d/%d ",
                        signo,
                        numerador,
                        denominador1);
                
                denominadorAux = denominadorAux + 4;
                denominador1 = denominador1 + 2;

            } else {
                if (denominador2 == contador) {
                    signo = signo2;
                    
                    acumuladora = String.format("%s%d/%d ",
                            signo,
                            numerador,
                            denominador1);
                    denominador2 = denominador2 + 4;
                    denominador1 = denominador1 + 2;

                }
            }
            cadenaFinal = String.format("%s%s", cadenaFinal, acumuladora);
            contador = contador + 2;
        }
        System.out.printf("%s%s", numero, cadenaFinal);

    }
}