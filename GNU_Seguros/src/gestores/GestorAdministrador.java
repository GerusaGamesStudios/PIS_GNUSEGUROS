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
    public void gestionarCuentas(){
        int opcion=0;
        while(opcion!=6){
            System.out.println("------ Administrador GNU Seguros        ------");
            System.out.println("___________Gestionar Cuentas__________________");
            System.out.println("------ (1): Dar de alta agente          ------");
            System.out.println("------ (2): Dar de baja agente          ------");
            System.out.println("------ (3): Modificar cuenta usuario    ------");
            System.out.println("------ (4): Modificar agente            ------");
            System.out.println("------ (5): Mandar notificaciones a     _______\n"
                    +          "______      grupo de  agentes           ------");
            System.out.println("------ (6): Regresar                    ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(6):
                    break;
                    
            }
        }
    }
    
    public void gestionarCotizadores(){
        int opcion=0;
        while(opcion!=3){
            System.out.println("------ Administrador GNU Seguros        ------");
            System.out.println("___________Gestionar Cotizadores______________");
            System.out.println("------ (1): Actualizar tabla de cotizacion ___\n"
                    +          "______      de seguro de auto           ------");
            System.out.println("------ (2): Actualizar tabla de cotizacion ___\n"
                    +          "______      de seguro de casa           ------");
            System.out.println("------ (3): Regresar                    ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(3):
                    break;
                    
            }
        }
    }
    
    public void gestionarTicketSoporte(){
        int opcion=0;
        while(opcion!=1){
            System.out.println("------  Administrador GNU Seguros       ------");
            System.out.println("__________Tickets han sido atentidos__________");
            System.out.println("------ (1): Regresar                    ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(1):
                    break;
                    
            }
        }
    }
    
    public void visualizarVentas(){
        int opcion=0;
        while(opcion!=3){
            System.out.println("------ Administrador GNU Seguros        ------");
            System.out.println("______________________________________________");
            System.out.println("------ (1): Visualizar tablas de ventas ------");
            System.out.println("------ (2): Descargar tablas de ventas  ------");
            System.out.println("------ (3): regresar                    ------");
            switch(opcion){
                case(3):
                    break;
                    
            }
        }
            
    }
    
    public void gestionarInformacion(){
        int opcion=0;
        while(opcion!=4){
            System.out.println("------ Administrador GNU Seguros        ------");
            System.out.println("______________________________________________");
            System.out.println("------ (1): Crear Banner                ------");
            System.out.println("------ (2): Editar Banner               ------");
            System.out.println("------ (3): Borrar Banner               ------");
            System.out.println("------ (4): Regresar                    ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(4):
                    break;
                    
            }
        }
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
