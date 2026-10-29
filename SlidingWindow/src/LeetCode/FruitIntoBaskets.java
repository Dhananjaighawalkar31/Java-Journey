package LeetCode;
public class FruitIntoBaskets {

    public static int totalFruit(int[] fruits) {
        int[] freq = new int[fruits.length];

        int left = 0;
        int distinct = 0;
        int maxLength = 0;

        for (int right = 0; right < fruits.length; right++) {

            if (freq[fruits[right]] == 0) {
                distinct++;
            }
            freq[fruits[right]]++;

            while (distinct > 2) {
                freq[fruits[left]]--;

                if (freq[fruits[left]] == 0) {
                    distinct--;
                }

                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};

        System.out.println(totalFruit(fruits));
    }
}

