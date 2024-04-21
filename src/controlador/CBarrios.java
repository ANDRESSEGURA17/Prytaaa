
package controlador;
import modelo.Barrios;
import java.io.FileWriter;
import java.io.IOException;
public class CBarrios {
public void Registar(Barrios nueva) throws IOException{
 String ruta ="Barrios.txt";
 FileWriter BaseDeDatos = new FileWriter(ruta,true);
 BaseDeDatos.append(nueva.getElijaBarrio()+"::"+nueva.getNumeroDeIdentificacion()+"::"+nueva.getNombres()+"::"+
 nueva.getApellidos()+"::"+nueva.getEdad()+"::"+nueva.getAñodeNacimiento()+"::"+nueva.getAñosenelBarrio()+"::"+
 nueva.getConquienvive()+"::"+nueva.getUstedEs()+"::"+nueva.getSexo()+"::"+
 nueva.getSuBarrioEsInseguro()+"::"+nueva.getEstrato()+"\r\n");
 BaseDeDatos.close();
 }    
    
}
