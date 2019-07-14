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
	
	public void GuardarBD(){
		
	}
	
	public Agente getCuentasAgente(){
            return null;
		
	}
	
	public Cuenta getCuenta(){
            return null;
		
	}
	
	public void addCuenta(Cuenta nueva){
		
	}
	
	public void deleteCuenta(Cuenta a_borrar){
		
	}
}
