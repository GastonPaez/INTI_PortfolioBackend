package com.protfolioprueba.gpdev.Security.Repository.Service;

import com.protfolioprueba.gpdev.Security.Entity.Usuario;
import com.protfolioprueba.gpdev.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UsuarioService {

    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public boolean existByNombreUsuario(String nombreUsuario) {
        return iusuarioRepository.existByNombreUsuario(nombreUsuario);

    }
    
    public boolean existByEmail(String email) {
        // chequea si el mail existe
        return iusuarioRepository.existByNombreUsuario(email);

    }
    
    public void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
    
    

}
