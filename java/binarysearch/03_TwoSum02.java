public class 03_TwoSum02 {
    public int[] twoSum(int[] numbers, int target) {
        //有序的数组nums，计算两数之和，必然使用双指针
        int i = 0, j = numbers.length - 1;
        while(i < j) {
            if(numbers[i] + numbers[j] == target) {
                return new int[]{i+1, j+1};
            } else if(numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        throw new RuntimeException("not found.");
    } 
}
