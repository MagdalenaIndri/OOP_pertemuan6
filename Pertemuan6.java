/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;
import java.util.Scanner;

/**
 *
 * @author LAB F
 */
public class Pertemuan6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.print("nilai Alas: ");
        float nAlas = dIN.nextFloat();
         
        System.out.print("Nilai Tinggi: ");
        float nTinggi = dIN.nextFloat();
        
        LuasSegi3 LS = new LuasSegi3(nAlas, nTinggi);
        
        //LS.setALAS(nAlas);
        //LS.setTINGGI(nTinggi);
        LS.HLuasSegi3();
        
        System.out.println("Nilai Alas: "+ LS.getALAS() );
        System.out.println("Nilai Tinggi: "+ LS.getTINGGI());
        System.out.println("Jadi Luas Segi Tiga: ");
        System.out.println("Luas = ½ X Alas X Tinggi ");
        System.out.println("   = ½ X"+ LS.getALAS()+" X "+LS.getTINGGI());
        System.out.println("   =" + LS.getLUAS());
        
    }


    
}
