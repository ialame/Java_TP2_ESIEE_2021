package Probleme2.Interface;

public class Cercle extends Point {
    protected double rayon;

    public Cercle() {
        setRayon(0);
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double r) {

        this.rayon = (r >= 0 ? r : 0.0);
    }

    public double aire() {
        return Math.PI * rayon * rayon;
    }

    @Override
    public String toString() {
        return " Centre=" + super.toString() + ", Rayon=" + rayon;
    }
    @Override
    public String getNom() {
        return "Cercle";
    }
}

