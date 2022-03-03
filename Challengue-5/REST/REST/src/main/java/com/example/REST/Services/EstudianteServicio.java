package com.example.REST.Services;

import com.example.REST.Modelos.Estudiante;
import com.example.REST.Repository.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteServicio {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    public List<Estudiante>listarestudiantes(){
        return  estudianteRepositorio.findAll();
    }

    public void guardarestudiante(Estudiante estudiante){
        estudianteRepositorio.save(estudiante);
    }

    public Estudiante obtenerestudianteporid(Integer id){
        return estudianteRepositorio.findById(id).get();
    }

    public void eliminarestudiante(Integer id){
        estudianteRepositorio.deleteById(id);
    }


}
