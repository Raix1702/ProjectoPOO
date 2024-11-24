package javaapplication56;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


abstract class GastoBase {
    protected String categoria;
    protected double monto;
    protected String fecha; // Formato "YYYY-MM-DD"

    public GastoBase(String categoria, double monto, String fecha) {
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

// Clase concreta
public class Gasto extends GastoBase {
    public Gasto(String categoria, double monto, String fecha) {
        super(categoria, monto, fecha);
    }
}

