/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hex2bin;

import  java.util.Scanner;

public class Hex2Bin {


    private final String[] hexBits = {
        "0000", "0001", "0010", "0011",
        "0100", "0101", "0110", "0111",
        "1000", "1001", "1010", "1011",
        "1100", "1101", "1110", "1111"
    };

    public static void main(String[] args) {
         Scanner escriba = new Scanner(System.in);
        System.out.print("Ingrese el Hexadecimal a convertir: ");
        String hexa = escriba.next();
        
        Hex2Bin Hex2Bin2 = new Hex2Bin();
        if ( ! Hex2Bin2.isHex(hexa)) {
            System.out.printf("ERROR, Hexadecimal invalido \"%1$s\"\n", hexa);
            return;
        }
        Hex2Bin2.convertHexToBin(hexa);
    }
    
    private boolean isHex(String hexa)
    {
        for (int i = 0; i < hexa.length(); i++) {
            if (0 > Character.digit(hexa.toLowerCase().charAt(i), 16)) {
                return false;
            }
        }
        return true;
    }
    

    private void convertHexToBin(String hexa)
    {
        
        System.out.printf("El numero en hexadecimal %1$s es ", hexa);
        
        for (int i = 0; i < hexa.length(); i++) {
            int j = Character.digit(hexa.toLowerCase().charAt(i), 16);
            System.out.printf("%1$s ", hexBits[j]);
        }
        System.out.println();
    }
}
