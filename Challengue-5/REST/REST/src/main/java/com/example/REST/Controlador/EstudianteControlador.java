package com.example.REST.Controlador;

import com.example.REST.Modelos.Estudiante;
import com.example.REST.Services.EstudianteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteControlador {

    @Autowired
    private EstudianteServicio estudianteServicio;

    @GetMapping("/estudiante")
    public List<Estudiante>listarestudiantes(){
        return estudianteServicio.listarestudiantes();
    }

    @GetMapping("/estudiantes/{id}")
    public Estudiante obtenerestudiantes(@PathVariable Integer id){
        return estudianteServicio.obtenerestudianteporid(id);

    }

    @PostMapping("/estudiantes")
    public void guardarestudiantes(@RequestBody Estudiante estudiante){
        estudianteServicio.guardarestudiante(estudiante);

    }

    @PutMapping("/estudiantes/{id}")
    public ResponseEntity<?>actualizarestudiante(@RequestBody Estudiante estudiante, @PathVariable Integer id){
        try{
            Estudiante estudianteExistente = estudianteServicio.obtenerestudianteporid(id);
            estudianteServicio.guardarestudiante(estudiante);
            return new ResponseEntity<Estudiante>(HttpStatus.OK);
        }catch (Exception exception){
            return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/estudiantes/{id}")
    public void EliminarEstudiante(@PathVariable Integer id){
        estudianteServicio.eliminarestudiante(id);
    }


}
