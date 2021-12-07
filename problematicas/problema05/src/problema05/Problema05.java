/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author USUARIO
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int limite = 15;
        String signo1 = "-";
        String signo2 = "+";
        int numerador = 1;
        int denominador = 3; 
        int denominador2 = 5;
        int numero = 1;
        int contador = 3;
        int denominadorAux = 3;
        String signo;
        String cadenaAcumuladora = " ";
        String cadenaFinal = " ";
       
        do {
            if (denominadorAux == contador) {
                signo = signo1;
                
                cadenaAcumuladora  = String.format("%s%d/%d ",
                        signo,
                        numerador,
                        denominador);
                
                denominadorAux = denominadorAux + 4;
                denominador = denominador + 2;

            } else {
                if (denominador2 == contador) {
                    signo = signo2;
                    
                    cadenaAcumuladora  = String.format("%s%d/%d ",
                            signo,
                            numerador,
                            denominador);
                    
                    denominador2 = denominador2 + 4;
                    denominador = denominador + 2;

                }
            }
            cadenaFinal = String.format("%s%s", cadenaFinal, cadenaAcumuladora );
            contador = contador + 2;
        } while (contador <= limite);
        System.out.printf("%s%s", numero, cadenaFinal);
    }
    
}
