
import java.util.Scanner;
import javax.naming.spi.DirStateFactory;

public class MissingNumCheck {

    public static boolean isSequence(int[] n){
        if(n[0] != 1){
            return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
        }
        if(!isSequence(array)){
            System.out.println("1");
            return;
        }
        int result = 0;
        for (int i = 0; i < n-2; i++) {
            if(array[i] + 1 != array[i+1]){
                result = array[i] + 1;
                break;
            }
        }
        if(result == 0){
            result = n;
        }
        System.out.println(result);
    }
}
