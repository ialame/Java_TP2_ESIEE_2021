package Probleme3;

public class Point extends Forme {
    protected int x,y,z;
    public Point() {
        setPoint(0,0,0);
    }
    public Point(int x, int y,int z) {
        setPoint(x,y,z);
    }
    public void setPoint(int x, int y,int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    @Override
    public String toString() {
        return " [" + "x=" + x + ", y=" + ", z=" + z + ']';
    }

    @Override
    public String getNom() {
        return "Point";
    }
}
