package com.example.demo.Controller;

import com.example.demo.Model.Weather;
import com.example.demo.Service.WeatherServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class WeatherControlador {

    @Autowired
    private WeatherServicio servicio;

    @RequestMapping("/")
    public String inicio(Model modelo){
        Weather weather = new Weather();
        List<Weather>listarClimas=servicio.listarClimas();
        modelo.addAttribute("listaClima",listarClimas);

        return "index";
    }

    @RequestMapping("/Nuevo")
    public String RegistrarClima(Model modelo){
        Weather weather= new Weather();
        modelo.addAttribute("Weather",weather);
        return "nuevo_registro";

    }

    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String guardarClima(@ModelAttribute("Weather")Weather weather){
        servicio.guardarRegistro(weather);
        return "redirect:/";

    }

    @RequestMapping("/Edit/{id}")
    public ModelAndView MostrarformularioeditardeWeather(@PathVariable(name = "id") Integer id){
        ModelAndView modelo = new ModelAndView("Edit_Weather");

        Weather weather = servicio.get(id);
        modelo.addObject("Weather",weather);
        return modelo;

    }

    @RequestMapping("/Eliminar/{id}")
    public String Eliminarestudiante(@PathVariable(name = "id")Integer id){
        servicio.eliminarRegistro(id);
        return "redirect:/";
    }


}
