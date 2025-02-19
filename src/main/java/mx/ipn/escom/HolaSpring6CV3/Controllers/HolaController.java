package mx.ipn.escom.HolaSpring6CV3.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaController {

    @GetMapping("/")
    public String mostrarPagina() {
        return "index"; // No necesita extensión ".html"
    }
}
