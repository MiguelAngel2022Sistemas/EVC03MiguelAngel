package EVC03Miguel.Estudiante;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nombre;

    /* Agregamos el alumno */
    @OneToMany(targetEntity = Alumno.class, mappedBy = "alumno")
    @OrderBy("nombre ASC")
    private Set<Alumno> alumno = new HashSet<Alumno>();

    public Set<Alumno> getAlumno() {
        return alumno;
    }

    public void setAlumno(Set<Alumno> alumno) {
        this.alumno = alumno;
    }
    /* Terminamos Agregamos el alumno */

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
