package rogger.guia.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/alumno/v1")
public class AlumnoController {
	@Autowired
	private AlumnoService service;
	
	
	@GetMapping("/hola")
	public @ResponseBody String hola() {
		return "hola como estas";
	}
	
	@GetMapping("/listar")
	public @ResponseBody List<Alumno> listar() {
		return service.listar();
	}
}
