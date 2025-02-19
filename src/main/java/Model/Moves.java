package Model;

import Enums.Alignment;
import Enums.Movement;

public class Moves {
    String id;
    String playerId;
    Movement movement;
    Alignment alignment;
    int MapIndex;

    public Moves() {
    }

    public Moves(String id, String playerId, Movement movement, Alignment alignment, int mapIndex) {
        this.id = id;
        this.playerId = playerId;
        this.movement = movement;
        this.alignment = alignment;
        MapIndex = mapIndex;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public Movement getMovement() {
        return movement;
    }

    public void setMovement(Movement movement) {
        this.movement = movement;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getMapIndex() {
        return MapIndex;
    }

    public void setMapIndex(int mapIndex) {
        MapIndex = mapIndex;
    }
}
