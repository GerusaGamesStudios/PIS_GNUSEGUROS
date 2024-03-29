
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestores;

import autentificacion.*;
import info.Comunicado;
import info.ProxyBDInfo;
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
    private ProxyBDInfo Tabla_info=new ProxyBDInfo();
    private ListaAgentes agentes=new ListaAgentes();;
    private Scanner sc=new Scanner(System.in);
    public void setup(){
        
        Cuenta[] array=new Cuenta[5];
            array[0]=new Admin("jesus","chuy@gmail.com","hammettLover34",null);
            array[1]=new Agente("pedro","Pepe@gmail.com","chitosis79",null);
            array[2]=new Cliente("Juan","jaunillo@gmail.com","extasis",null);
            array[4]=new Agente("Luis","luis@gmail.com","amoamlo69",null);
            for(int i=0;i<5;i++){
               Tabla_cuentas.addCuenta(array[i]);
            }

        Tabla_cuentas.GuardarBD();
        Tabla_info.GuardarBD();
        
        agentes=Tabla_cuentas.getCuentasAgente();
        
    }
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
            System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\n");
            //regresa referencia a nulo si no esta la cuenta o contraseña no es la misma
            return null;
        }else{
            Tabla_cuentas.cargarBD();

            return Tabla_cuentas.getCuenta(correo,contraseña);
        }
    }



    private boolean verificarCorreo(String correo){
        for(int i=0; i<correo.length();i++){
            if(correo.charAt(i)=='@') return true;
        }
        return false;
    }

    public void verLPAgentes(){
        System.out.println("\n\n\n\n.........Lista Publica de Agentes...........");
        for(int i=0;i<this.agentes.size();i++){
            System.out.println("Nombre: "+this.agentes.getAgente(i).getNombre());
            System.out.println("Correo: "+this.agentes.getAgente(i).getCorreo());
            System.out.println("Numero de agente: "+this.agentes.getAgente(i).getNumeroAgente());
            System.out.println("Telefono: "+this.agentes.getAgente(i).getTelefono());
            System.out.println("Region: "+this.agentes.getAgente(i).getRegion());
            System.out.println("..............................................");
        }
        int op=0;
        System.out.println("(1): Regresar");
        while(op!=1){
            op=sc.nextInt();
        }
    }

    public void visualizarSeguros(){
        int opcion=0;
        while(opcion!=1){
            System.out.println("------Seguros------");
            System.out.println("Seguro 1\n\n\n\n");
            System.out.println("Seguro 2\n\n\n\n");
            System.out.println("Seguro 3\n\n\n\n");
            System.out.println("(1): Regresar");
            opcion=sc.nextInt();
        }
    }

    public void cotizarSeguro(){
        int opcion=0;
        while(opcion!=1){
            System.out.println("------Seguros------");
            System.out.println("Seguro 1: precio\n\n\n\n");
            System.out.println("Seguro 2: precio\n\n\n\n");
            System.out.println("Seguro 3: precio\n\n\n\n");
            System.out.println("(1): Regresar");
            opcion=sc.nextInt();
        }
    }

    public void consultarBanner(){
        int opcion=0;
        while(opcion!=1){
            System.out.println("------Consultar Banner------");
            System.out.println("Banner\n\n\n\n");
            System.out.println("(1): Regresar");
            opcion=sc.nextInt();
        }

    }
    public void consultarComunicados(){
        int opcion=0;
        while(opcion!=1){
          Tabla_info.cargarBD();
          ArrayList<Comunicado> comunicados = Tabla_info.getComunicados();
            System.out.println("------Consultar Comunicado------");
            for(int i= 0;i < comunicados.size();i++){
              System.out.println("Urgencia: "+comunicados.get(i).getNivelUrgencia() + "CM: " + comunicados.get(i).getComunicado());
            }
            System.out.println("(1): Regresar");
            opcion=sc.nextInt();
        }
    }
    public void consultarInformacion(){
        int opcion;
        System.out.println("------Consultar Informacion------");
        System.out.println("(1): Consultar banner");
        System.out.println("(2): Consultar Comunicado");
        System.out.println("(3): Regresar");
        opcion=sc.nextInt();
        switch(opcion){
            case (1):
                this.consultarBanner();
                break;
            case (2):
                this.consultarComunicados();
                break;
            case(3):
                break;
            default:
                break;
        }
    }

    public static void main(String [ ] args){

        GestorPublicoGeneral gestorGen=new GestorPublicoGeneral();
        gestorGen.setup();
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
                    if(sesion!=null){
                        String tipoCuenta=sesion.getClass().getSimpleName();
                        if(tipoCuenta.compareTo("Admin")==0){
                            GestorAdministrador nuevoGestor=new GestorAdministrador();
                            nuevoGestor.mostrar();
                        }else if(tipoCuenta.compareTo("Agente")==0){
                            GestorAgente nuevoGestor=new GestorAgente();
                            nuevoGestor.mostrar();
                        }else if(tipoCuenta.compareTo("Cliente")==0){
                            GestorCliente nuevoGestor=new GestorCliente();
                            nuevoGestor.mostrar();
                        }
                    }
                    break;
                case(2):
                    gestorGen.verLPAgentes();
                    break;
                case(3):
                    gestorGen.visualizarSeguros();
                    break;
                case(4):
                    gestorGen.cotizarSeguro();
                    break;
                case(5):
                    gestorGen.consultarInformacion();
                    break;
                case(6):
                  continuar=false;
                  break;
              default: break;
            }
        }

    }
}
