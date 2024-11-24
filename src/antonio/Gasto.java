 

package antonio;


public class Gasto{
    private String categoria;
    private double monto;
    private String fecha; // Formato "YYYY-MM-DD"
    
    public Gasto(String categoria, double monto, String fecha) {
        this.categoria = categoria;
        this.monto = monto;
        this.fecha = fecha;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getMonto() {
        return monto;
    }

    public String getFecha() {
        return fecha;
    }
}

