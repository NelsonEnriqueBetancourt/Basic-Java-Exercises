package com.example.REST.Repository;

import com.example.REST.Modelos.Estudiante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstudiantesRepositorio extends baseRepositorio<Estudiante, Integer> {

    List<Estudiante> findByNombre(String nombre);
    @Query(value = "SELECT e FROM Estudiante e WHERE e.Nombre LIKE %:filtro%")//forma para llamar los parametros; le indicamos que solo tenemos 1 parametro
    List<Estudiante>Buscar(@Param("filtro")String filtro);
}
