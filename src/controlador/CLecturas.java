
package controlador;
import modelo.Lecturas;
import java.io.FileWriter;
import java.io.IOException;
public class CLecturas {
public void Registar(Lecturas nueva) throws IOException{
 String ruta ="Lecturas.txt";
 FileWriter BaseDeDatos = new FileWriter(ruta,true);
 BaseDeDatos.append(nueva.getNoMedidor()+"::"+nueva.getLecturakWhEst1()+"::"+nueva.getLecturakWhEst2()+"::"+
 nueva.getLecturakWhEst3()+"::"+nueva.getLecturakWhEst4()+"::"+nueva.getLecturakWhEst5()+"::"+
 nueva.getLecturakWhEst6()+"::"+nueva.getElijaLaLecturaParaSuCiudad()+"::"+nueva.getElijaLaLecturaParaSuBarrio()+"::"+
 nueva.getConsumoEst1()+"::"+nueva.getConsumoEst2()+"::"+nueva.getConsumoEst3()+"::"+nueva.getConsumoEst4()+"::"+
 nueva.getConsumoEst5()+"::"+nueva.getConsumoEst6()+"::"+"\r\n");
 BaseDeDatos.close();
 }       
}
