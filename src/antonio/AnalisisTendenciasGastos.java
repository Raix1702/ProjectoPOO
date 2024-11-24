

package antonio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AnalisisTendenciasGastos {

    private List<Gasto> listaGastos;

    public AnalisisTendenciasGastos() {
        listaGastos = new ArrayList<>();
    }

   
    public void agregarGasto(Gasto gasto) {
        listaGastos.add(gasto);
    }

   
    public void analizarTendencias(String fechaInicio, String fechaFin) throws ParseException {
        double totalGastosPeriodo = 0.0;
        double gastoAnterior = 0.0;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date inicio = sdf.parse(fechaInicio);
        Date fin = sdf.parse(fechaFin);
        
        for (Gasto gasto : listaGastos) {
            Date fechaGasto = sdf.parse(gasto.getFecha());
            if (fechaGasto.after(inicio) && fechaGasto.before(fin)) {
                totalGastosPeriodo += gasto.getMonto();
            }
        }

        if (gastoAnterior != 0) {
            double variacionPorcentual = ((totalGastosPeriodo - gastoAnterior) / gastoAnterior) * 100;
            System.out.println("La variación porcentual de gastos entre " + fechaInicio + " y " + fechaFin + " es: " + variacionPorcentual + "%");
        }
        gastoAnterior = totalGastosPeriodo;
    }


    public void mostrarGastos() {
        for (Gasto gasto : listaGastos) {
            System.out.println("Gasto: " + gasto.getCategoria() + " - Monto: " + gasto.getMonto() + " - Fecha: " + gasto.getFecha());
        }
    }
}
