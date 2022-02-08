import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand=new Random();
        int number= rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right=0;
        int selected;
        int[] wrong=new int[5];
        boolean isWin = false;
        boolean isWrong=false;
        while(right<5){
            System.out.print("lütfen tahmininizi giriniz:  ");
            selected=input.nextInt();
            if(selected<0 || selected>99){
                System.out.print("0 ile 100 arasında bir sayı giriniz.");
                if(isWrong){
                    right++;
                    System.out.print("çok fazla hatalı giriş yaptınız.kalan hak:"+(5-right));
                    System.out.print("bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");
                }
                else{
                    isWrong=true;
                    System.out.print("bir dahaki hatalı girişinizde hakkınızdan düşülecektir.");

                }
                continue;
            }
            if(selected==number){
                System.out.print("tebrikler dogru tahmin! tahmin ettiginiz sayı:" +number);
                isWin=true;
                break;
            }
            else{

                System.out.print("hatalı bir sayı girdiniz:");
                if(selected>number){
                    System.out.println("girdiginiz sayı gizli sayıdan büyüktür");
                }
                else{
                    System.out.println("girdiginiz sayı gizli sayıdan küçüktür");
                }
                wrong[right]=selected;
                right++;
                System.out.print("kalan hakkı:" +(5-right));

            }


        }
        if(!isWin) {
            System.out.print("kaybettiniz.");
            if (!isWrong) {
                System.out.print("tahminleriniz:" + Arrays.toString(wrong));
            }
        }
    }
}
