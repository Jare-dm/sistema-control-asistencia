package controller;

import model.Curso;
import service.CursoService;

import java.util.Scanner;

public class CursoController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CursoService service = new CursoService();

        System.out.println("=== REGISTRO DE CURSOS ===");

        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Créditos: ");
        int creditos = sc.nextInt();

        Curso curso = new Curso(id, nombre, creditos);

        service.registrarCurso(curso);

        System.out.println("Curso guardado correctamente");
    }
}