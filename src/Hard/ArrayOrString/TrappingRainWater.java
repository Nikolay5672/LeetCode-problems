package Hard.ArrayOrString;

public class TrappingRainWater {
    public int trap(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;
        int maxL = height[left];
        int maxR = height[right];

        while(left < right){
            if(maxL < maxR){
                left++;
                maxL = Math.max(height[left], maxL);
                result += maxL - height[left];
            }
            else {
                right--;
                maxR = Math.max(maxR , height[right]);
                result += maxR - height[right];
            }

        }
        return result;
    }
}

