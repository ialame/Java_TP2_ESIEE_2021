package Probleme1.Exercice2;

import javax.swing.*;
import java.text.DecimalFormat;

public class Test {
        public static void main(String[] str){
            Cercle cercle1,cercle2;
            cercle1=new Cercle(72,29,4.5);
            cercle2=new Cercle(5,5,10);
            cercle1=null;
            cercle2=null;
            System.gc();
        }
    }
