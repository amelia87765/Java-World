package world.Organisms;

import world.Position;

public abstract class Plant extends Organism {
    public Plant(Position position) {
        super(position);
        this.initiative = 0;
    }

    @Override
    public abstract Plant reproduce();
}
