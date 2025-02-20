package Services;

import DB.RobotRepository;
import Model.Robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/robot")
public class RobotService {
    @Autowired
    private RobotRepository robotRepository;

    @GetMapping("/robots")
    public List<Robot> getAllRobots(){
        return robotRepository.findAll();
    }

    //bestimmten Roboter finden
    @GetMapping("/robots/{name}")
    public ResponseEntity<Robot> getRobot(@PathVariable("name") String name){
        Optional<Robot> robot = robotRepository.findByName(name);
        return robot.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    //Roboter erstellen
    @PostMapping("/robots")
    public ResponseEntity<Robot> createRobot(@RequestBody Robot newRobot){
        Optional<Robot> existingRobot = robotRepository.findByName(newRobot.getName());
        if (existingRobot.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
        }
        robotRepository.save(newRobot);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRobot);
    }
}
