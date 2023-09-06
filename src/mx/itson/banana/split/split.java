/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.banana.split;

/**
 *
 * @author aleja
 */

public class split {
    /**
     * 
     * @param oracion = String
     * @return Regresa una cadena de caracteres predetirminados y los separa al encontrar una coma o espacio en balnco 
     */
    public String[] Separar (String oracion){
        String[] resultadoA = oracion.split(",");
        return resultadoA;
    }
    /*public String[]SepararNombres (String oracion){
        String[] resultadoB = oracion.split(" ");
        String id = resultadoB[0];
        String nombre = resultadoB[3];
        String apellido = resultadoB[1];
        return resultadoB;
    }
*/
}
