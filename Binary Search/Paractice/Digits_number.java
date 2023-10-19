public class Digits_number {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int count = countNumbersWithEvenDigits(nums);
        System.out.println("Count of numbers with even digits: " + count);
    }

    static int countNumbersWithEvenDigits(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (hasEvenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean hasEvenDigits(int num) {
        int numberOfDigits = countDigits(num);
        return numberOfDigits % 2 == 0;
    }

    static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}