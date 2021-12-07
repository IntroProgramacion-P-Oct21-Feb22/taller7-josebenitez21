/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
       
        int numeracion = 1;
        String nombre;
        String posicion;
        int edad;
        double estatura;
        int salida;
        double promedioEdades;
        double promedioEstatura;
        String cadenaAc=" ";
        int contador= 0;
        int sumaEdad= 0;
        double sumaEstatura = 0;
        boolean bandera= true;
        String cadenaEdad=" ";
        int acumuladorEdad=0;
        int acumuladorEstatura=0;
        cadenaAc = String.format("Listado de jugadores: ");
        do{
        System.out.println("Ingrese el nombre de su jugador de futbol");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese la posición en la que juega");
        posicion = entrada.nextLine();
        
        System.out.println("Ingrese la edad del jugador(solo se acepta numeros enteros");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese la estatura del jugador");
        estatura = entrada.nextDouble();
        
        sumaEdad = sumaEdad + edad;
        sumaEstatura= sumaEstatura + estatura;
        

        
        cadenaAc = String.format("%s\n%d.%s -%s-,edad %d,estatura %.2f", cadenaAc,numeracion, nombre, posicion, edad, estatura);
        cadenaEdad = String.format("%s%d ",cadenaEdad,edad);
        acumuladorEdad = acumuladorEdad + 1;
        acumuladorEstatura=acumuladorEstatura+1;
        contador= contador + 1;
        numeracion=numeracion+1;
        System.out.println("Ingrese (-1) si desea dejar de ingresar datos; "
                    + "cualquier otro número para continuar");
            salida = entrada.nextInt();
            
            if (salida == -1) {
                bandera = false;
        }
            entrada.nextLine();
        }while(bandera);
        
        promedioEdades = (double)sumaEdad/acumuladorEdad;
        promedioEstatura = sumaEstatura/acumuladorEstatura;
    
       
        cadenaAc = String.format("%s\n" + "Listado edades:" +"%s"+" Promedio de "
                + "edades:"+ "%.2f"+ 
        " Promedio de estaturas:" + "%.2f", cadenaAc,cadenaEdad, promedioEdades, 
        promedioEstatura ); 
        System.out.println(cadenaAc);
    }
    
       
            
        
        
        
        
        
    }
    
