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
public class ListaAgentes implements java.io.Serializable {
    private ArrayList<Agente> agentes = new ArrayList<Agente>();
    public ListaAgentes(){
        
    }
    public void addAgente(Agente nuevo){
        System.out.println("Agente agregado");
        agentes.add(nuevo);
    }
    public int size(){
        return this.agentes.size();
    }
    public void deleteAgente(String nombreAgente){
        for(int i=0;i<this.agentes.size();i++){
                if(agentes.get(i).getNombre().compareTo("nombreAgente")==0){
                    agentes.remove(i);
                }           
            }
    }
    public Agente getAgente(int indice){
        return agentes.get(indice);
    }
    
    public Agente getAgente(String nombre){
        
        for(int i=0;i<this.agentes.size();i++){
                if(agentes.get(i).getNombre().compareTo("nombre")==0){
                    return agentes.get(i);
                }           
        }
        return null;
    }
}
