import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int n ;
       
        System.out.print("masukkan jumlah menu : ");
        n = sc.nextInt();
        
        String menu [] = new String[n];
        int harga [] = new int[n];
        int total = 0;

        for (int i = 0 ; i < n; i++) {
            System.out.print("Masukkan nama menu : ");
            menu[i] = sc2.nextLine();
            System.out.print("Masukkan harga : ");
            harga[i] = sc.nextInt(); 
        }
        for (int i = 0 ; i < n ; i++) {
            total += harga[i];
        }

        for(int i=0; i<n ; i++){
        System.out.println("menu " + (i+1) + ": " + menu[i]);
        System.out.println("harga" + (i+1) + ": " + harga[i]);
        }
        System.out.println("total harga :" + total);

    }
}
