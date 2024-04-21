// https://github.com/Sunny-64/Leetcode-Solutions.git

class ContainerWithMostWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,3,5,4,8,3,7}; 
        int result = maxArea(height); 
        System.out.println("Maximum water that can be contained is : " + result); // output should be 49
    }

    public static int maxArea(int[] height) {
        int maxHeight = 0; 
        int left = 0; 
        int right = height.length - 1; 

        while(right > left) {
            int distance = right - left; 
            int straightContainer = 0; 

            if(height[left] > height[right]){
                straightContainer = height[right]; 
                right--; 
            }
            else{
               straightContainer = height[left];  
               left++; 
            }
            
            if(maxHeight < (distance * straightContainer)) {
                maxHeight = distance * straightContainer; 
            }
          
        }
        return maxHeight; 
    }
}