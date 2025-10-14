//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
 Cree una clase llamada Empleado, que incluya tres variables de instancia:
 - Un primer nombre (tipo String).
    - Un apellido paterno (tipo String).
    - Un salario mensual (double).
La clase debe tener un constructor que inicialice las tres variables de instancia.
Proporcione un metodo set y un get para cada variable de instancia.
Si el salario mensual no es positivo, no establezca su valor.
Escriba una aplicacion de prueba llamada PruebaEmpleado, que cree dos objetos Empleado y
Escriba una aplicación de prueba llamada PruebaEmpleado, que demuestre las capacidades de la clase Empleado.
Cree dos objetos Empleado y muestre el salario anual de cada objeto
Después, proporcione a cada Empleado un aumento del 10% y muestre el salario anual de cada Empleado otra vez.
*/


import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**Declaración de objetos*/
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = new Empleado();
        Scanner sc = new Scanner(System.in);

        /**Entrada de datos*/
        System.out.println("===============================");
        System.out.println("Bienvenido al sistema de empleados");
        System.out.println("===============================");
        System.out.println("Ingrese el nombre del primer empleado: ");
        empleado1.setPrimerNombre(sc.nextLine());
        System.out.println("Ingrese el apellido paterno del primer empleado: ");
        empleado1.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el salario mensual del primer empleado: ");
        empleado1.setSalarioMensual(sc.nextDouble());
        sc.nextLine(); // Limpiar el buffer

        System.out.println("Ingrese el nombre del segundo empleado: ");
        empleado2.setPrimerNombre(sc.nextLine());
        System.out.println("Ingrese el apellido paterno del segundo empleado: ");
        empleado2.setApellidoPaterno(sc.nextLine());
        System.out.println("Ingrese el salario mensual del segundo empleado: ");
        empleado2.setSalarioMensual(sc.nextDouble());

        /**Cálculo, salida de datos y declaración de variables de ayuda*/
        double salarioMesEmp1 = empleado1.getSalarioMensual();
        double salarioMesEmp2 = empleado2.getSalarioMensual();
        System.out.println("===============================");
        if (salarioMesEmp1 == 0){
            JOptionPane.showMessageDialog(null, "No ha ingresado un salario adecuado para el Empleado 1");
        }else{
            JOptionPane.showMessageDialog(null, "Empleado 1: \n" +
                    "Nombre: " + empleado1.getPrimerNombre() + "\n" +
                    "Apellido Paterno: " + empleado1.getApellidoPaterno() + "\n" +
                    "Salario Mensual: $" + empleado1.getSalarioMensual() + "\n" +
                    "Salario Anual: $" + empleado1.salarioAnual());
        }

        System.out.println("===============================");
        if (salarioMesEmp2 == 0){
            JOptionPane.showMessageDialog(null, "No ha ingresado un salario adecuado para el Empleado 2");
        }else{
            JOptionPane.showMessageDialog(null, "Empleado 2: \n" +
                    "Nombre: " + empleado2.getPrimerNombre() + "\n" +
                    "Apellido Paterno: " + empleado2.getApellidoPaterno() + "\n" +
                    "Salario Mensual: $" + empleado2.getSalarioMensual() + "\n" +
                    "Salario Anual: $" + empleado2.salarioAnual());
        }

        double aumentoEmp1 = empleado1.aumentarSalarioMensual(empleado1.getSalarioMensual()) * 12;
        double aumentoEmp2 = empleado2.aumentarSalarioMensual(empleado2.getSalarioMensual()) * 12;
        JOptionPane.showMessageDialog(null, "Empleado 1: \n" +
                "Nombre: " + empleado1.getPrimerNombre() + "\n" +
                "Apellido Paterno: " + empleado1.getApellidoPaterno() + "\n" +
                "Salario Anual con aumento del 10%: $" + aumentoEmp1);
        JOptionPane.showMessageDialog(null, "Empleado 2: \n" +
                "Nombre: " + empleado2.getPrimerNombre() + "\n" +
                "Apellido Paterno: " + empleado2.getApellidoPaterno() + "\n" +
                "Salario Anual con aumento del 10%: $" + aumentoEmp2);
    }
}