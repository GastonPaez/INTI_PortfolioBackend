package com.protfolioprueba.gpdev.Interface;

import com.protfolioprueba.gpdev.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    // Traer Lista de Personas
    public List<Persona> getPersona();
    
    // Guardar Objeto tipo persona
    public void savePersona(Persona persona);
    
    // Eliminar un Objeto persona. Buscandolo por Id
    public void deletePersona(Long id);
    
    // Buscar una persona por Id
    public Persona findPersona(Long id);
    
}
