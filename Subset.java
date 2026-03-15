public class Subset {

    public static void recursive(int[] arr, int size,int index,int sum,int[] sub){
        if(index==arr.length){
            for(int i = 0;i <size;i++){
                System.out.print(sub[i] + " ");
            }
            System.out.println();
            return;
        }
        sub[size] = arr[index];
        recursive(arr, size + 1, index +1, sum, sub);
        recursive(arr, size, index +1, sum,sub );
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int [] sub =  new int[arr.length];
        recursive(arr, 0, 0, 0, sub);
    }
}