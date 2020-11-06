/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3tebakangka;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class Guesting {
    
    int getRandom(int x){
        Random k = new Random();
        return k.nextInt(x+1);
    }
    
    void Run(int x){
        int key = this.getRandom(x);
        System.out.println("Halo, Saya Mr ALFA akan memberimu tebakan angka dari 0 hingga 100, Ayo Tebak !");
        Scanner input = new Scanner(System.in);
        int jawab;
        while(true){
            System.out.print("Tebak Angkanya : ");
            jawab = input.nextInt();
            
            if (jawab < key){
                System.out.println("Tebakanmu Masih Kurang, ayo tebak lagi");
            }else if (jawab > key) {
                System.out.println("Ahhh... Kelebihanm, ayo tebak lagi");
            }else{
                System.out.println("Selamat! Jawaban kamu benar :D");
                break;
            }
        }
    }
}
