/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import java.util.Scanner;

/**
 *
 * @author tealflipper
 */
public class GestorAgente {
    private Scanner sc=new Scanner(System.in);
    
    public GestorAgente(){
        System.out.println("Gestor Agente creado");
    } 
    
    
    
    void mostrar() {
        int opcion=0;
        while(opcion!=6){
            System.out.println("------       Agente GNU Seguros         ------");
            System.out.println("______________________________________________");
            System.out.println("------ (1): Gestionar Perfil            ------");
            System.out.println("------ (2): Gestionar operaciones       ______\n"
                             + "______      del cliente                 ------");
            System.out.println("------ (3): Visualizar ventas           ------");
            System.out.println("------ (4): Gestionar notificaciones    ------");
            System.out.println("------ (5): Gestionar informacion       ------");
            System.out.println("------ (6): Cerrar sesion               ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(6):
                    break;
                    
            }
        }
    } //To change body of generated methods, choose Tools | Templates.
    
}
