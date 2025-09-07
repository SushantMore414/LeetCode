class Solution {
    // The main act! This function creates an array of 'n' numbers that sum to zero.
    public int[] sumZero(int n) {
        // Step 1: Prepare our magic bag (an array) that can hold exactly 'n' stones.
        int[] arr = new int[n];
        // A little helper index to remember where in the bag we're placing the next stone.
        int current_index = 0;

        // Step 2: Fill the first half of the bag with negative stones.
        // We go from 1 to n/2. For n=4, that's i=1 and i=2.
        for (int i = 1; i <= n / 2; i++) {
            arr[current_index++] = -i; // Place a negative stone, then move the index forward.
        }

        // Step 3: If we need an ODD number of stones, we need a special, neutral stone.
        // The neutral stone (0) doesn't pull in any direction. It's the peacemaker!
        if (n % 2 != 0) {
            arr[current_index++] = 0; // Place the zero, then move the index.
        }

        // Step 4: Fill the rest of the bag with positive stones.
        // Again, we go from 1 to n/2. This creates the perfect opposites for our negatives.
        for (int i = 1; i <= n / 2; i++) {
            arr[current_index++] = i; // Place a positive stone, then move the index.
        }

        // Ta-da! The bag is full. Present it to the genie.
        return arr;
    }
}