package EVC03Miguel.Estudiante;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "alumnos", path = "alumnos")
public interface AlumnoRepository extends PagingAndSortingRepository<Alumno, Integer>, CrudRepository<Alumno, Integer> {

    List<Alumno> findByNombre(@Param("nombre") String nombre);

}
