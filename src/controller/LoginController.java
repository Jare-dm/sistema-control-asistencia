package controller;

import model.Usuario;
import service.UsuarioService;

import java.util.Scanner;

public class LoginController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== LOGIN ===");

        System.out.print("Usuario: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        Usuario usuario = new Usuario(user, pass);
        UsuarioService service = new UsuarioService();

        if (service.validarLogin(usuario)) {
            System.out.println("Login correcto. Bienvenido.");
        } else {
            System.out.println("Usuario o contraseña incorrectos.");
        }
        
        System.out.println("=== RECUPERAR CONTRASEÑA ===");

        System.out.print("Usuario: ");
        String user = sc.nextLine();

        System.out.println("Contraseña: " + service.recuperarContrasena(user));
    }
}