
package modelo;

public class Facturas {
private String FacturadeservicioNo;
private String Nombres;
private String Apellidos;
private String Direccion;
private String EligaSuBarrioParaSuFactura;
private String EligaLaCiudadParaSuFactura;
private String DireccionParaEnivarFactura;
private String Telefeno;
private String ElijaSuEstratoParaSuFactura;
private String TotalAPagarSegunSuEstrato;

    public String getFacturadeservicioNo() {
        return FacturadeservicioNo;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getEligaSuBarrioParaSuFactura() {
        return EligaSuBarrioParaSuFactura;
    }

    public String getEligaLaCiudadParaSuFactura() {
        return EligaLaCiudadParaSuFactura;
    }

    public String getDireccionParaEnivarFactura() {
        return DireccionParaEnivarFactura;
    }

    public String getTelefeno() {
        return Telefeno;
    }

    public String getElijaSuEstratoParaSuFactura() {
        return ElijaSuEstratoParaSuFactura;
    }

    public String getTotalAPagarSegunSuEstrato() {
        return TotalAPagarSegunSuEstrato;
    }

    public void setFacturadeservicioNo(String FacturadeservicioNo) {
        this.FacturadeservicioNo = FacturadeservicioNo;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setEligaSuBarrioParaSuFactura(String EligaSuBarrioParaSuFactura) {
        this.EligaSuBarrioParaSuFactura = EligaSuBarrioParaSuFactura;
    }

    public void setEligaLaCiudadParaSuFactura(String EligaLaCiudadParaSuFactura) {
        this.EligaLaCiudadParaSuFactura = EligaLaCiudadParaSuFactura;
    }

    public void setDireccionParaEnivarFactura(String DireccionParaEnivarFactura) {
        this.DireccionParaEnivarFactura = DireccionParaEnivarFactura;
    }

    public void setTelefeno(String Telefeno) {
        this.Telefeno = Telefeno;
    }

    public void setElijaSuEstratoParaSuFactura(String ElijaSuEstratoParaSuFactura) {
        this.ElijaSuEstratoParaSuFactura = ElijaSuEstratoParaSuFactura;
    }

    public void setTotalAPagarSegunSuEstrato(String TotalAPagarSegunSuEstrato) {
        this.TotalAPagarSegunSuEstrato = TotalAPagarSegunSuEstrato;
    }
public Facturas(String FacSeNo,String nom,String ape,String Dire,String EliBaFac,String EliCiFac,String DireEnFac,String Tel,String EliEstFac,String ToPaEst){
this.FacturadeservicioNo=FacSeNo;
this.Nombres=nom;
this.Apellidos=ape;
this.Direccion=Dire;
this.EligaSuBarrioParaSuFactura=EliBaFac;
this.EligaLaCiudadParaSuFactura=EliCiFac;
this.DireccionParaEnivarFactura=DireEnFac;
this.Telefeno=Tel;
this.ElijaSuEstratoParaSuFactura=EliEstFac;
this.TotalAPagarSegunSuEstrato=ToPaEst;
}

}
