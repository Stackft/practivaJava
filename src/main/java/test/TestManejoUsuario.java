package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class TestManejoUsuario {
    public static void main(String[] args) {
        UsuarioJDBC usuarioJdbc = new UsuarioJDBC();
        
        //Ejecutando listado de usuarios
        List<Usuario> usuarios = usuarioJdbc.seleccionar();
        usuarios.forEach(usuario ->{
        System.out.println("usuarios = " + usuario);
        });
        
        //Insertamos un nuevo usuario
        Usuario usuario = new Usuario("mauricio.soto", "987");
        usuarioJdbc.insertar(usuario);
        
        //Modificamos usuario existente
        //Usuario usuario = new Usuario(3,"mauricio.soto","456");
        usuarioJdbc.actualizar(usuario);

        //Eliminamos usuario existente
        //Usuario usuario = new Usuario(3);
        usuarioJdbc.eliminar(usuario);
        
    }
}
