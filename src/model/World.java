package model;

import utils.ClassUtils;
import utils.Constants;

public class World {

    private String name;
    private Tile[][] tiles;

    public World(String name) {
        this.name = name;
        this.tiles = new Tile[Constants.WORLD_X][Constants.WORLD_Y];

        for (Tile[] tile : this.tiles) {
            for (Tile aTile : tile) {
                aTile.setTileType(ClassUtils.getInstance().randomEnum(TileType.class));
            }
        }
    }
}
