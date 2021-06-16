package Probleme3;

import javax.swing.*;
import java.text.DecimalFormat;

public class Test {
        public static void main(String[] str){
            Point point = new Point(7,11,12);
            Sphere sphere = new Sphere(22,8,10,3.5);
            Tore tore = new Tore(10,10,10,3.3,10.0);
            DecimalFormat precision2 = new DecimalFormat("0.00");
            Forme[] formes = new Forme[3];
            formes[0]=point;
            formes[1]=sphere;
            formes[2]=tore;
            String sortie ="";
            for(Forme f :formes) {
                sortie+= f.getNom() + ": " + f +"\n";
                sortie+= "Aire=" +precision2.format(f.aire())  +"\n";
                sortie+= "Volume=" +precision2.format(f.volume()) +"\n\n";
            }
            JOptionPane.showMessageDialog(null,sortie,"Polymorphisme",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
