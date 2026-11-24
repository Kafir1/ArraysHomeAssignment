import java.util.Scanner;
public class Task3 {
    public static void remove(int [] nums){
        Scanner in = new Scanner(System.in);
        System.out.print("Original: ");
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
        System.out.print("Enter index to remove: ");
        int index = in.nextInt();
        int[] upd = new int[nums.length-1];
        for (int i = 0; i < nums.length; i++){
            if (i > index)
                upd[i-1] = nums[i];
            else if (i < index)
                upd[i] = nums[i];
        }
        System.out.print("Updated: ");
        for (int up : upd)
            System.out.print(up + " ");
    }
    public static void main(String[] args){
        int[] a = {10, 20, 30, 40, 50};
        remove(a);
    }
}
