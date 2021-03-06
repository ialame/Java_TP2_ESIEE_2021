package Probleme1.Exercice1;

public class Point {
    protected int x,y;

    public Point() {
        setPoint(0,0);
    }
    public Point(int x, int y) {
        setPoint(x,y);
    }
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return " [" + "x=" + x + ", y=" + y + ']';
    }
}
