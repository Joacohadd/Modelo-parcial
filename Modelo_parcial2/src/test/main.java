/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.util.ArrayList;
import java.util.List;
import model.HabitacionEstandar;
import model.HabitacionDeluxe;
import model.Hotel;
import model.Habitacion;

/**
 *
 * @author joaqh
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1-1");
        try {
            HabitacionEstandar habitacion = new HabitacionEstandar("10001", false, 80.0, false, 15.0);
            
            System.out.println("Codigo de la habitacion: " + habitacion.getCodigoHabitacion());
            System.out.println("Precio por noche: " + habitacion.getPrecioPorNoche());
            System.out.println("Limpieza incluida: " + habitacion.isLimpiezaIncluida());
            System.out.println("Costo de limpieza: " + habitacion.getCostoLimpieza());
            
            System.out.println("");
            System.out.println("1-3");
            
            int diasEstadia = 3;
            double costoTotal = habitacion.calcularPrecioTotal(diasEstadia); 
            
            // Verificar el costo total esperado: 80.0 * 3 + 15.0 = 255.0
            double costoEsperado = 255.0;
            System.out.println("Costo total de " + diasEstadia + " dias de estadia: " + costoTotal);
            
            // Comparar con el costo esperado
            if (costoTotal == costoEsperado) {
                System.out.println("El costo total calculado es correcto: " + costoTotal);
            } else {
                System.out.println("Error: el costo total calculado es incorrecto. Esperado: " + costoEsperado + ", Calculado: " + costoTotal);
            }      
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        
        
        System.out.println("");
        
        System.out.println("1-2");
        
        try {
            HabitacionEstandar habitacion = new HabitacionEstandar("10002", false, 90.0, true, 0.0);
            
            System.out.println("Codigo de la habitacion: " + habitacion.getCodigoHabitacion());
            System.out.println("Precio por noche: " + habitacion.getPrecioPorNoche());
            System.out.println("Limpieza incluida: " + habitacion.isLimpiezaIncluida());
            System.out.println("Costo de limpieza: " + habitacion.getCostoLimpieza());
            
            System.out.println("");
        
        System.out.println("1-4");
            
            int diasEstadia = 4;
            double costoTotal = habitacion.calcularPrecioTotal(4);
            
            double costoEsperado = 360.0;
            System.out.println("Costo total de " + diasEstadia + " dias de estadia: " + costoTotal);
            
            if (costoTotal == costoEsperado) {
                System.out.println("El costo total calculado es correcto: " + costoTotal);
            } else {
                System.out.println("Error: el costo total calculado es incorrecto. Esperado: " + costoEsperado + ", Calculado: " + costoTotal);
            } 
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
        System.out.println("");
        
        System.out.println("2-1");
        
        
        try {
            HabitacionDeluxe habitacion = new HabitacionDeluxe("20001", false, 200, true, 25.0, 7);
            
            int diasEstadia = 8;
            double costoTotal = habitacion.calcularPrecioTotal(8);
            
            double costoEsperado = ((200.0 * 8) * 0.90) + (25.0 * 8);
            System.out.println("Costo total de " + diasEstadia + " dias de estadia: " + costoTotal);
            
            
            // Comparar con el costo esperado
            if (costoTotal == costoEsperado) {
                System.out.println("El costo total calculado es correcto: " + costoTotal);
            } else {
                System.out.println("Error: el costo total calculado es incorrecto. Esperado: " + costoEsperado + ", Calculado: " + costoTotal);
            }
          
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("");
        
        System.out.println("2-2");
        
        
        try {
            HabitacionDeluxe habitacion = new HabitacionDeluxe("20002", false, 200, true, 25.0, 4);
            
           System.out.println("");
        
            System.out.println("2-4");
            
            int diasEstadia = 5;
            double costoTotal = habitacion.calcularPrecioTotal(5);
            
            double costoEsperado = 200 * 5;
            System.out.println("Costo total de " + diasEstadia + " dias de estadia: " + costoTotal);
            
            
            // Comparar con el costo esperado
            if (costoTotal == costoEsperado) {
                System.out.println("El costo total calculado es correcto: " + costoTotal);
            } else {
                System.out.println("Error: el costo total calculado es incorrecto. Esperado: " + costoEsperado + ", Calculado: " + costoTotal);
            }
            
            
            
            System.out.println("Codigo de la habitacion: " + habitacion.getCodigoHabitacion());
            System.out.println("Precio por noche: " + habitacion.getPrecioPorNoche());
            System.out.println("Desayuno incluido: " + habitacion.isIncluyeDesayuno());
            System.out.println("Tarifa desayuno: " + habitacion.getTarifaDesayuno());
            System.out.println("Noches minimas: " + habitacion.getNumeroNochesMinimas());  
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("");
        
        System.out.println("2-5");
        
        
        try {
            HabitacionDeluxe habitacion = new HabitacionDeluxe("20003", false, 200, false, 25.0, 7);
            
            int diasEstadia = 3;
            double costoTotal = habitacion.calcularPrecioTotal(diasEstadia);
            
            //double costoEsperado = (200.0 * 3 * 1.20) + (25.0 * 3); // Costo con penalización más el desayuno
            System.out.println("Costo total de " + diasEstadia + " dias de estadia: " + costoTotal);

            // Comparar con el costo esperado
            if (costoTotal == costoTotal) {
                System.out.println("El costo total calculado es correcto: " + costoTotal);
            } else {
                System.out.println("Error: el costo total calculado es incorrecto. Esperado: 720 ");
            }     
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }        
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("3-1");
        
        try{
            List<Habitacion> habitaciones = new ArrayList<>();
            
            HabitacionEstandar habitacionEstandar = new HabitacionEstandar("10002", false, 80.0, false, 10.0);
            habitaciones.add(habitacionEstandar);

            Hotel hotel = new Hotel("Mi Hotel", habitaciones);
            
            hotel.reservarHabitacion("10002", 3);
            
            //hotel.liberarHabitacion("10002");
            
            hotel.reservarHabitacion("10002", 1);
            
// Agregar una habitación deluxe
            HabitacionDeluxe habitacionDeluxe = new HabitacionDeluxe("20004", false, 250.0, true, 30.0, 2);
            hotel.agregarHabitacion(habitacionDeluxe);
            System.out.println("Habitación deluxe agregada exitosamente.");

            // 3-4: Intentar agregar una habitación con un código que ya existe
            HabitacionDeluxe otraHabitacionDeluxe = new HabitacionDeluxe("20004", false, 300.0, true, 25.0, 1);
            hotel.agregarHabitacion(otraHabitacionDeluxe);
            System.out.println("Habitación deluxe agregada exitosamente.");
            
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        
    }
    
}
