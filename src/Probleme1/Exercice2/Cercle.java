package Probleme1.Exercice2;

public class Cercle extends Point {
    protected double rayon;

    public Cercle() {
        setRayon(0);
        System.out.println("Constructeur de Cercle "+ this);
    }

    public Cercle(double rayon) {
        this.rayon = rayon;
        System.out.println("Constructeur de Cercle "+ this);
    }

    public Cercle(int x, int y, double rayon) {
        super(x, y);
        this.rayon = rayon;
        System.out.println("Constructeur de Cercle "+ this);
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

    // Finaliseur
    protected  void finalize(){
        System.out.println("Finaliseur de Cercle "+ this);
        super.finalize();// appelle le finaliseur de la superclasse
    }
    @Override
    public String toString() {
        return " Centre=" + super.toString() + ", Rayon=" + rayon;
    }
}

