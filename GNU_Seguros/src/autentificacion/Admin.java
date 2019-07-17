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
public class Admin extends Cuenta {
    public String name;
    public Admin(String nombre,String correo,String contraseña,String id){
        super(nombre,correo,contraseña,id);
    }
    
}
