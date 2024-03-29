/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacion;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tealflipper
 */
//Base de daots sera un archivo de clases
public class ProxyBDAutentificacion implements java.io.Serializable {
    //tablaCuentas sera un arraylist por el momento
	private ArrayList<Cuenta> tablaCuentas=new ArrayList<Cuenta>();
        private ListaAgentes listaAgentes=new ListaAgentes();
	private String nombreBD="tablaCuentas.ser";
        
        public ProxyBDAutentificacion(){

           
            
            
        }
	
	//Las tablas seran arraylist por lo mientras
	//Deserializa el objeto
	public void cargarBD(){
		ArrayList<Cuenta> nueva=null;
	    try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(nombreBD); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            tablaCuentas = (ArrayList<Cuenta>)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Tabla de Cuentas ha sido cargada."); 
	    try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProxyBDAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
          
        catch(Exception ex) 
        { 
            System.out.println("Error al cargar la BD"); 
        } 
    }
	//serializa el objeto
	public void GuardarBD(){
	   try{    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream(nombreBD); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(this.tablaCuentas); 
              
            out.close(); 
              
            System.out.println("Tabla de Cuentas ha sido guardada."); 
	    try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProxyBDAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
  
        } 
        catch(IOException ex) 
        { 
            ex.printStackTrace(); 
        } 
    }
	
	public ListaAgentes getCuentasAgente(){
            
            return listaAgentes;
		
	}
	
	public Cuenta getCuenta(String correo,String contraseña){
            
            for(int i=0;i<this.tablaCuentas.size();i++){
                /*
                 *compara para ver si el correo de alguna de las cuentas es igual
                 *al correo dado
                 */
                if(this.tablaCuentas.get(i).getCorreo().compareTo(correo)==0){
                    /*
                    *Caso en el cual el correo de una cuenta corresponde al correo dado
                    * Ahora compara si la contraseña de la cuenta es igual a la 
                    * cotraseña dada
                    */
                    if(this.tablaCuentas.get(i).getContraseña().compareTo(contraseña)==0){
                        System.out.println("exito!!");
                        //un delay de un segundo
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ProxyBDAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                                    return this.tablaCuentas.get(i);
                    }
                }
            }
            System.out.println("Cuenta no encontrada!!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProxyBDAutentificacion.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
	}
	public Cuenta getCuenta(int i){
            return tablaCuentas.get(i);
        }
        public Cuenta getCuentaAdmin(){
            return null;
        }
	public void addCuenta(Cuenta nueva){
            this.tablaCuentas.add(nueva);
	}
	
	public void deleteCuenta(Cuenta a_borrar){
		
	}
        
        public void setNombreBD(String nombre){
            this.nombreBD=nombre;
        }
        
        public String getNombreBD(){
            return this.nombreBD;
        }
        
        public ArrayList<Cuenta> getTablaCuentas(){
            return this.tablaCuentas;
        }
        public int size(){
            return this.tablaCuentas.size();
        }
}
