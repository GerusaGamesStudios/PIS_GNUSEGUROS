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
public class ListaAgentes implements java.io.Serializable {
  private ArrayList<Agente> ListaAgentes = new ArrayList<Agente>();
  public void addAgente(Agente a){
    this.listaAgentes.add(a);
  }
  public void deleteAgente(String str){
    for(int i = 0; i < this.ListaAgentes.lenght;i++){
      if(this.ListaAgentes[i].getNumeroAgente() == str){
        this.ListaAgentes.remove(i);
        return;
      }
    }
  }

  public Agente getAgente(int index){
    return this.ListaAgentes[index];
  }

}
