package rogger.guia.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.model.Alumno;
import rogger.guia.app.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<Alumno> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Alumno obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Alumno alumno) {
		// TODO Auto-generated method stub
		repository.save(alumno);
	}

	@Override
	public void elimnar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Alumno alumno) {
		// TODO Auto-generated method stub
		repository.saveAndFlush(alumno);
	}

}
