package rogger.guia.app.service;

import java.util.List;

import rogger.guia.app.model.Alumno;

public interface AlumnoService {
	List<Alumno> listar();
	Alumno obtenerId(Integer id);
	void guardar(Alumno alumno);
	void elimnar(Integer id);
	void actualizar(Alumno alumno);
}
