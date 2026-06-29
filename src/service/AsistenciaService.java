package service;

import model.Asistencia;
import java.util.ArrayList;
import java.util.List;

public class AsistenciaService {

    private List<Asistencia> asistencias = new ArrayList<>();

    public List<Asistencia> obtenerAsistencias() {
        return asistencias;
    }

    public List<Asistencia> buscarPorAlumno(String alumno) {

        List<Asistencia> resultado = new ArrayList<>();

        for (Asistencia a : asistencias) {
            if (a.getAlumno().equalsIgnoreCase(alumno)) {
                resultado.add(a);
            }
        }

        return resultado;
    }
    
    public void registrarTardanza(String alumno, String fecha) {

        for (Asistencia a : asistencias) {
            if (a.getAlumno().equalsIgnoreCase(alumno)) {
                a.setEstado("TARDANZA");
                a.setFecha(fecha);
                System.out.println("Tardanza registrada correctamente");
                return;
            }
        }

        System.out.println("Alumno no encontrado");
    }
    
}