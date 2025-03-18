package world.Organisms;

import world.Position;

public abstract class Organism {
    protected int power;
    protected int initiative;
    protected Position position;
    protected int lifeLength;
    protected int powerToReproduce;
    protected char sign;

    public Organism(Position position) {
        this.position = position;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getInitiative() {
        return this.initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getLifeLength() {
        return this.lifeLength;
    }

    public void setLifeLength(int lifeLength) {
        this.lifeLength = lifeLength;
    }

    public int getPowerToReproduce() {
        return this.powerToReproduce;
    }

    public void setPowerToReproduce(int powerToReproduce) {
        this.powerToReproduce = powerToReproduce;
    }

    public char getSign() {
        return this.sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
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
