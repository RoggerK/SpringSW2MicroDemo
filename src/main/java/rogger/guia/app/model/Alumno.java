package rogger.guia.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlumno;
	private String nombre;
	private Integer apellido;
	
	public Integer getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getApellido() {
		return apellido;
	}
	public void setApellido(Integer apellido) {
		this.apellido = apellido;
	}
}
