package Probleme2.Interface;

public class Point implements Forme {
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

    public int getY() {
        return y;
    }


    @Override
    public String toString() {
        return " [" + "x=" + x + ", y=" + y + ']';
    }

    @Override
    public double aire() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String getNom() {
        return "Point";
    }
}
