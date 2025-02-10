package world.Organisms;

import world.Position;

public abstract class Organism {
    protected int power;
    protected int initiative;
    protected Position position;
    protected int lifeLength;
    protected int powerToReproduce;
    protected char sign;

    public void setPower(int pow) {
        this.power = pow;
    }

    public int getPower() {
        return this.power;
    }

    public void setInitiative(int init) {
        this.initiative = init;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public void setPosition(Position pos) {
        this.position = pos;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setLifeLength(int lif) {
        this.lifeLength = lif;
    }

    public int getLifeLength() {
        return this.lifeLength;
    }

    public void setPowerToReproduce(int powR) {
        this.powerToReproduce = powR;
    }

    public int getPowerToReproduce() {
        return this.powerToReproduce;
    }

    public void setSign(char sig) {
        this.sign = sig;
    }

    public char getSign() {
        return this.sign;
    }

    public boolean canReproduce() {
        return this.power >= this.powerToReproduce;
    }

    public boolean canMove() {
        return this.initiative > 0;
    }

    public abstract Organism reproduce();

    public void move(int direction) {
        switch (direction) {
            case 0 -> position.setX((position.getX() + 1) % 10);
            case 1 -> position.setX((position.getX() - 1 + 10) % 10);
            case 2 -> position.setY((position.getY() + 1) % 10);
            case 3 -> position.setY((position.getY() - 1 + 10) % 10);
            case 4 -> {
                position.setX((position.getX() - 1 + 10) % 10);
                position.setY((position.getY() - 1 + 10) % 10);
            }
            case 5 -> {
                position.setX((position.getX() + 1) % 10);
                position.setY((position.getY() + 1) % 10);
            }
        }
    }
}
