
package modelo;

public class Barrios {
private String ElijaBarrio;
private String NumeroDeIdentificacion;
private String Nombres;
private String Apellidos;
private String Edad;
private String AñodeNacimiento;
private String AñosenelBarrio;
private String Conquienvive;
private String UstedEs;
private String Sexo;
private String SuBarrioEsInseguro;
private String Estrato;

    public String getElijaBarrio() {
        return ElijaBarrio;
    }

    public String getNumeroDeIdentificacion() {
        return NumeroDeIdentificacion;
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

    public String getAñosenelBarrio() {
        return AñosenelBarrio;
    }

    public String getConquienvive() {
        return Conquienvive;
    }

    public String getUstedEs() {
        return UstedEs;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getSuBarrioEsInseguro() {
        return SuBarrioEsInseguro;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setElijaBarrio(String EligaBarrio) {
        this.ElijaBarrio = EligaBarrio;
    }

    public void setNumeroDeIdentificacion(String NumeroDeIdentificacion) {
        this.NumeroDeIdentificacion = NumeroDeIdentificacion;
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

    public void setAñosenelBarrio(String AñosenelBarrio) {
        this.AñosenelBarrio = AñosenelBarrio;
    }

    public void setConquienvive(String Conquienvive) {
        this.Conquienvive = Conquienvive;
    }

    public void setUstedEs(String UstedEs) {
        this.UstedEs = UstedEs;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setSuBarrioEsInseguro(String SuBarrioEsInseguro) {
        this.SuBarrioEsInseguro = SuBarrioEsInseguro;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }
public Barrios(String EliBa,String NumIde,String nom, String ape,String ed,String AñodeNa,String AñoBa,String ConQVi,String UstEs,String sex,String SuBaIn,String est){
 this.ElijaBarrio=EliBa;
 this.NumeroDeIdentificacion=NumIde;
 this.Nombres=nom;
 this.Apellidos=ape;
 this.Edad=ed;
 this.AñodeNacimiento=AñodeNa;
 this.AñosenelBarrio=AñoBa;
 this.Conquienvive=ConQVi;
 this.UstedEs=UstEs;
 this.Sexo=sex;
 this.SuBarrioEsInseguro=SuBaIn;
 this.Estrato=est;
 }   
}
