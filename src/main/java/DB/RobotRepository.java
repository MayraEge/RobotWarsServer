package DB;

import Model.Robot;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RobotRepository extends JpaRepository <Robot, String>{
    Optional<Robot> findByName(String name);
}
