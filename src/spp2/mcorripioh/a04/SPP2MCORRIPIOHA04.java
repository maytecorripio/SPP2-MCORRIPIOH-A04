/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mcorripioh.a04;
import java.util.Scanner;


/**
 *
 * @author MayteCorripio
 */
public class SPP2MCORRIPIOHA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int opEntrada;
        double angulo, resultado;
        Scanner kb = new Scanner (System.in);
        
        //Desplegamos menú
        System.out.println("Bienvenido al calculador de funciones tangente, seno, y coseno ");
        System.out.println("Introduzca la opción deseada");
        System.out.println("1. Calcular Tangente");
        System.out.println("2. Calcular Seno");
        System.out.println("3. Calcular Coseno");
        System.out.println("4. Salir");
        opEntrada = kb.nextInt();
        
        switch (opEntrada){
            case 1:
                System.out.println("Bienvenido al calculo de la función tangente");
                angulo=mensajePedirdatos();
                resultado = Math.tan(angulo);
                System.out.println("El valor de la tangente del ángulo es" +resultado);
                break;
            case 2:
                System.out.println("Bienvenido al calculo de la función seno");
                angulo=mensajePedirdatos();
                resultado = Math.sin(angulo);
                System.out.println("El valor de la tangente del ángulo es" +resultado);
                break;
            case 3:
                System.out.println("Bienvenido al calculo de la función coseno");
                angulo=mensajePedirdatos();
                resultado = Math.cos(angulo);
                System.out.println("El valor de la tangente del ángulo es" +resultado);
                break;
            default:
                System.out.println("Adiós!");    
        }
        
        
    }
    
    static double mensajePedirdatos (){
        //Variables
        double angulo;
        Scanner kb = new Scanner (System.in);
        System.out.println("Introduce el angulo");
        angulo=kb.nextDouble();
        return angulo;
    }
    
}
