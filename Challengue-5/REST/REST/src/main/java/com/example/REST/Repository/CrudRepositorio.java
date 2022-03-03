package com.example.REST.Repository;


import java.util.Optional;

public interface CrudRepositorio <Estudiante, Integer> extends baseRepositorio<Estudiante,Integer>{

    Optional<Estudiante>findById(Integer id);
    Optional<Estudiante>findByNombre(String nombre);


}
