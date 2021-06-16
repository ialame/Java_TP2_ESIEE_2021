package Probleme1.Exercice3;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestCercle {
        public static void main(String[] str){
            Cercle c = new Cercle(37,43,2.5);
            DecimalFormat precision2 = new DecimalFormat("0.00");
            String sortie = "L'abscisse vaut " + c.getX()+
                            "\nL'ordonnée vaut " +c.getY()+
                            "\nLe rayon vaut " +c.getRayon();
            c.setRayon(4.25);
            c.setPoint(2,2);
            sortie += "\n\nLa nouvelle position et le rayon de c valent : "+ c
                       +"\nL'aire vaut : "+precision2.format(c.aire());
            JOptionPane.showMessageDialog(null,sortie,"Démontre la classe Cercle",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
