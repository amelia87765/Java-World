package world;

public class Position {
    int x;
    int y;

    public Position(int xP, int yP) {
        this.x = xP;
        this.y = yP;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int xP) {
        this.x = xP;
    }

    public void setY(int yP) {
        this.y = yP;
    }
}
