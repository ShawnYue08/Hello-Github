public class 01_ContainerWithMostWater {
    public void maxArea(int[] height) {
        //盛水最多的容器面积，前后指针类型，i从前向后，j从后向前，相遇时退出while循环
        int maxArea = 0;
        int i = 0, j = height.length - 1;
        while(i < j) {
            maxArea = Math.max(maxArea, Math.min(height[i], height[j]));
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
