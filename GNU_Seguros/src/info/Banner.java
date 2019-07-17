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
public class Banner {
  private ArrayList<String> galeria = new ArrayList<String>();
  public void setImagen(String str){
    this.galeria.add(str);
  }
  public String getImagen(String str){
    for(int i = 0 ; i < this.galeria.lenght;i++){
      if(this.galeria[i] == str){
        return this.galeria[i];
      }
    }
  }
}
