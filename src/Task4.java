public class Task4 {
    public static String dups(int[] nums){
        String dupNum = "";
        for(int i = 0; i < nums.length; i++){
            int check = 0;
            for (int j = 0; j < i; j++){
                if (nums[j]==nums[i]){
                    check++;
                }
            }
            if (check != 0) continue;
            for (int j = i + 1; j < nums.length; j++){
                if (nums[j]==nums[i]){
                    dupNum += (nums[i] + " ");
                    break;
                }
            }

        }
        if (dupNum.equals(""))
            return "There are no duplicates.";
        else {
            return dupNum;
        }
    }
    public static void main(String[] args){
        int[] array = {4, 7, 2, 4, 9, 7, 1, 2, 8, 4};
        System.out.println(dups(array));
    }
}
