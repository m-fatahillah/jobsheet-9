import java.util.Scanner;
public class modifikasiPercobaan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0,l=0,t=0;;
        double totalNilaiLulus = 0,totalNilaiTidakLulus = 0;
        double rataTdkLls = 0 ,rataLls = 0;

        System.out.print("Masukkan jumlah mahasiswa : ");
        p = sc.nextInt();

        int [] nilaiMhs = new int [p];
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
            if (nilaiMhs[i] > 70) {
                 totalNilaiLulus += nilaiMhs[i];
                l++;
            }
            if(nilaiMhs[i] < 70){
                totalNilaiTidakLulus += nilaiMhs[i];
                t++;
            }
        }
        rataLls = totalNilaiLulus/l;
        rataTdkLls = totalNilaiTidakLulus/t;
        System.out.println("rata nilai lulus = " + rataLls);
        System.out.println("rata nilai tidak lulus = " + rataTdkLls);
    }
}
