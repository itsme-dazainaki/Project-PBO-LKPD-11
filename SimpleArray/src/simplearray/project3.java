/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearray;
import java.util.ArrayList;
import static java.util.Collections.binarySearch;
import java.util.Scanner;
/**
 *
 * @author Radaza Putri
 */
public class project3 {
    ArrayList<String> data = new ArrayList<>();
    
    void adddata() {
        Scanner add = new Scanner(System.in);
        System.out.print("Masukkan data string: ");
        data.add(add.nextLine());
        System.out.println("Daftar string dalam array list:" + data);
        add.nextLine();
    }
    void searchdata() {
        Scanner search = new Scanner(System.in);
        System.out.println("String yang mau dicari: ");
        String cari = search.nextLine();
        if(binarySearch(data,cari) > -1){
            System.out.println("String " + cari + " ada di index ke " + binarySearch(data,cari) +" di dalam data");
        } else {
            System.out.println("String " + cari + " tidak ada dalam data");
        }
        
    }
    void deletedata() {
        Scanner del = new Scanner(System.in);
        System.out.println("String yang mau dihapus: ");
        String hps = del.nextLine();
        if(binarySearch(data,hps) > -1){
            data.remove(binarySearch(data,hps));
            System.out.println("String " + hps + " sudah dihapus di dalam data");
        } else {
            System.out.println("String " + hps + " tidak ada dalam data");
        }
        
    }
    
    void showdata() {
        System.out.println("Daftar string dalam array list:" + data);
    }
}
