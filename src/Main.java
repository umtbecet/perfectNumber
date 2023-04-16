import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int number;
        int sum =0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        number = input.nextInt();
        for (int i =1;i<number;i++){
            if (number%i==0){
               sum +=i;
            }
        }
        if (sum==number){
            System.out.println(number + " Mükemmel sayıdır. ");
        }else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

    }
}