import java.util.Scanner;  

/**
 *
 * @author User
 */
public class Tugas5 {
static Scanner input = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */

    
    public static void main(String[] args) {
     String a;
               
     System.out.println(" Stemmer Kata Indonesia Sederhana ");
     System.out.println("---------------------");
     System.out.println("Klik Enter Untuk Stemming");
     System.out.print(" Masukkan Kata : ");
     a = input.nextLine();
     
     System.out.println("----Hasil Stemming----");
     System.out.println(a);
    }
}