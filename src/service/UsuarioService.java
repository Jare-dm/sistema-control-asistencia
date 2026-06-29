package service;

import model.Usuario;

public class UsuarioService {

    public boolean validarLogin(Usuario user) {

        // usuario de prueba (luego lo mejoras)
        if (user.getUsuario().equals("admin") &&
            user.getPassword().equals("1234")) {
            return true;
        }

        return false;
    }
}