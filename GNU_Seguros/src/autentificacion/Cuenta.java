/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autentificacion;

/**
 *
 * @author tealflipper
 */
public class Cuenta {
	private String nombre;
	private String correo;
	private String contraseña;
	private String id;
	
	
	public void setNombre(String _nombre){
		this.nombre=_nombre;
	}
	public void setContraseña(String _contraseña){
		this.contraseña=_contraseña;
	}
	
	public void setId(String _id){
		this.id=_id;
	}
	
	public String getNombre(){
		return this.nombre;
	} 
	
	public String getContraseña(){
		return this.contraseña;
	}
	
	public String getId(){
		return this.id;
	} 
	
    
}
