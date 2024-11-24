

package Generar_Reporte;

import java.util.Date;


public class Reporte_Transacciones{

    private Date fecha;
    private double saldoInicial, monto;
    private double Ingreso, Egreso; // String tipo;(I)Ingreso, (E)Egreso
    
public Reporte_Transacciones(Date fecha, double saldoInicial,
    double monto, double Ingreso, double Egreso) {
    this.fecha = fecha;
    this.saldoInicial = saldoInicial;
    this.monto = monto;
    this.Ingreso = Ingreso;
    this.Egreso = Egreso;
    }

public void generaIngreso(double monto){
    if(monto > 0){
    this.Ingreso += monto;
    System.out.println("Se ingreso: "+monto);
    }else{
    System.out.println("Dato incorrecto!");
    }
}
   public void generaEgreso(double monto){
   if( monto > 0 && monto <= (saldoInicial + Ingreso) ){
   this.Egreso += monto;
   System.out.println("Se egreso: " + monto);
   } else if (monto > (saldoInicial + Ingreso)) {
   System.out.println("Excede el monto total de la cuenta");
   } else {
   System.out.println("Dato incorrecto!");
   }
}
    public double calcularSaldoFinal() {
        return saldoInicial + Ingreso - Egreso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getIngreso() {
        return Ingreso;
    }

    public void setIngreso(double Ingreso) {
        this.Ingreso = Ingreso;
    }

    public double getEgreso() {
        return Egreso;
    }

    public void setEgreso(double Egreso) {
        this.Egreso = Egreso;
    }

}
