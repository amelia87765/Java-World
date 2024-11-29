package world;

import java.util.List;

import world.Organisms.Organism;

public class World {

    int worldX;
    int worldY;
    int turn = 0;
    List<Organism> organisms;

    public World(int wX, int wY) {
        this.worldX = wX;
        this.worldY = wY;
    }

    char[][] fields = new char[this.worldX][this.worldY];

    public void setWorldX(int x) {
        this.worldX = x;
    }

    public int getWorldX() {
        return this.worldX;
    }

    public void setWorldY(int y) {
        this.worldY = y;
    }

    public int getWorldY() {
        return this.worldY;
    }

    public int getTurn() {
        return this.turn;
    }

    public void makeTurn() {

    }
}
