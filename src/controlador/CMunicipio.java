
package controlador;
import modelo.Municipio;
import java.io.FileWriter;
import java.io.IOException;
public class CMunicipio {
public void Registar(Municipio nueva) throws IOException{
 String ruta ="Municipio.txt";
 FileWriter BaseDeDatos = new FileWriter(ruta,true);
 BaseDeDatos.append(nueva.getElijaMunicipio()+"::"+nueva.getNumerodeIdentificacion()+"::"+nueva.getNombres()+"::"+
 nueva.getApellidos()+"::"+nueva.getEdad()+"::"+nueva.getAñodeNacimiento()+"::"+nueva.getSexo()+"::"+nueva.getEstrato()+"\r\n");
 BaseDeDatos.close();
 }    
    
}
