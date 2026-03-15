import java.util.Scanner;
public class PrefixCheck {

    public static void PrefixCheck(String[] arr,String target) {
        int left = 0;
        int find = -1;
        int i = 0;
        while (left < target.length()){
            if(i == arr.length){
                break;
            }
            if(arr[i].charAt(left) == target.charAt(left)){
               left++;
               find = i;
            }
            else{
                i++;
                left = 0;
                find = -1;
            }
            
        }
        System.out.println(arr[find]);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] array = {"Apple" , "Application" ,"Cat","Doggy"};
        String target =  scan.nextLine();
        PrefixCheck(array,target);
    }
}
