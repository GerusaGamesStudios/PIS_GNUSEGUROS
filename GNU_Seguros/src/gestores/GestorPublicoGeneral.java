/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import autentificacion.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tealflipper
 */
public class GestorPublicoGeneral {

    private ProxyBDAutentificacion Tabla_cuentas=new ProxyBDAutentificacion();
    private ArrayList<Cuenta> BD;
    private Scanner sc=new Scanner(System.in);
    
    public Cuenta iniciarSesion(String correo, String contraseña){
        boolean correoVerificado=false;
        correoVerificado=verificarCorreo(correo);
        if(!correoVerificado){
            System.out.println("Correo incorrecto");
            
            //un delay de un segundo
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorPublicoGeneral.class.getName()).log(Level.SEVERE, null, ex);
            }
            //regresa referencia a nulo si no esta la cuenta o contraseña no es la misma
            return null;
        }else{
            BD=Tabla_cuentas.cargarBD();
            
            return Tabla_cuentas.getCuenta(correo,contraseña);
        }
    }
    
    
    
    private boolean verificarCorreo(String correo){
        for(int i=0; i<correo.length();i++){
            if(correo.charAt(i)=='@') return true;
        }
        return false;
    }
    
    
        
    public static void main(String [ ] args){
        GestorPublicoGeneral gestorGen=new GestorPublicoGeneral();
        Scanner sc=new Scanner(System.in);
        Cuenta sesion;
        int opcion;
        boolean continuar=true;
        String correo;
        String contraseña;
        while(continuar){
            System.out.println("------GNU Seguros------");
            System.out.println("(1): Inicio sesion");
            System.out.println("(2): Ver lista publica de agentes");
            System.out.println("(3): Visualizar seguros");
            System.out.println("(4): Cotizar seguro");
            System.out.println("(5): Consultar informacion");
            System.out.println("(6): Salir");
            System.out.print("\nOpcion: ");
            opcion=sc.nextInt();
            switch(opcion){
                case(1):
                    System.out.print("Ingresar correo: ");
                    correo=sc.next();
                    System.out.print("Ingresar contraseña: ");
                    contraseña=sc.next();
                    sesion=gestorGen.iniciarSesion(correo,contraseña); 
                    break;
                case(6):
                  continuar=false;
                  break;
              default: break;
            }  
        }
        
    }
}
