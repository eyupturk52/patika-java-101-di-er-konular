import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;

            }
            i++;
            j--;
        }
         return true;

    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str;
        System.out.println("bir kelime giriniz");
        str= input.nextLine();
        System.out.print(isPalindrome(str));
    }
}
