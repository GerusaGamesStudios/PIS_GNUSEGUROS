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
public class TicketSoporte {
  public String prueba;
  private ArrayList<Boolean> ticketsSoporte = new ArrayList<Boolean>();
  
  public ArrayList<Boolean> getTicketsSoporte(){
    return this.ticketsSoporte;
  }
  public void setTicketSoporte(Boolean bol, int index){
    this.ticketsSoporte.set(index,bol);
  }

}
