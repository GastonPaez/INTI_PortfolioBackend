
package com.protfolioprueba.gpdev.Security.Repository;

import com.protfolioprueba.gpdev.Security.Entity.Rol;
import com.protfolioprueba.gpdev.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
    
}
