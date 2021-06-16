package Probleme1.Exercice3;

import javax.swing.*;
import java.text.DecimalFormat;

public class TestPoint {
        public static void main(String[] str){
            Point p = new Point(72,115);
            String sortie = "L'abscisse vaut " + p.getX()+
                            "\nL'ordonnée vaut " +p.getY();
            p.setPoint(10,10);
            sortie += "\n\nLa nouvelle position de p : "+ p;
            JOptionPane.showMessageDialog(null,sortie,"Démontre la classe Point",
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
