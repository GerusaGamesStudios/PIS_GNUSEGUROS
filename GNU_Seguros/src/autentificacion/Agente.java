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
public class Agente extends Cuenta{
    Agente(String nombre,String correo,String contraseña,String id){
        super(nombre,correo,contraseña,id);
    }
    
    private String numeroAgente;
    private String numero;
    private int region;
    private Notificaciones notificacion;

    public void setNumeroAgente(String num){
      this.numeroAgente = num;
    }
    public String getNumeroAgente(){
      return this.numeroAgente;
    }
}
