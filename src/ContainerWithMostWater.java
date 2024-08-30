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

    
}
