package com.example.demo.Repositorio;

import com.example.demo.Model.Weather;
import org.springframework.data.repository.CrudRepository;

public interface WeatherRepositorio extends CrudRepository<Weather,Integer> {


}
