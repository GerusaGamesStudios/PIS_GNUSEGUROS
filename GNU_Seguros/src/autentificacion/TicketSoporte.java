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
public class TicketSoporte {
  public String prueba;
  private ArrayList<Bool> ticketsSoporte = new ArrayList<Bool>();
  public ArrayList<Bool> getTicketsSoporte(){
    return this.ticketsSoporte;
  }
  public void setTicketSoporte(Bool bol, int index){
    this.ticketsSoporte[index] = bol;
  }

}
