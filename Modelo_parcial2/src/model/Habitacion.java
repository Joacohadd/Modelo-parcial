/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joaqh
 */
public abstract class Habitacion {
    protected String codigoHabitacion;
    protected boolean estaOcupada;
    protected double precioPorNoche;

    public Habitacion(String codigoHabitacion, boolean estaOcupada, double precioPorNoche) {
        if(codigoHabitacion.length() !=5){
            throw new IllegalArgumentException("El codigo debe tener 5 caracteres");
        }

        this.codigoHabitacion = codigoHabitacion;
        this.estaOcupada = estaOcupada;
        this.precioPorNoche = precioPorNoche;
    }

    public String getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(String codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

    public boolean isEstaOcupada() {
        return estaOcupada;
    }

    public void setEstaOcupada(boolean estaOcupada) {
        this.estaOcupada = estaOcupada;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "codigoHabitacion=" + codigoHabitacion + ", estaOcupada=" + estaOcupada + ", precioPorNoche=" + precioPorNoche + '}';
    }
    
    
    
    public abstract double calcularPrecioTotal(int dias);
    
    
}
