
package controlador;
import modelo.Facturas;
import java.io.FileWriter;
import java.io.IOException;
public class CFacturas {
public void Registar(Facturas nueva) throws IOException{
 String ruta ="Facturas.txt";
 FileWriter BaseDeDatos = new FileWriter(ruta,true);
 BaseDeDatos.append(nueva.getFacturadeservicioNo()+"::"+nueva.getNombres()+"::"+nueva.getApellidos()+"::"+
 nueva.getDireccion()+"::"+nueva.getEligaSuBarrioParaSuFactura()+"::"+nueva.getEligaLaCiudadParaSuFactura()+"::"+nueva.getDireccionParaEnivarFactura()+"::"+nueva.getTelefeno()+"::"+nueva.getElijaSuEstratoParaSuFactura()+"::"+
 nueva.getTotalAPagarSegunSuEstrato()+"\r\n");
 BaseDeDatos.close();
 }
}
