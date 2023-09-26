package Jobsheet5;

import java.util.Scanner;

public class PemilihanPercobaan203_2 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.print("Nilai UAS   : ");
        float uas = input03.nextFloat();
        System.out.print("Nilai UTS   : ");
        float uts = input03.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input03.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input03.nextFloat();
        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        
        String nilaiHuruf;
        if(total > 80){
            nilaiHuruf = "A";
        }else if(total > 70){
            nilaiHuruf = "B+";
        }else if(total > 65){
            nilaiHuruf = "B";
        }else if(total > 60){
            nilaiHuruf = "C+";
        }else if(total > 50){
            nilaiHuruf = "C";
        }else if(total > 39){
            nilaiHuruf = "D";
        }else{
            nilaiHuruf = "E";
        }
        
        String message = total < 65 ? "Remidi" : "Tidak Remidi";
        System.out.println("Nilai akhir = " + total + ", Nilai huruf: " + nilaiHuruf + " sehingga " + message);
    }
}
