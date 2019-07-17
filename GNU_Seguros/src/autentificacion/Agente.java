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
    private String telefono;
    private int region;
    private Notificaciones notificacion;

    public Agente(String nombre,String correo,String contraseña,String id){
        super(nombre,correo,contraseña,id);
    }

    public void setTelefono(String tel){
      this.telefono = tel;
    }
    public String getTelefono(){
      return this.telefono;
    }

    public void setNotificacion( Notificaciones notifi){
      this.notificacion = notifi;
    }
    public Notificaciones getNotificacion(){
      return this.notificacion;
    }

    public void setNumeroAgente(String num){
      this.numeroAgente = num;
    }
    public void setRegion(int region){
      this.region = region;
    }
    public void setnotificacion(Notificaciones n){
        this.notificacion=n;
    }
    public String getNumeroAgente(){
      return this.numeroAgente;
    }
    public int getRegion(){
      return this.region;
    }
    public Notificaciones get(){
      return this.notificacion;
    }
}
