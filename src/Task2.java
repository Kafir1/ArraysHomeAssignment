public class Task2 {
    public static void large(int[] a){
        System.out.print("Array: ");
        for (int num : a)
            System.out.print(num + " ");
        System.out.println();
        int[] largs = {a[0], a[0]};
        for (int i = 0; i < a.length-1; i++){
            if (a[i]!=a[i+1]){
                for (int num : a){
                    if (num > largs[0])
                        largs[0]=num;
                }
                for (int num : a){
                    if (num > largs[1] && num < largs[0])
                        largs[1]=num;
                }
                System.out.println("Largest: " + largs[0]);
                System.out.println("Second largest: " + largs[1]);
                System.out.println();
                break;
            }
        }
        if (largs[0]==largs[1])
            System.out.println("No second largest distinct number.");
    }
    public static void main(String[] args) {
        int[] nums = {10, 25, 8, 30, 15, 30};
        int[] nums2 = {5, 5, 5, 5, 5, 5};
        large(nums);
        large(nums2);
    }
}
