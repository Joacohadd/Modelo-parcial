/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author joaqh
 */
public class HabitacionDeluxe extends Habitacion {
    private boolean incluyeDesayuno;
    private double tarifaDesayuno;
    private int numeroNochesMinimas;

    
    public HabitacionDeluxe(String codigoHabitacion, boolean estaOcupada, double precioPorNoche,
                            boolean incluyeDesayuno, double tarifaDesayuno, int numeroNochesMinimas) {
        super(codigoHabitacion, estaOcupada, precioPorNoche);
        this.incluyeDesayuno = incluyeDesayuno;
        this.tarifaDesayuno = tarifaDesayuno;
        this.numeroNochesMinimas = numeroNochesMinimas;
    }

    public boolean isIncluyeDesayuno() {
        return incluyeDesayuno;
    }

    public void setIncluyeDesayuno(boolean incluyeDesayuno) {
        this.incluyeDesayuno = incluyeDesayuno;
    }

    public double getTarifaDesayuno() {
        return tarifaDesayuno;
    }

    public void setTarifaDesayuno(double tarifaDesayuno) {
        this.tarifaDesayuno = tarifaDesayuno;
    }

    public int getNumeroNochesMinimas() {
        return numeroNochesMinimas;
    }

    public void setNumeroNochesMinimas(int numeroNochesMinimas) {
        this.numeroNochesMinimas = numeroNochesMinimas;
    }

    @Override
    public String toString() {
        return "HabitacionDeluxe{" + "codigohabitacion="+ codigoHabitacion+ ", ocupada"+ estaOcupada + ",PrecioPorNoche"+ precioPorNoche + ",incluyeDesayuno=" + incluyeDesayuno + ", tarifaDesayuno=" + tarifaDesayuno + ", numeroNochesMinimas=" + numeroNochesMinimas + '}';
    }

    
    
    
    @Override
    public double calcularPrecioTotal(int dias) {
        double precioTotal = getPrecioPorNoche() * dias;

        // Si incluye desayuno, añadir tarifa de desayuno
        if (incluyeDesayuno) {
            precioTotal += tarifaDesayuno * dias; // Asumiendo que se cobra por cada día
        }

        // Si se requiere un número mínimo de noches
        if (dias < numeroNochesMinimas) {
            precioTotal *= 1.20;
        }
        
         // Aplica el descuento del 10% solo al precio de la habitación si la estancia es mayor a 7 días
        if (dias > 7) {
        double precioBaseConDescuento = getPrecioPorNoche() * dias * 0.90;
        double costoDesayuno = 0;
            if (incluyeDesayuno) {
                costoDesayuno = tarifaDesayuno * dias;
            }
            precioTotal = precioBaseConDescuento + costoDesayuno;
    }

    return precioTotal;
}
}
