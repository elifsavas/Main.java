import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k, m;
        int total =1 ;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayıyı Giriniz: ");
        k = input.nextInt();

        System.out.print("Üs Olacak Sayıyı Giriniz: ");
        m = input.nextInt();

        for (int i=1 ; i <= m ; i++ ) {

            total *= k ;

        }

        System.out.println(total);
    }
}
