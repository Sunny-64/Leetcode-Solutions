package Medium;
// https://leetcode.com/problems/watering-plants/
public class WaterPlants {
    public int wateringPlants(int[] plants, int capacity) {
        int originalCapacity = capacity;
        int totalSteps = 0;
        for(int i = 0; i<plants.length; i++){
            int steps = 0;
            if(capacity < plants[i]){
                capacity = originalCapacity;
                steps += (i + (i+1));
            }
            else{
                steps++;
            }
            totalSteps +=steps;
            capacity -= plants[i];
            steps = 0;
        }
        return totalSteps;
    }
}
