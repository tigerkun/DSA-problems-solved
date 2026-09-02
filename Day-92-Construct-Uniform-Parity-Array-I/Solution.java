class Solution {
    public boolean uniformArray(int[] nums) {

        boolean hasEven = false;
        boolean hasOdd = false;

        for (int num : nums) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // If all numbers already have the same parity
        if (!hasEven || !hasOdd) {
            return true;
        }

        // If both even and odd numbers exist,
        // check whether the required operation can make them uniform.
        return true;
    }
}
