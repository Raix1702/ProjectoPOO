
import java.text.ParseException;
import javaapplication56.AnalisisTendenciasGastos;
import javaapplication56.Gasto;

public class Main {
    public static void main(String[] args) {
        AnalisisTendenciasGastos analisis = new AnalisisTendenciasGastos();

        analisis.agregarGasto(new Gasto("Marketing", 1200.50, "2023-01-10"));
        analisis.agregarGasto(new Gasto("Operaciones", 800.75, "2023-02-15"));
        analisis.agregarGasto(new Gasto("Marketing", 1300.20, "2023-03-22"));

        try {
            analisis.analizarTendencias("2023-01-01", "2023-03-31");
            analisis.mostrarGastos();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
