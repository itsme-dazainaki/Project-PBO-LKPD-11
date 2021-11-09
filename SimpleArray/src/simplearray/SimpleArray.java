/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearray;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Radaza Putri
 */
public class SimpleArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        project3 a = new project3();
        
        while(true){
            int inp;
            System.out.println("Menu Data ArrayList : ");
            System.out.println("1.Tambah data");
            System.out.println("2.Cari Data");
            System.out.println("3.Hapus Data");
            System.out.println("4.Tampil Data");
            System.out.println("5.Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.print("Pilih nomor berapa : ");
            inp = input.nextInt();

            switch (inp) {
                case 1:
                    a.adddata();
                    break;
                case 2:
                    a.searchdata();
                    break;
                case 3:
                    a.deletedata();
                    break;
                case 4:
                    a.showdata();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }    
}
