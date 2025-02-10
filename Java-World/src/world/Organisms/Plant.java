package world.Organisms;

import world.Position;

public abstract class Plant extends Organism {
    public Plant(Position pos) {
        this.position = pos;
        this.initiative = 0;
    }

    @Override
    public abstract Plant reproduce();
}
