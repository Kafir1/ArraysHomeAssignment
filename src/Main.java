public class Main {
    public static void main(String[] args){
        int[] nums = {5, -3, 8, -1, 0, 12, -7, 4, 9, -2};
        int i = 0;
        int count = 0;
        System.out.print("Original: ");
        for (int num : nums){
            System.out.print(num + " ");
            if (num < 0){
                nums[i] = 0;
                count++;
            }
            i++;
        }
        System.out.println();
        System.out.print("Modified: ");
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
        System.out.println("Replacements: " + count);
    }
}