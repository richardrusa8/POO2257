/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomposicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.computadora.Computadora;

/**
 *
 * @author richar
 */
public class Tareacomposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora comp1 = new Computadora(2021, 20210621,
                (new Monitor("Samsung", "curvo G27C5", 27)),
                (new Mouse("Razer", "Viper Ultimate", "Alambrico")),
                (new Teclado("Razer", "BlackWidow V3 Pro Wireless", 104, 7)),
                (new CPU ("AMD","Ryzen 5 5600x", (int) 4.6)));
        System.out.println(comp1);
    }
    
}
