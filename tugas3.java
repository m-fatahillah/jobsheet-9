import java.util.Scanner;
public class tugas3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String pilihan;

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar","Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("silahkan pilih menu : ");
        for (int i = 0 ; i <menu.length ;i++ ){
            System.out.println((i+1) + ". "+ menu[i]);
        }

        System.out.print("Masukkan menu yang akan dicari : ");
        pilihan = sc.nextLine();

        boolean cariMenu = false;
        for (String daftarMenu : menu){
            if (daftarMenu.equalsIgnoreCase(pilihan)){
                cariMenu = true;
                break;
            }

            }
            if (cariMenu) {
                System.out.println("Menu " + pilihan + " ditemukan.");
            } else {
                System.out.println("Menu " + pilihan + " tidak ditemukan.");
            }
            
        }
    }
    

