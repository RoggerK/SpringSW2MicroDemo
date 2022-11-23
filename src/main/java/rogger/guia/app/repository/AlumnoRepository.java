package rogger.guia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rogger.guia.app.model.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {

}
