package com.protfolioprueba.gpdev.Security.Repository.Service;

import com.protfolioprueba.gpdev.Security.Entity.Rol;
import com.protfolioprueba.gpdev.Security.Enums.RolNombre;
import com.protfolioprueba.gpdev.Security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional // protege la informacion antes una solicitud fallida
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
