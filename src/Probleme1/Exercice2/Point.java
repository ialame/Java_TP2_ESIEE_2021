package Probleme1.Exercice2;

public class Point {
    protected int x,y;

    public Point() {
        setPoint(0,0);
        System.out.println("Constructeur de Point "+ this);
    }
    public Point(int x, int y) {
        setPoint(x,y);
    }
    public void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Constructeur de Point "+ this);
    }
    // Finaliseur
    protected  void finalize(){
        System.out.println("Finaliseur de Point "+ this);
    }
    @Override
    public String toString() {
        return " [" + "x=" + x + ", y=" + y + ']';
    }
}
