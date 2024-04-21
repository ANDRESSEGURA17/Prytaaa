
package modelo;

public class Municipio {
private String ElijaMunicipio;
private String NumerodeIdentificacion;
private String Nombres;
private String Apellidos;
private String Edad;
private String AñodeNacimiento;
private String Sexo;
private String Estrato;

    public String getElijaMunicipio() {
        return ElijaMunicipio;
    }
    public String getNumerodeIdentificacion(){
        return NumerodeIdentificacion;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }
    public String getEdad() {
        return Edad;
    }
    public String getAñodeNacimiento() {
        return AñodeNacimiento;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setElijaMunicipio(String EligaMunicipio) {
        this.ElijaMunicipio = EligaMunicipio;
    }
    public void setNumerodeIdentificacion(String NumerodeIdentificacion) {
        this.NumerodeIdentificacion = NumerodeIdentificacion;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public void setAñodeNacimiento(String AñodeNacimiento) {
        this.AñodeNacimiento = AñodeNacimiento;
    }
    
    
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }
public Municipio(String EliMun,String NumIde,String nom, String ape,String ed,String AñodeNa,String sex,String est){
   this.ElijaMunicipio=EliMun;
   this.NumerodeIdentificacion=NumIde;
   this.Nombres=nom;
   this.Apellidos=ape;
   this.Edad=ed;
   this.AñodeNacimiento=AñodeNa;
   this.Sexo=sex;
   this.Estrato=est;  
}
}
