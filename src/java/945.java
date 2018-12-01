class Solution {
    public int minIncrementForUnique(int[] A) {
        int[] numToCount = new int[40000 + A.length];
        for (int num : A) {
            numToCount[num]++;
        }
        
        int result = 0;
        int j = 0;
        for (int i = 0; i < numToCount.length; i++) {
            j = Math.max(i + 1, j);
            while (numToCount[i] > 1) {
                while (numToCount[j] != 0) {
                    j++;
                }
                result += j - i;
                numToCount[j] = 1;
                numToCount[i] -= 1;
            }
        }
        
        return result;
    }
}
