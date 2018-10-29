public class Solution {
    /**
     * 比标准答案快，但不清晰。
     */
    public String addBinary(String a, String b) {
        int addNum = 0;
        int indexA = a.length() - 1;
        int indexB = b.length() - 1;
        StringBuilder res = new StringBuilder();

        while (indexA >= 0 && indexB >= 0) {
            int tmp = (int)a.charAt(indexA) - 48 + (int)b.charAt(indexB) - 48 + addNum;
            addNum = tmp / 2;
            res.append(tmp % 2);
            indexA -= 1;
            indexB -= 1;
        }

        while (indexA >= 0) {
            int tmp = addNum + (int)a.charAt(indexA) - 48;
            addNum = tmp / 2;
            res.append(tmp % 2);
            indexA -= 1;
        }

        while (indexB >= 0) {
            int tmp = addNum + (int)b.charAt(indexB) - 48;
            addNum = tmp / 2;
            res.append(tmp % 2);
            indexB -= 1;
        }

        if (addNum > 0) {
            res.append(1);
        }

        return res.reverse().toString();
    }
}