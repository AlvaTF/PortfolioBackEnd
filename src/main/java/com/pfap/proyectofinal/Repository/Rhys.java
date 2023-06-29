package com.pfap.proyectofinal.Repository;

import java.util.Optional;
import com.pfap.proyectofinal.Entity.hys;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
