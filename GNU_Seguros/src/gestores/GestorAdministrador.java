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
public class GestorAdministrador {
    Scanner sc=new Scanner(System.in);
    GestorAdministrador(){
        System.out.println("Gestor Admin");
    }
    
    public void mostrar(){
        int opcion=0;
        while(opcion!=6){
            System.out.println("------ Administrador GNU Seguros        ------");
            System.out.println("______________________________________________");
            System.out.println("------ (1): Gestionar Cuentas           ------");
            System.out.println("------ (2): Gestionar cotizadores       ------");
            System.out.println("------ (3): Gestionar ticket de soporte ------");
            System.out.println("------ (4): Visualizar ventas           ------");
            System.out.println("------ (5): Gestionar informacion       ------");
            System.out.println("------ (6): Cerrar sesion               ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(6):
                    break;
                    
            }
        }
    }
}
