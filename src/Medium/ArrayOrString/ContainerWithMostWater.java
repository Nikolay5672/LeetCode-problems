package Medium.ArrayOrString;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int maxVolume = 0;

        for(int i = 0; i < height.length; i++){
            for(int j = i + 1; j < height.length; j++){
                if(Math.min(height[i], height[j]) * (j - i) > maxVolume){
                    maxVolume = Math.min(height[i], height[j]) * (j - i);

                }
            }
        }

        return maxVolume;
    }

    public static int maxAreaOptimized(int[] height) {
        int maxVolume = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            maxVolume = Math.max(maxVolume, area);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }

        return maxVolume;
    }



}
