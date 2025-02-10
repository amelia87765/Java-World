package world.Organisms;

import world.Position;

public abstract class Animal extends Organism {
    private Position lastPosition;

    public Animal(Position pos) {
        this.position = pos;
        this.lastPosition = pos;
    }

    public void setLastPosition(Position lastP) {
        this.lastPosition = lastP;
    }

    public Position getLastPosition() {
        return this.lastPosition;
    }

    @Override
    public abstract Animal reproduce();
}
