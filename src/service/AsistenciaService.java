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

    public List<Asistencia> consultarPorAlumno(String alumno) {

    List<Asistencia> resultado = new ArrayList<>();

    for (Asistencia a : asistencias) {
        if (a.getAlumno().equalsIgnoreCase(alumno)) {
            resultado.add(a);
        }
    }

    return resultado;
}
}