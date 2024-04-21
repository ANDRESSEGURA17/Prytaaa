
package controlador;
import modelo.Clientes;
import java.io.FileWriter;
import java.io.IOException;
public class Cclientes {
public void Registar(Clientes nueva) throws IOException{
 String ruta ="Clientes.txt";
 FileWriter BaseDeDatos = new FileWriter(ruta,true);
 BaseDeDatos.append(nueva.getNroreferencia()+"::"+nueva.getCedula()+"::"+
 nueva.getNombres()+"::"+nueva.getApellidos()+"::"+nueva.getBarrio()+"::"+
 nueva.getMunicipio()+"::"+nueva.getSexo()+"::"+nueva.getEstrato()+"\r\n");
 BaseDeDatos.close();
 }    
}
