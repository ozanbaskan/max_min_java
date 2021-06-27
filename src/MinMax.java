import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        int repeat;
        int count = 1;
        long biggest, smallest;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Kaç tane sayı girmek istediğinizi yazınız: ");
            repeat = s.nextInt();
        } while (repeat < 0);

        System.out.printf("%d. sayıyı giriniz: ", count++);
        biggest = smallest = s.nextLong();
        for (int i = 1; i < repeat;i++)
        {
            System.out.printf("%d. sayıyı giriniz: ", count++);
            long entry = s.nextLong();
            if (entry > biggest) biggest = entry;
            if (entry < smallest) smallest = entry;
        }


        System.out.println("En büyük sayı: " + biggest);
        System.out.println("En küçük sayı: " + smallest);

    }

}
