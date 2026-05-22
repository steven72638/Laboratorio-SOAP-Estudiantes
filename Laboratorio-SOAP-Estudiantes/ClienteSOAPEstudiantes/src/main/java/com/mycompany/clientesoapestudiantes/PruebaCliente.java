package com.mycompany.clientesoapestudiantes;

import clientesws.EstudiantesWS;
import clientesws.EstudiantesWS_Service;
import java.util.List;

public class PruebaCliente {
    public static void main(String[] args) {
        try {
            // Conectar de forma remota con el Servidor Payara SOAP
            EstudiantesWS_Service service = new EstudiantesWS_Service();
            EstudiantesWS port = service.getEstudiantesWSPort();
            
            // 1. Enviar datos remotos para guardarlos en MongoDB
            System.out.println("--- Insertando estudiante desde la App Cliente ---");
            String respuesta = port.insertarEstudiante("Carlos", "Mendoza", "0203040506");
            System.out.println("Respuesta del servidor: " + respuesta);
            
            // 2. Traer los datos remotos almacenados en MongoDB
            System.out.println("\n--- Consultando la lista desde la App Cliente ---");
            List<String> estudiantes = port.listarEstudiantes();
            for (String est : estudiantes) {
                System.out.println(est);
            }
            
        } catch (Exception e) {
            System.out.println("Error en la comunicación SOAP: " + e.getMessage());
        }
    }
}
