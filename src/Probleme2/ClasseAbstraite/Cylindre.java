package Probleme2.ClasseAbstraite;

public class Cylindre extends Cercle {
    protected double hauteur;
    public Cylindre(){
        setHauteur(0);
    }
    public Cylindre(int x,int y,double r,double h){
        super(x,y,r);
        setHauteur(h);
    }
    public void setHauteur(double h){
        this.hauteur=(h>=0?h:0);
    }

    public double getHauteur() {
        return hauteur;
    }

    @Override
    public double aire() {
        return 2*super.aire()+
                2*Math.PI*rayon*hauteur;
    }
    public double volume(){
        return super.aire()*hauteur;
    }
    public String toString(){
        return super.toString()+"; Hauteur = "+hauteur;
    }
    @Override
    public String getNom() {
        return "Cylindre";
    }
}
