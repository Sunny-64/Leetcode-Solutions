// https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers/description/
// 2133. Check if Every Row and Column Contains All Numbers
import java.util.*;

public class CheckValidMatrix {
    public static void main(String[] args){
        int [][] matrix = {
            {1,2,3},
            {3,1,2},
            {2,3,1}
        };

        boolean res = checkValid(matrix); 
        System.out.println(res); // should return true

    }
    
    public static boolean checkValid(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            HashSet<Integer> rowSet = new HashSet<Integer>(); 
            for(int j = 0; j < matrix[i].length; j++){
                rowSet.add(matrix[i][j]); 
            }
            if(rowSet.size() != matrix.length){
                return false; 
            }
            rowSet.clear(); 
        }

        int rowPointer = 0; 
        while(rowPointer < matrix.length){
            HashSet<Integer> colSet = new HashSet<Integer>(); 
            for(int i = 0; i<matrix.length; i++){
                colSet.add(matrix[i][rowPointer]); 
            }
            if(colSet.size() != matrix.length){
                return false; 
            }
            colSet.clear(); 
            rowPointer++; 
        }
        return true; 
    }
}
