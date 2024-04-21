
package controlador;
import modelo.Tarifas;
import java.io.FileWriter;
import java.io.IOException;
public class CTarifas {
public void Registar(Tarifas nueva) throws IOException{
 String ruta ="Tarifas.txt";
 FileWriter BaseDeDatos = new FileWriter(ruta,true);
 BaseDeDatos.append(nueva.getTarifasporEst1()+"::"+nueva.getTarifasporEst2()+"::"+
 nueva.getTarifasporEst3()+"::"+nueva.getTarifasporEst4()+"::"+nueva.getTarifasporEst5()+"::"+
 nueva.getTarifasporEst6()+"::"+nueva.getConsumoEst1()+"::"+nueva.getConsumoEst2()+
 nueva.getConsumoEst3()+"::"+nueva.getConsumoEst4()+"::"+nueva.getConsumoEst5()+
 nueva.getConsumoEst6()+"::"+nueva.getSelecionelaCiudadparalaTarifa()+"::"+nueva.getSelecioneelBarrioparalaTarifa()+
 nueva.getKilovatioEst1()+"::"+nueva.getKilovatioEst2()+"::"+nueva.getKilovatioEst3()+
 nueva.getKilovatioEst4()+"::"+nueva.getKilovatioEst5()+"::"+nueva.getKilovatioEst6()+"\r\n");
 BaseDeDatos.close();
 }    

    
}
