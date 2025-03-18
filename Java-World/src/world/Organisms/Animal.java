package world.Organisms;

import world.Position;

public abstract class Animal extends Organism {
    private Position lastPosition;

    public Animal(Position position) {
        super(position);
    }

    public void setLastPosition(Position lastPosition) {
        this.lastPosition = lastPosition;
    }

    public Position getLastPosition() {
        return this.lastPosition;
    }

    @Override
    public abstract Animal reproduce();
}
