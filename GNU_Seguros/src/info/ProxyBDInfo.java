/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tealflipper
 */
public class ProxyBDInfo {
    private ArrayList<Info> tablaInfos=new ArrayList<>();
    private ArrayList<Comunicado> comunicados = new ArrayList<>();
    private final String nombreBD="tablaInfo.ser";

    public ProxyBDInfo(){

            /*Cuenta[] array=new Cuenta[5];
            array[0]=new Admin("jesus","chuy@gmail.com","hammettLover34",null);
            array[1]=new Agente("pedro","Pepe@gmail.com","chitosis79",null);
            array[2]=new Cliente("Juan","jaunillo@gmail.com","extasis",null);
            array[4]=new Agente("Luis","luis@gmail.com","amoamlo69",null);
            for(int i=0;i<5;i++){
               tablaCuentas.add(array[i]);
            }
            */
    }

	//Las tablas seran arraylist por lo mientras
	//Deserializa el objeto
    public void cargarBD(){
	ArrayList<Info> nueva=null;
        try
        {
            // Reading the object from a file
            FileInputStream file = new FileInputStream("tablaInfo.ser");
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            tablaInfos   = (ArrayList<Info>)in.readObject();

            in.close();
            file.close();

            System.out.println("Tabla de Info ha sido cargada.");
	    try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProxyBDInfo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }catch(Exception ex)
        {
            System.out.println("Error al cargar la BD");
        }
    }
    //serializa el objeto
    public void GuardarBD(){
        try{
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream("tablaInfo.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);

            // Method for serialization of object
            out.writeObject(this.tablaInfos);

            out.close();
            file.close();

            System.out.println("Tabla de Info ha sido guardada.");
	    try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProxyBDInfo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
    }

    public ArrayList<Info> getPromosSeguros(){
        return null;
    }

    public ArrayList<Banner> getBanners(){

        return null;
    }

    public ArrayList<Comunicado> getComunicados(){
        return this.comunicados;
    }

    public Info getInfo(String id){
        return null;
    }
    public void addInfo(Info nueva){

    }

    public void deleteInfo(String id){

    }
}
