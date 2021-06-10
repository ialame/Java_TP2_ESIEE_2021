package Probleme1;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestHeritage {
        public static void main(String[] str){
            Point pointRef, p;
            Cercle cercleRef,c;
            String sortie;
            p=new Point(30,50);
            c=new Cercle(120,89,2.7);
            sortie = "Point p: "+ p+"\nCercle c: "+c;
            pointRef =c;
            sortie += "\n\nCercle c (via pointRef): "+pointRef;
            cercleRef = (Cercle) pointRef;
            sortie += "\n\nCercle c (via cercleRef): "+cercleRef;
            DecimalFormat precision2 = new DecimalFormat("0.00");
            sortie += "\n\nAire de c (via cercleRef): " + precision2.format(cercleRef.aire());
            if (p instanceof Cercle){
                cercleRef = (Cercle) p;
                sortie += "\n\nremplacement de type réussi";
            }else
                sortie += "\n\np ne référence pas un cercle";
            JOptionPane.showMessageDialog(null,sortie,"Démontre la relation \" est un \"",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
