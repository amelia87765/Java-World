package world.Organisms;

import world.Position;

public class Sheep extends Animal {

    public Sheep(Position pos) {
        super(pos);

    }

    public void defineParameters() {
        this.power = 3;
        this.initiative = 3;
        this.lifeLength = 10;
        this.powerToReproduce = 6;
        this.sign = 'S';
    }

    @Override
    public Sheep reproduce() {
        return new Sheep(new Position(this.position.getX(), (this.position.getY() + 1) % 10));
    }
}
