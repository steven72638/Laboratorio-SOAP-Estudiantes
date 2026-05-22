package com.mycompany.clientesoapestudiantes;

import clientesws.EstudiantesWS;
import clientesws.EstudiantesWS_Service;
import java.util.List;

public class PruebaCliente {
    public static void main(String[] args) {
        try {
            EstudiantesWS_Service service = new EstudiantesWS_Service();
            EstudiantesWS port = service.getEstudiantesWSPort();
            
            String respuesta = port.insertarEstudiante("Rodrigo", "Pezantes", "0145678374");
            System.out.println(respuesta);
            
            List<String> estudiantes = port.listarEstudiantes();
            for (String est : estudiantes) {
                System.out.println(est);
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}