/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author USUARIO
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int primer_Numero = 2;
        int limite = 37;
        int contador = 3;
        String cadenaFinal = "2";
        do{
            primer_Numero= primer_Numero + contador;
            cadenaFinal = String.format("%s %d", cadenaFinal, primer_Numero);
            contador= contador + 2;
        
        }while(primer_Numero<=limite);
        System.out.println(cadenaFinal);
    }
    }
        
    
    

