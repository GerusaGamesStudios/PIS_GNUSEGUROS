/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacion;

import java.util.ArrayList;

/**
 *
 * @author tealflipper
 */
public class ProxyBDAutentificacion {
    //tablaCuentas sera un arraylist por el momento
	private ArrayList<Cuenta> tablaCuentas=new ArrayList<Cuenta>();
	
	//Las tablas seran arraylist por lo mientras
	public ArrayList<Cuenta> cargarBD(){
	    return this.tablaCuentas;
	}
	
	public void GuardarBD(ArrayList<Cuenta> Tabla){
            this.tablaCuentas=Tabla;
                
	}
	
	public Agente getCuentasAgente(){
            return null;
		
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
                        return this.tablaCuentas.get(i);
                    }
                }else return null;
            }
            return null;
	}
	
	public void addCuenta(Cuenta nueva){
		
	}
	
	public void deleteCuenta(Cuenta a_borrar){
		
	}
}
