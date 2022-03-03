package com.example.REST.Repository;

import com.example.REST.Modelos.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiante, Integer> {

}
