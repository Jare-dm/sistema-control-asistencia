package controller;

import service.AsistenciaService;

import java.util.List;
import java.util.Scanner;

import model.Asistencia;

public class AsistenciaController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AsistenciaService service = new AsistenciaService();

        System.out.println("=== CONSULTAR ASISTENCIA ===");

        System.out.print("Nombre del alumno: ");
        String alumno = sc.nextLine();

        System.out.println("Buscando asistencia de: " + alumno);

        System.out.println(service.buscarPorAlumno(alumno));
        
        System.out.println("=== REGISTRAR TARDANZA ===");

        System.out.print("Alumno: ");
        String alumnoT = sc.nextLine();

        System.out.print("Fecha: ");
        String fecha = sc.nextLine();
        
        System.out.println("=== REGISTRAR FALTA ===");

        System.out.print("Alumno: ");
        String alumnoF = sc.nextLine();

        System.out.print("Fecha: ");
        String fecha1 = sc.nextLine();
        
        System.out.println("=== REGISTRAR ASISTENCIA ===");

        System.out.print("Alumno: ");
        String alumnoA = sc.nextLine();

        System.out.print("Fecha: ");
        String fecha2 = sc.nextLine();
        
        System.out.println("=== REPORTE ===");

        System.out.print("Fecha: ");
        String fecha3 = sc.nextLine();

        List<Asistencia> lista = service.filtrar(fecha1, "");

        for (Asistencia a : lista) {
            System.out.println(a);
        }
        
        System.out.println("=== BUSCAR ALUMNO ===");

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        service.buscarPorAlumno(nombre);

        service.registrarAsistencia(alumno, fecha1);

        service.registrarFalta(alumno, fecha1);

        service.registrarTardanza(alumno, fecha1);
    }
    
    
}