import javax.swing.*;

public class Fecha {
    /**Declaración de atributos*/
    private int mes;
    private int dia;
    private int anio;

    /**Declaración del constructor*/
    public Fecha() {
    }

    public Fecha(int mes, int dia, int anio) {
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    /**Declaración de los métodos set y get*/
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    /**Métodos de programador*/

    public void obtenerfecha() {
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el día"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el mes"));
        int ani = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año"));

        setMes(mes);
        setDia(dia);
        setAnio(ani);
    }

    public String mostrarFecha(){
        return getDia() + "/" + getMes() + "/" + getAnio();
    }

}
