class Solution {
    /**
     * 埃拉托斯特尼筛选法
     */
    public int countPrimes(int n) {
        boolean[] primes = new boolean[n];

        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int j = 2; j <= Math.sqrt(n - 1); j++) {
            if (primes[j]) {
                for (int k = j + j; k < n; k += j) {
                    primes[k] = false;
                }
            }
        }

        int count = 0;

        for (int t = 2; t < n; t++) {
            if (primes[t]) {
                count += 1;
            }
        }

        return count;
    }
}

public class Solution {
    /**
     * 6N +/- 1法
     */
    public boolean[] FindPrimes(int n) {
        boolean[] primes = new boolean[n + 1];
        primes[2] = true;
        primes[3] = true;

        for (int i = 6; i <= n; i += 6) {
            for (int j = -1; j <= 1; j += 2) {
                if (IsPrime(i + j) == true) {
                    primes[i + j] = true;
                }
            }
        }

        return primes;
    }

    public boolean IsPrime(int n) {
        if (n == 2) {
            return true;
        }

        if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

// 参考1：https://www.cnblogs.com/findwg/p/4901219.html
// 参考2：https://baike.baidu.com/item/%E5%9F%83%E6%8B%89%E6%89%98%E6%96%AF%E7%89%B9%E5%B0%BC%E7%AD%9B%E6%B3%95/374984
// 参考3：https://blog.csdn.net/w20810/article/details/43269843
// 如果要判断一个数是不是素数，可以对这个数使用 sqrt 函数，这样可以减少很大的数量级。
