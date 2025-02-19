package Model;

import Enums.Status;

import java.util.List;

public class Game {
   String id;
   String map;
   List<Players> players;
   List<Moves> moves;
   Status status;

   public Game(){
   }

   public Game(String id, String map, List<Players> players, List<Moves> moves, Status status) {
      this.id = id;
      this.map = map;
      this.players = players;
      this.moves = moves;
      this.status = status;
   }
   public String getId() {
      return id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getMap() {
      return map;
   }

   public void setMap(String map) {
      this.map = map;
   }

   public List<Players> getPlayers() {
      return players;
   }

   public void setPlayers(List<Players> players) {
      this.players = players;
   }

   public List<Moves> getMoves() {
      return moves;
   }

   public void setMoves(List<Moves> moves) {
      this.moves = moves;
   }

   public Status getStatus() {
      return status;
   }

   public void setStatus(Status status) {
      this.status = status;
   }


}
