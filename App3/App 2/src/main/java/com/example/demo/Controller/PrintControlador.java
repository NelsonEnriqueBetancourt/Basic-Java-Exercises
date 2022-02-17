import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.persistence.Entity;
import java.util.List;

@Controller
public class PrintControlador {

    @Autowired
    public PrinterService service;

    @RequestMapping("/")
    public String VerPaginaInicio(Model modelo){
        List<Printer> listaimpresora= service.listAll();
        modelo.addAttribute("listaimpresora", listaimpresora);

        return "index";
    }
    @RequestMapping("/agregar")
    public String agregarimpresora(Model modelo){
        Printer printer= new Printer();
        modelo.addAttribute("printer", printer);

        return "agregar";
    }

    //GUARDAMOS EL NUEVO REGISTRO DE LA IMPRESORA
    @RequestMapping(value = "/registrar",method = RequestMethod.POST)
    public String registrarimpresora(@ModelAttribute("printer") Printer printer){
        service.save(printer);

        return "redirect:/";
    }



    @RequestMapping("/nuevo")
    public String imprimir_b_n(Model modelo){
        Printer printer= new Printer();
        modelo.addAttribute("listaimpresora");

        return "nuevo";
    }

    @RequestMapping("/color")
    public String imprimir_c_l(Model modelo){
        Printer printer= new Printer();
        modelo.addAttribute("listaimpresora");

        return "color";
    }

    @RequestMapping("/color y b_n")
    public String imprimir_c_l_y_b_n(Model modelo){
        Printer printer= new Printer();
        modelo.addAttribute("listaimpresora");

        return "color y b_n";
    }

    @RequestMapping("/text")
    public String imprimirtext(Model modelo){
        Printer printer= new Printer();
        modelo.addAttribute("listaimpresora");

        return "text";
    }


}
