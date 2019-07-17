/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import autentificacion.Cliente;
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
    public Cliente seleccionarCliente(){
        System.out.println("------       Agente GNU Seguros         ------");
        System.out.println("_____________Seleccionar Cliente______________");
        System.out.println("------ No existen clientes actualmente        ------");
        
        System.out.println("------ (1): Regresar         ------");
        int op=0;
        while(op!=1){
            op=sc.nextInt();
        }
        return null;
    }
    public void visualizarVentas(){
        int op=0;
        while(op!=3){
            System.out.println("------       Agente GNU Seguros         ------");
            System.out.println("_____________Visualizar Ventas________________");
            System.out.println("------ (1): Ver ventas propias          ------");
            System.out.println("------ (2): Descargar ventas propias    ------");
            System.out.println("------ (3): Regresar                    ------");
            op=sc.nextInt();
        }
    }
    public void gestionarOperacionesCliente(){
        int opcion=0;
        while(opcion!=8){
            System.out.println("------       Agente GNU Seguros         ------");
            System.out.println("_____Gestionar operaciones del cliente________");
            System.out.println("------ (1): crear cuenta cliente        ------");
            System.out.println("------ (2): Actualizar cuenta cliente   ------");
            System.out.println("------ (3): Emitir poliza               ------");
            System.out.println("------ (4): Cancelar poliza             ------");
            System.out.println("------ (5): Modificar informacion poliza------");
            System.out.println("------ (6): Mandar Notificacion a cliente-----");
            System.out.println("------ (7): Renovar poliza              ------");
            System.out.println("------ (8): Salir                       ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(8):
                    break;
                    
            }
        }
    }
    
    public void gestionarPerfil(){
        int opcion=0;
        while(opcion!=5){
            System.out.println("------       Agente GNU Seguros         ------");
            System.out.println("____________Gestionar Perfil__________________");
            System.out.println("------ (1): Actualizar Telefono         ------");
            System.out.println("------ (2): Actualizar Nombre           ------");
            System.out.println("------ (3): Actualizar Foto             ------");
            System.out.println("------ (4): Actualizar Correo           ------");
            System.out.println("------ (5): Salir                       ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(5):
                    break;
                    
            }
        }
    }
    
    public void gestionarNotificaciones(){
        System.out.println("------       Agente GNU Seguros         ------");
        System.out.println("______________________________________________");
        System.out.println("------ No Hay Notificaciones            ------");
        System.out.println("------ (5): Salir                       ------");
        int op=0;
        while(op!=5){
            op=sc.nextInt();
        }
        
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
