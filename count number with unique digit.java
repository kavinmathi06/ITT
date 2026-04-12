class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int total = 10; 
        int uniqueDigitsCount = 9;
        int availableNumber = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            uniqueDigitsCount *= availableNumber;
            total += uniqueDigitsCount;
            availableNumber--;
        }
        
        return total;
    }
}