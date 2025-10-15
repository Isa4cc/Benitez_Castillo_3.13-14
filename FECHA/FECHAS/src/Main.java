import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
 Cree una clase llamada Fecha, que incluya tres variables de instancia: un mes (tipo int),
 un día (tipo int) y un año (tipo int). Su clase debe tener un constructor que inicialice
 las tres variables de instancia, y debe asumir que los valores que se proporcionan son correctos.
 Proporcione un método establecer y un método obtener para cada variable de instancia. Proporcione
 un método mostrarFecha, que muestre el mes, día y año, separados por barras diagonales (/).
 Escriba una aplicación de prueba llamada PruebaFecha, que demuestre las capacidades de la clase Fecha.
*/
public class Main {
    public static void main(String[] args) {
        /**Creación del objeto*/
        Fecha fecha1 = new Fecha();
        fecha1.obtenerfecha();
        JOptionPane.showMessageDialog(null, "La fecha del día es: "+ fecha1.getMes() + "/" +
                fecha1.getDia() + "/" + fecha1.getAnio());
    }
}