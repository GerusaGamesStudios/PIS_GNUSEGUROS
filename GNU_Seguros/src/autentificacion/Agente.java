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
public class Agente {
    private String numeroAgente;
    private String numero;
    private Int region;
    private Notificaciones notificacion;

    public void setNumeroAgente(String num){
      this.numeroAgente = num;
    }
    public String getNumeroAgente(){
      return this.numeroAgente;
    }
}
