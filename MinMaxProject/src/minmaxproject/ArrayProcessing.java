/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;
import java.util.Scanner;
/**
 *
 * @author Radaza Putri
 */
public class ArrayProcessing {
    int [] bilangan = new int[100];
    int x;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("----------- Input -----------");
        System.out.print("Masukan Jumlah Data yang ingin diinput : ");
        this.x = input.nextInt();
            for(int i=0; i<x; i++){
                System.out.print("Masukan data bil ke - " + (i+1)+ " : ");
                this.bilangan[i] = input.nextInt();
            }
    }
    
    double cariRerata(int[] data){
        double jumlah = 0;
        for(int i=0; i<x; i++){
            jumlah += data[i];
        }
        double rata = jumlah/x;
        return rata;
    }
    
    int cariMin(int[] data){
        int minimum = data[0];
        for(int i=1;i>x;i++){
            if (minimum>data[i]){
                minimum = data[i];
            }
        }
        return minimum;
    }
   
    int cariMax(int[] data){
        int maximum = data[0];
        for(int i=1;i<x;i++){
            if (maximum<data[i]){
                maximum = data[i];
            }
        }
        return maximum;
    }
    
    void output(){
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("----------- Hasil -----------");
        System.out.println("Nilai Rata-Rata          : " + cariRerata(bilangan));
        System.out.println("Nilai Terkecil (Minimum) : " + cariMin(bilangan));
        System.out.println("Milai Terbesar (Maximum) : " + cariMax(bilangan));
    }
}
