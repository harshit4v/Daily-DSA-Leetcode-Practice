class Solution {
public:
 bool canPartition(string s, int target, int start = 0, int sum = 0) {
        if (start == s.size()) return sum == target;
        
        int current = 0;
        for (int i = start; i < s.size(); i++) {
            current = current * 10 + (s[i] - '0');
            if (current + sum <= target && canPartition(s, target, i + 1, sum + current)) {
                return true;
            }
        }
        return false;
    }
    int punishmentNumber(int n) {
        int total = 0;
        for (int i = 1; i <= n; i++) {
            int sq = i * i;
            if (canPartition(to_string(sq), i)) {
                total += sq;
            }
        }
        return total;
    }
};
