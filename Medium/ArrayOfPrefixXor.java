import java.util.Arrays;

class ArrayOfPrefixXor{
    public static void main(String[] args){
        int[] pref = {5,2,0,3,1}; 
        System.out.println(Arrays.toString(findArray(pref))); 
        // expected output [5,7,2,3,2]
    }
    public static int[] findArray(int[] pref) {
        int[] res = new int[pref.length]; 
        res[0] = pref[0]; 
        for(int i = 0; i<pref.length-1; i++){
            res[i+1] = pref[i] ^ pref[i+1]; 
        }
        return res; 
    }
}