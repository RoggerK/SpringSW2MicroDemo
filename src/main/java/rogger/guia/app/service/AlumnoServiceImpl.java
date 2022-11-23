package rogger.guia.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rogger.guia.app.dto.AlumnoDTO;
import rogger.guia.app.model.Alumno;
import rogger.guia.app.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	@Autowired
	private AlumnoRepository repository;

	@Override
	public List<AlumnoDTO> listar() {
		// TODO Auto-generated method stub
		List<AlumnoDTO> listadto = new ArrayList<>();
        AlumnoDTO dto = null;
                
        for (Alumno alumno : repository.findAll()) {
            dto = new AlumnoDTO();
            dto.setApe(alumno.getApellido());
            dto.setNom(alumno.getNombre());
            dto.setCod(alumno.getIdAlumno());
            listadto.add(dto);
        }
        
//        repository.findAll().stream()
//        	.map(a -> new )
        
        return listadto;
	}

	@Override
	public AlumnoDTO obtenerId(Integer id) {
		// TODO Auto-generated method stub
		Alumno alumno = repository.findById(id).orElse(null);
		AlumnoDTO dto = new AlumnoDTO();
		dto.setApe(alumno.getApellido());
        dto.setNom(alumno.getNombre());
        dto.setCod(alumno.getIdAlumno());
		return dto;
	}

	@Override
	public void guardar(AlumnoDTO alumno) {
		// TODO Auto-generated method stub
		Alumno alu = new Alumno();
		alu.setApellido(alumno.getApe());
		alu.setNombre(alumno.getNom());
		alu.setIdAlumno(alumno.getCod());
		repository.save(alu);
	}

	@Override
	public void elimnar(Integer id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void actualizar(AlumnoDTO alumno) {
		// TODO Auto-generated method stub
		Alumno alu = new Alumno();
		alu.setApellido(alumno.getApe());
		alu.setNombre(alumno.getNom());
		alu.setIdAlumno(alumno.getCod());
		repository.saveAndFlush(alu);
	}

}
