class Solution {
    public int reverse(int x) {
        if (x / 10 == 0) {
            return x;
        }

        boolean isMinus = false;

        if (x < 0) {
            isMinus = true;
            x = Math.abs(x);
        }

        long base = 10;

        while (x / base >= 10) {
            base *= 10;
        }

        long res = 0;

        while (x > 0) {
            res += base * (x % 10);
            base /= 10;
            x /= 10;
        }

        if (isMinus) {
            res = -res;
        }

        if (res > 2147483647 || res < -2147483647) {
            return 0;
        }
        return (int)res;
    }
}
// 我的 leetcode C++ 解法更精妙。