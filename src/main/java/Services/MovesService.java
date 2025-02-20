package Services;

import DB.MovesRepository;
import Model.Moves;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moves")
public class MovesService {

    @Autowired
    private MovesRepository movesRepository;

    @GetMapping
    public List<Moves> getAllMoves() {
        return movesRepository.findAll();
    }

    @PostMapping
    public Moves addMove(@RequestBody Moves move) {
        return movesRepository.save(move);
    }
}
