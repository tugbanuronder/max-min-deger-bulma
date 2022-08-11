import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz:");
        int sayi=input.nextInt();
        int max = 0 , min = 0;

        for(int i=1; i<=sayi ; i++){
            System.out.print(i +". "+ "sayıyı giriniz:");
            int n=input.nextInt();

            if(i==1){
                max=n;
                min=n;
            }

            if(n > max){
                max=n;
            }

            if(n < min){

                min=n;
            }

        }

        System.out.println("max:" + max);
        System.out.println("min:" + min);
    }
}