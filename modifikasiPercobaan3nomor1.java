import java.util.Scanner;
public class modifikasiPercobaan3nomor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l=0,p;
        double total = 0;
        double rata2;

        System.out.print("Masukkan jumlah mahasiswa : ");
        p = sc.nextInt();
        int [] nilaiMhs = new int [p];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70){
                l++;
            }
        }
        
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Total mahasiswa yang lulus adalah : " + l);
    }
    
}
