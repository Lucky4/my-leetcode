class Solution {
    public String getPermutation(int n, int k) {
        int[] factorial = new int[n+1];
        int sum = 1;
        factorial[0] = 1;
        for (int i = 1; i < n; i++) {
            sum *= i;
            factorial[i] = sum;
        }

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        k--;

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= n; i++){
            int index = k/factorial[n-i];
            sb.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);
            k-=index*factorial[n-i];
        }

        return String.valueOf(sb);
    }
}

// Time Limit Exceeded.
class Solution {
    private int pos = 0;

    public String getPermutation(int n, int k) {
        int[] originData = new int[n];
        for (int i = 1; i <= n; i++) {
            originData[i - 1] = i;
        }

        int numOfPermutation = 1;
        for (int i = 1; i <= n; i++) {
            numOfPermutation *= i;
        }

        String[] permutations = new String[numOfPermutation];
        helper(originData, permutations,0);
        Arrays.sort(permutations);
        return permutations[k - 1];
    }

    public void helper(int[] originData, String[] permutations, int i) {
        if (i == originData.length - 1) {
            String tmp = "";
            for (int j = 0; j < originData.length; j++) {
                tmp += String.valueOf(originData[j]);
            }
            permutations[pos] = tmp;
            pos += 1;
        }

        for (int j = i; j < originData.length; j++) {
            int tmp;
            tmp = originData[i];
            originData[i] = originData[j];
            originData[j] = tmp;

            helper(originData, permutations, i + 1);

            tmp = originData[i];
            originData[i] = originData[j];
            originData[j] = tmp;
        }
    }

    public static void main(String args[]) {
        Solution obj = new Solution();
        System.out.println(obj.getPermutation(3, 3));
    }
}