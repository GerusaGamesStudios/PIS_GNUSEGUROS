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
    private String numeroAgente;
    private String numero;
    private int region;
    private Notificaciones notificacion;
    
    public Agente(String nombre,String correo,String contraseña,String id){
        super(nombre,correo,contraseña,id);
    }
    
    

    public void setNotificacion( Notificaciones notifi){
      this.notificacion = notifi;
    }

    public void setNumeroAgente(String num){
      this.numeroAgente = num;
    }
    public String getNumeroAgente(){
      return this.numeroAgente;
    }
    public void setRegion(int region){
      this.region = region;
    }
}
