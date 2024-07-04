//import java.util.*;

public class appearOnes {

    static int singleNumber(int[]  nums){

        int Xor = 0;
        for(int i = 0; i < nums.length; i++){
            Xor = Xor ^ nums[i];
        }
        return Xor;
    }
    public static void main(String args[]) {
        int[] nums = {4, 1, 2, 1, 2};

        int ans = singleNumber(nums);

        System.out.println("The single element is: " + ans);

    }
}
