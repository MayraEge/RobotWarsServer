package DB;

import Model.Robot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RobotRepository extends JpaRepository <Robot, String>{
    Optional<Robot> findByName(String name);
}
