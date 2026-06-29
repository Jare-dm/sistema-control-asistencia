package controller;

import service.AsistenciaService;

import java.util.List;
import java.util.Scanner;

public class AsistenciaController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AsistenciaService service = new AsistenciaService();

        System.out.println("=== CONSULTAR ASISTENCIA ===");

        System.out.print("Nombre del alumno: ");
        String alumno = sc.nextLine();

        System.out.println("Buscando asistencia de: " + alumno);

        System.out.println(service.buscarPorAlumno(alumno));
    }

    System.out.println("CONSULTA DE ASISTENCIA");

    System.out.print("Alumno: ");
    String alumno = sc.nextLine();

    List<Asistencia> lista = service.consultarPorAlumno(alumno);

    for (Asistencia a : lista) {
        System.out.println(a);
    }       
}