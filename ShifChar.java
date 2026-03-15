import java.util.Scanner;

public class ShifChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            String result = "";
            for(int i = 0 ; i < str.length();i++){
                char c = str.charAt(i);
                int shift = (c - 'a' + i) % 26;
                char newchar = (char) ('a' + shift);
                result = result + newchar;
            }
        System.out.println(result);
    }
}
