package DB;

import Model.Moves;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovesRepository extends JpaRepository<Moves, String>{
}
