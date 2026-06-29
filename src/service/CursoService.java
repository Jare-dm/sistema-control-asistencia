package service;

import model.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoService {

    private List<Curso> cursos = new ArrayList<>();

    public void registrarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Curso registrado correctamente");
    }

    public List<Curso> listarCursos() {
        return cursos;
    }
    
}