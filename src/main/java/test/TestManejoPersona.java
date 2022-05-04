package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersona {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        personaDao.seleccionar();
//        List<Persona> personas = personaDao.seleccionar();
//        personas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });
        
        // insertando un nuevo objeto de tipo Persona
        Persona personaNueva = new Persona("Luciano", "Soto", "setecuerve@gmail.com", "117654176");
        personaDao.insertar(personaNueva);
        
    //modificar un objeto de persona exixtente
    
       Persona personaModificar = new Persona(4, "Franciso", "Soto", "francispan70@gmail.com", "1198787172");
        personaDao.actualizar(personaModificar);
    
        //eliminar un registro
        Persona personaEliminar = new Persona(4);
        personaDao.eliminar(personaEliminar);

        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
    }   
}
