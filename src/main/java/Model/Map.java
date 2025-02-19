package Model;

import Enums.MapItems;
import java.util.List;

public class Map {
    String id;
    int mapSizeX;
    int mapSize;
    List<MapItems> MapItems;

    public Map() {
    }

    public Map(String id, int mapSizeX, int mapSize, List<Enums.MapItems> mapItems) {
        this.id = id;
        this.mapSizeX = mapSizeX;
        this.mapSize = mapSize;
        MapItems = mapItems;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMapSizeX() {
        return mapSizeX;
    }

    public void setMapSizeX(int mapSizeX) {
        this.mapSizeX = mapSizeX;
    }

    public int getMapSize() {
        return mapSize;
    }

    public void setMapSize(int mapSize) {
        this.mapSize = mapSize;
    }

    public List<Enums.MapItems> getMapItems() {
        return MapItems;
    }

    public void setMapItems(List<Enums.MapItems> mapItems) {
        MapItems = mapItems;
    }
}
