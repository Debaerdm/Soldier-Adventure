package model;

public abstract class Tile {

    private TileType tileType;
    private String imagePath;
    private int row;
    private int col;

    protected Tile(TileType tileType, int row, int col) {
        this.tileType = tileType;
        this.row = row;
        this.col = col;
    }

    public TileType getTileType() {
        return tileType;
    }

    public void setTileType(TileType tileType) {
        this.tileType = tileType;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public String toString() {
        return "Tile{" +
                "tileType=" + tileType +
                ", imagePath='" + imagePath + '\'' +
                ", row=" + row +
                ", col=" + col +
                '}';
    }
}
