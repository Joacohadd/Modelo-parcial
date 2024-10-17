/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author joaqh
 */
public class Hotel {
    private String nombreHotel;
    private List<Habitacion> inventarioHabitaciones;

    public Hotel(String nombreHotel, List<Habitacion> inventarioHabitaciones) {
        this.nombreHotel = nombreHotel;
        this.inventarioHabitaciones = new ArrayList<>(inventarioHabitaciones); // Crea una nueva lista
    }
    
    public void agregarHabitacion(Habitacion habitacion) throws Exception {
        // Verifica si la habitación ya existe
        for (Habitacion h : inventarioHabitaciones) {
            if (h.getCodigoHabitacion().equals(habitacion.getCodigoHabitacion())) {
                throw new Exception("La habitación con código " + habitacion.getCodigoHabitacion() + " ya existe.");
            }
        }
        inventarioHabitaciones.add(habitacion); // Añade la habitación a la lista
    }
    
    public void reservarHabitacion(String codigoHabitacion, int dias) throws Exception{
        // Buscar la habitación en el inventario
        Habitacion habitacion = buscarHabitacionPorCodigo(codigoHabitacion);
        
        if (habitacion == null) {
        throw new Exception("La habitación con código " + codigoHabitacion + " no existe.");
        }
        
        if (habitacion.isEstaOcupada()){
            throw new Exception("La habitacion esta ocupada");
        }
        habitacion.setEstaOcupada(true);
        System.out.println("Habitación " + codigoHabitacion + " reservada por " + dias + " días.");
         // Aquí puedes incluir condiciones específicas para ciertos tipos de habitaciones
        if (habitacion instanceof HabitacionDeluxe) {
            HabitacionDeluxe deluxe = (HabitacionDeluxe) habitacion;
            if (dias < deluxe.getNumeroNochesMinimas()) {
                throw new Exception("La habitación Deluxe requiere un mínimo de " + deluxe.getNumeroNochesMinimas() + " noches.");
            }
        }

        // Si todo está bien, marca la habitación como ocupada
        habitacion.setEstaOcupada(true);
    
    }
    
    public void liberarHabitacion(String codigoHabitacion) throws Exception {
        Habitacion habitacion = buscarHabitacionPorCodigo(codigoHabitacion);
        
        if (!habitacion.isEstaOcupada()){
            throw new Exception("La habitación no estaba reservada.");
        }
        habitacion.setEstaOcupada(false);
        System.out.println("La habitación con código " + codigoHabitacion + " ha sido liberada.");
    }
    
    public double calcularCostoEstadia(String codigoHabitacion, int dias) throws Exception {
        Habitacion habitacion = buscarHabitacionPorCodigo(codigoHabitacion);
        
        if (habitacion == null) {
        throw new Exception("La habitación con código " + codigoHabitacion + " no existe.");
        }
          
        
        if (!habitacion.isEstaOcupada()){
            throw new Exception("La habitación no estaba reservada.");
        }
        
        // Calcular y devolver el costo total de la estadía
           return habitacion.calcularPrecioTotal(dias);
    }


    private Habitacion buscarHabitacionPorCodigo(String codigoHabitacion) {
    // Recorre la lista de habitaciones y busca la que tenga el código proporcionado
        for (Habitacion habitacion : inventarioHabitaciones) {
            if (habitacion.getCodigoHabitacion().equals(codigoHabitacion)) {
                return habitacion; // Devuelve la habitación encontrada
            }
        }
        return null; // Si no se encuentra ninguna habitación con ese código, devuelve null
}
    
}
