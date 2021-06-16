package Probleme3;

public class Sphere extends Point {
    protected double rayon;

    public Sphere() {
        setRayon(0);
    }

    public Sphere(double rayon) {
        this.rayon = rayon;
    }

    public Sphere(int x, int y,int z, double rayon) {
        super(x, y, z);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double r) {

        this.rayon = (r >= 0 ? r : 0.0);
    }

    public double aire() {
        return 4 * Math.PI * rayon * rayon;
    }
    public double volume() {
        return 4 * Math.PI * rayon * rayon * rayon /3;
    }
    @Override
    public String toString() {
        return " Centre=" + super.toString() + ", Rayon=" + rayon;
    }
    @Override
    public String getNom() {
        return "Sphere";
    }
}

