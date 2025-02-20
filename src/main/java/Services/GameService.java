package Services;

import DB.GameRepository;
import Enums.Status;
import Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/games")
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @GetMapping("/games")
    public List<Game> getGameList() {
        return gameRepository.findAll();
    }

    @PostMapping("/games")
    public Game addGame(@RequestBody Game game) {
        return gameRepository.save(game);
    }

    List<Game> gameList = new ArrayList<Game>();

    public GameService() {
        gameList.add(new Game("1", "1", new ArrayList<Players>(), new ArrayList<Moves>(), Status.STARTED));
    }
}
