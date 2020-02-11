package mesincoffe;
import java.util.Scanner;
import java.util.ArrayList;

public class Mesincoffe {

    public static void main(String[] args) {
        Mesincoffe ben = new Mesincoffe();
        ben.Lanjut();
    }
        public void Menu(){
         
         System.out.println("Kedai Kopi Saya Suka");
         System.out.println("Jenis Kopi\t\t Asal");
         System.out.println("1.Arabica\t\t Timur Tengah");
         System.out.println("2.Robusta\t\t Eropa");
         System.out.println("3.Flores\t\t Asia");
         System.out.println("Masukkan Pilihan : ");
         Lanjut();
         
       }
    public void Lanjut(){
        Scanner ya = new Scanner(System.in);
         System.out.println("Selamat Datang di Kedai Kopi Saya Suka");
         System.out.println("1. Menu Utama");
         System.out.println("2. Pesan Kopi");
         System.out.println("3. Exit");
         System.out.println("Pilihan Anda : ");
         String memilih=ya.next();
         switch(memilih){
             case "1" :
                 Menu();
                 break;
             case "2" :
                 inti();
                 break;
             case "3":
                 System.exit(0);
                 break;
             default :
                 Lanjut();
         }
    }
    public void inti(){
        ArrayList<coffe> kopi = new ArrayList<>();
        coffe arabica = new coffe();
        coffe robusta = new coffe();
        coffe flores = new coffe();
        Scanner key = new Scanner(System.in);
        
                arabica.setNamaKopi("Arabica");
                arabica.setAsalKopi("Timur Tengah");
                kopi.add(arabica);
      
                robusta.setNamaKopi("Robusta");
                robusta.setAsalKopi("Eropa");
                kopi.add(robusta);
         
                flores.setNamaKopi("Flores");
                flores.setAsalKopi("Asia");
                kopi.add(flores);
                
                System.out.println("Menu Coffe : ");
                for(int i=0; i<kopi.size(); i++){
                    int j = 1+i;
                    System.out.println(+ j + " " + kopi.get(i).getNamaKopi());
                }
                try{
                    kopi.size();
                    System.out.println("Masukkan Pilihan Anda : ");
                    int pilihcoffe = key.nextInt() - 1;
                    System.out.println("Pesanan Coffe Anda " +kopi.get(pilihcoffe).getNamaKopi() + "Asal Coffe dari " + kopi.get(pilihcoffe).getAsalKopi());
                    Lanjut();
                }catch(Exception e){
                    System.out.println("Inputan Anda Salah");
                    inti();
                }
    }

}
