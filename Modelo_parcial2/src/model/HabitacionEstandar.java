/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joaqh
 */
public class HabitacionEstandar extends Habitacion {
    protected boolean limpiezaIncluida;
    protected double costoLimpieza; 

    public HabitacionEstandar(String codigoHabitacion, boolean estaOcupada, double precioPorNoche,
                              boolean limpiezaIncluida, double costoLimpieza) {
        super(codigoHabitacion, estaOcupada, precioPorNoche);
        this.limpiezaIncluida = limpiezaIncluida; // Asigna el valor del parámetro al atributo
        this.costoLimpieza = costoLimpieza;       // Asigna el valor del parámetro al atributo
    }

    public boolean isLimpiezaIncluida() {
        return limpiezaIncluida;
    }

    public void setLimpiezaIncluida(boolean limpiezaIncluida) {
        this.limpiezaIncluida = limpiezaIncluida;
    }

    public double getCostoLimpieza() {
        return costoLimpieza;
    }

    public void setCostoLimpieza(double costoLimpieza) {
        this.costoLimpieza = costoLimpieza;
    }

    @Override
    public String toString() {
        return "HabitacionEstandar{" + "codigoHabitacion "+ codigoHabitacion + ", estaOcupada"+ estaOcupada+ ", precioPorNoche"+ precioPorNoche + "limpiezaIncluida=" + limpiezaIncluida + ", costoLimpieza=" + costoLimpieza + '}';
    }


    @Override
    public double calcularPrecioTotal(int dias) {
        double precioTotal = getPrecioPorNoche() * dias;
        
        if (!limpiezaIncluida) {
            precioTotal += costoLimpieza;
        }
          return precioTotal; // Devuelve el precio total final
    }
}
