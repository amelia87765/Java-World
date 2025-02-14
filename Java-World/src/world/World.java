package world;

import java.util.ArrayList;
import java.util.List;

import world.Organisms.Organism;

public class World {

    private int worldX;
    private int worldY;
    private int turn = 0;
    private List<Organism> organisms;
    private char[][] fields;

    public World(int wX, int wY) {
        this.worldX = wX;
        this.worldY = wY;
        this.fields = new char[this.worldX][this.worldY];
        this.organisms = new ArrayList<>();
    }

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

    public void addOrganism(Organism o) {
        organisms.add(o);
    }

    public int getTurn() {
        return this.turn;
    }

    public void makeTurn() {
        if (organisms == null) {
            return;
        }

        SortByPower.sort(organisms);
        Action action = new Action();
        action.add(organisms);
        action.makeMove(organisms);
        action.remove(organisms);
        action.increasePower(organisms);
        this.turn++;

        for (Organism o : organisms) {
            o.setPower(o.getPower() - 1);
            o.setLifeLength(o.getLifeLength() - 1);
        }

        displayWorld();
    }

    public void displayWorld() {
        for (int i = 0; i < this.worldX; i++) {
            for (int j = 0; j < this.worldY; j++) {
                this.fields[i][j] = '.';
            }
        }

        for (Organism o : organisms) {
            this.fields[o.getPosition().getX()][o.getPosition().getY()] = o.getSign();
        }

        System.out.println("Turn: " + this.turn);
        for (int i = 0; i < this.worldX; i++) {
            for (int j = 0; j < this.worldY; j++) {
                System.out.print(this.fields[i][j]);
            }
            System.out.println();
        }
    }
}