import java.util.Scanner;

public class Main {
    static void isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                System.out.printf(str+" kelimesi Palindromik değildir. !");
            i++;
            j--;
        }
        System.out.printf(str+" kelimesi Palindromik kelimedir.");
    }



    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Palindromik yazıyı kontrol etmek istediğiniz sayıyı giriniz :  ");
        isPalindrome(input.nextLine());
    }
}