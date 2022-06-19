import java.util.Scanner;
// Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    public static void main(String[] args) {
        int yil, dort, dortYuz, dortKalan, dortYuzKalan;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz :");
        yil = input.nextInt();


        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.print(yil + " bir artik yildir.");
                } else {
                    System.out.print(yil + " artik yil degildir.");
                }
            } else {
                System.out.print(yil + " bir artik yildir.");
            }
        } else {
            System.out.print(yil + " artik yil degildir.");
        }
    }
}
