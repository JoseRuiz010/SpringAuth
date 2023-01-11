package po.Authenticacion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import po.Authenticacion.model.Tarea;

@RestController()
@ RequestMapping("/")
public class TareaController {
	
	@GetMapping("/")
	public @ResponseBody Tarea getTareas() {
		Tarea tarea= new Tarea();
		tarea.setNombre("Tarea 1");
		tarea.setDescripcion("Descripcion tarea1");
		return tarea;
	}

}
