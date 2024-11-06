import java.util.Scanner;
public class modifikasiPercobaan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = 0; 
        int key;
        int hasil = -1;
        
        System.out.print("Masukkan nilai yang akan diinnput : ");
        p = sc.nextInt();

        int [] nilai = new int[p];
        for ( int i = 0 ; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
            nilai[i] = sc.nextInt();
          
        }  
        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();
       
        for (int i=0; i < nilai.length;i++ ){
            if (key == nilai[i] ){
                hasil = i + 1;
                break;
            }
        }
        
        if (hasil != -1){
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);

        }else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
    }
}
