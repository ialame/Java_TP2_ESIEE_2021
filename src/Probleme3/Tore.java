package Probleme3;

public class Tore extends Sphere {
    protected double Grayon;
    public Tore(){
        setHauteur(0);
    }
    public Tore(int x, int y,int z, double r, double h){
        super(x,y,z,r);
        setHauteur(h);
    }
    public void setHauteur(double h){
        this.Grayon=(h>=0?h:0);
    }

    public double getHauteur() {
        return Grayon;
    }

    @Override
    public double aire() {
        return 4*Math.PI*Math.PI*rayon*Grayon;
    }
    public double volume(){
        return aire()*Grayon;
    }
    public String toString(){
        return super.toString()+"; GrandRayon = "+Grayon;
    }
    @Override
    public String getNom() {
        return "Tore";
    }
}
