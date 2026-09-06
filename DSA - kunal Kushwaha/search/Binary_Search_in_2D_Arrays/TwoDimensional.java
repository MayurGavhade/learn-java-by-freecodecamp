package search.Binary_Search_in_2D_Arrays;

import java.util.Arrays;

public class TwoDimensional {
    public static void main(String[] args) {
      int[][] arr = {{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
      int target = 37;
        System.out.println(Arrays.toString(binarySearchWhileLoop(arr, target)));
    }

    // This method will search over 2d-binary array.
    // Using For loop
    static int[] binarySearchForLoop(int[][] arr, int target) {

        // This will iterate over rows of 2d array
        for (int r = 0; r < arr.length; r++) {
            // This will iterate over columns of 2d array.
            for (int c = 0; c < arr.length; c++) {
                if(arr[r][c] > target) {
                    r++;
                } else if(arr[r][c] < target) {
                    c++;
                } else if (arr[r][c] == target) {
                    return new int[] {r,c};
                }
            }
        }

        // return empty array if no element is found
        return new int[] {};
    }

    // This method will search over 2d array by while loop.
    static int[] binarySearchWhileLoop(int[][] arr,int target) {
        int r = 0;
        int c = arr.length - 1;

        while(r < arr.length && c >= 0) {
            if(arr[r][c] == target) {
                return new int[] {r,c};
            }
            if(arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1,-1};
    }
}
