/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3tebakangkaskor;
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
        Scanner input = new Scanner(System.in);
        int jawab, skor, trying;
        skor = 100;
        trying = 1;
        System.out.println("Halo, Saya Mr ALFA akan memberimu tebakan angka dari 0 hingga 100, Ayo Tebak !");
        System.out.println("Kunci Jawaban : "+key);
        while(true){
            System.out.print("Tebak Angkanya : ");
            jawab = input.nextInt();
            
            if(skor <= 0){
                System.out.println("--[GAME OVER]--");
            }
            
            if (jawab < key){
                skor -= 2;
                System.out.println("Tebakanmu Masih Kurang, ayo tebak lagi. Skor kamu : "+skor);
            }else if (jawab > key) {
                skor -= 2;
                System.out.println("Ahhh... Kelebihanm, ayo tebak lagi. Skor kamu : "+skor);
            }else{
                System.out.println("Selamat! Jawaban kamu benar :D");
                
                if(trying <= 5){
                    System.out.println("Kamu Mendapat Bonus +50 karena menyelesaikan kurang dari 5x ^_^");
                    skor += 50;
                }
                System.out.println("Skor Akhir kamu : "+skor);
                break;
            }
            trying += 1;
        }
    }
}
