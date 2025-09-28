package joc;

import javax.swing.*;
import java.util.InputMismatchException;

public class Jugades {
    public static boolean jugaNumero(int result){
        int num = -1;
        int aux = 0;
        java.util.Scanner n = new java.util.Scanner(System.in);
        do {
            if (aux > 0) {
                System.out.println("Introdueix un numero VALID (0-36)");
            }
            System.out.println("A quin número apostes:");
            try{
                num = n.nextInt();
            }catch (InputMismatchException e){
                JOptionPane.showMessageDialog(null, "Error: Introdueix un numero valid (0-36)");
            }

            aux++;
        } while (num > 36 || num < 0);

        return num == result;
    }

    public static boolean jugaColor(Color colorEscollit, Color colorResult){
        return colorEscollit == colorResult;
    }

    public static boolean jugaParell(int numEscollit, int result){
        return false;
    }


}
