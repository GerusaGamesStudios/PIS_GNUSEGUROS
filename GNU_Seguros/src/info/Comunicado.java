/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

/**
 *
 * @author tealflipper
 */
public class Comunicado {
  int nivelUrgencia;
  private String comunicado;
  void Comunicado(){
    this.comunicado = "esto es un comunicado";
  }
public String getComunicado(){
  return this.comunicado;
}
  public void setNivelUrgencia(int u){
    this.nivelUrgencia = u;
  }
  public int getNivelUrgencia(){
    return this.nivelUrgencia;
  }

}
