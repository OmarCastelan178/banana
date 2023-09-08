/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.banana.ordenar;
import java.util.Scanner;
import mx.itson.banana.split.split;
/**
 *
 * @author aleja
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    //homero chino
    public static void main(String[] args) {
        System.out.println("Escribe los nombres: ");
        
        Scanner _sc = new Scanner(System.in);
        String enunciadoc= _sc.nextLine();
        
        String[] Separar = new split().Separar(enunciadoc);
        
        for(String r : Separar){
            String[] resultadoB = r.split(" ");
        String id = resultadoB[0];
        String nombre = resultadoB[3];
        String apellido = resultadoB[1];
            System.out.println(id+" "+nombre+" "+apellido);
           
        }
    }
    
}
