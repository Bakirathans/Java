
import java.util.Scanner;

public class RunLength {

    public static void CompressString(String S) {
        int left = 0;
        int right = left + 1;
        int count = 1;
        while(right < S.length()){
            if (S.charAt(left) == S.charAt(right)) {
                count++;
                right++;
            } else {
                System.out.println(S.charAt(left) + "" + count); 
                left = right;
                right = left + 1; 
                count = 1;
            }
        }
        System.out.print(S.charAt(left) + "" + count);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String Str = sc.nextLine();
            CompressString(Str);
        }
    }

}
