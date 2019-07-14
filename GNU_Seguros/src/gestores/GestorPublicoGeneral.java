/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import autentificacion.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tealflipper
 */
public class GestorPublicoGeneral {

    private ProxyBDAutentificacion Tabla_a=new ProxyBDAutentificacion();
    private ArrayList<Cuenta> BD;
    private Scanner sc=new Scanner(System.in);
    
    public Cuenta iniciarSesion(){
        String correo=new String();
        boolean correoVerificado=false;
        System.out.println("Ingrese el correo electronico");
        correo=sc.nextLine();
        correoVerificado=verificarCorreo(correo);
        if(!correoVerificado) return null;
        return null;
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
        int opcion;
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
                gestorGen.iniciarSesion();
        }
    }
}
