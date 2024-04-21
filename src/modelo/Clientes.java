
package modelo;


public class Clientes {
 private String Nroreferencia;
 private String Cedula;
 private String Nombres;
 private String Apellidos;
 private String Municipio;
 private String Barrio;
 private String Sexo;
 private String Estrato;

    public String getNroreferencia() {
        return Nroreferencia;
    }

    public String getCedula() {
        return Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public String getBarrio() {
        return Barrio;
    }

    public String getSexo() {
        return Sexo;
    }

    public String getEstrato() {
        return Estrato;
    }

    public void setNroreferencia(String Nroreferencia) {
        this.Nroreferencia = Nroreferencia;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public void setBarrio(String Barrio) {
        this.Barrio = Barrio;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public void setEstrato(String Estrato) {
        this.Estrato = Estrato;
    }
   public Clientes(String nroref,String ced,String nom, String ape,String mun,String bar,String sex,String est){
   this.Nroreferencia=nroref;
   this.Cedula=ced;
   this.Nombres=nom;
   this.Apellidos=ape;
   this.Municipio=mun;
   this.Barrio=bar;
   this.Sexo=sex;
   this.Estrato=est;

 } 
}
