/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import java.util.Scanner;
import poliza.CarteraDePolizas;

/**
 *
 * @author tealflipper
 */
public class GestorCliente {
    CarteraDePolizas carteraDePolizas=new CarteraDePolizas();
    private Scanner sc=new Scanner(System.in);
    
    public GestorCliente(){
        System.out.println("Gestor Cliente creado");
    } 
    
    public void gestionarPolizas(){  
        int opcion=0;
        System.out.println("------       Cliente GNU Seguros        ------");
        System.out.println("_____________Cartera de Polizas________________");
        while(opcion!=3){
            System.out.println("------       Cliente GNU Seguros         ------");
            System.out.println("______________________________________________");
            System.out.println("------ (1): Ver status de Poliza   ------");
            System.out.println("------ (2): Pagar polizas           ------");
            System.out.println("------ (3): Regresar ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(4):
                    break;
                    
            }
        }
    }
    //public void
    void mostrar() {
        int opcion=0;
        while(opcion!=4){
            System.out.println("------       Cliente GNU Seguros         ------");
            System.out.println("______________________________________________");
            System.out.println("------ (1): Gestionar notificaciones    ------");
            System.out.println("------ (2): Gestionar polizas           ------");
            System.out.println("------ (3): Gestionar ticket de soporte ------");
            System.out.println("------ (4): Cerrar sesion               ------");
            opcion=sc.nextInt();
            switch(opcion){
                case(4):
                    break;
                    
            }
        }
    }
}
