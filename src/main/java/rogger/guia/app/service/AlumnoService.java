package rogger.guia.app.service;

import java.util.List;

import rogger.guia.app.dto.AlumnoDTO;

public interface AlumnoService {
	List<AlumnoDTO> listar();
	AlumnoDTO obtenerId(Integer id);
	void guardar(AlumnoDTO alumno);
	void elimnar(Integer id);
	void actualizar(AlumnoDTO alumno);
}
