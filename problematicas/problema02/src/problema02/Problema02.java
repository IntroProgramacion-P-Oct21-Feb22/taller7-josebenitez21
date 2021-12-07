/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author USUARIO
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int primerNumero = 2;
        int limite = 110;
        int incremento = 2;  // lo que sumo para obtener la serie de números
        int contador = 0;
        String cadenaFinal = " ";
        
        while(primerNumero < limite){
              
        primerNumero  = primerNumero  + contador;//2+0
        incremento = incremento + 2;//2+2+2=6
        cadenaFinal  = String.format("%s %d", cadenaFinal , primerNumero );
        contador = incremento;
        }
        System.out.println(cadenaFinal);
    }
    
}
