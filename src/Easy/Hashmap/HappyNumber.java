package Easy.Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class HappyNumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1){

            if(!set.add(n)){
                return false;
            }

            int sum = 0;
            while (n > 0) {
                int digit = n % 10;  // Extract the last digit
                sum += digit * digit; // Square the digit and add to the sum
                n /= 10;  // Remove the last digit
            }

            n = sum;
        }

        return true;


    }
}
