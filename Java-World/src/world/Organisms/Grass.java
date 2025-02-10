package world.Organisms;

import world.Position;

public class Grass extends Plant {
    public Grass(Position pos) {
        super(pos);
    }

    public void defineParameters() {
        this.power = 0;
        this.initiative = 0;
        this.lifeLength = 6;
        this.powerToReproduce = 3;
        this.sign = 'G';
    }

    @Override
    public Grass reproduce() {
        return new Grass(new Position(this.position.getX(), (this.position.getY() + 1) % 10));
    }
}
