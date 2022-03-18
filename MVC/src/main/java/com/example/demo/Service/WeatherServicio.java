package com.example.demo.Service;

import com.example.demo.Model.Weather;
import com.example.demo.Repositorio.WeatherRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeatherServicio {


    @Autowired
    private WeatherRepositorio repositorio;

    public List<Weather>listarClimas(){
        return (List<Weather>) repositorio.findAll();
    }

    public void guardarRegistro(Weather weather){
        repositorio.save(weather);
    }

    public Weather get(Integer id){
        return (Weather) repositorio.findById(id).get();
    }

    public void eliminarRegistro(Integer id){
        repositorio.deleteById(id);
    }

}
