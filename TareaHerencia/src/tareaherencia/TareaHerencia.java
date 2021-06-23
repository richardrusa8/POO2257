/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaherencia;

import ico.fes.persona.Alumno;

/**
 *
 * @author richar
 */
public class TareaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno a= new Alumno("318360188", "ICO", 2, "Ricardo", 19, "Hombre", 1.73f);
        
        System.out.println("Nombre: "+a.getNombre());
    }
    
}
