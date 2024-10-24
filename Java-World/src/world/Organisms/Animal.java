package world.Organisms;

import world.Position;

public class Animal extends Organism {

    Position lastPosition;

    public Animal(Position pos) {
        this.position = pos;
    }

    public void setLastPosition(Position lastP) {
        this.lastPosition = lastP;
    }

    public Position getLastPosition() {
        return this.lastPosition;
    }
}
