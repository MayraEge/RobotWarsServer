package Model;

public class Players {
    String playerId;
    String robotId;

    public Players() {
    }

    public Players(String playerId, String robotId) {
        this.playerId = playerId;
        this.robotId = robotId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }
}
