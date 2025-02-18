class Solution {
    public String smallestNumber(String pattern) {
         int n = pattern.length();
        Stack<Integer> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i <= n; i++) {
            stack.push(i + 1); // Push current number into stack
            
            // If we reach the end or encounter 'I', pop all elements
            if (i == n || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }
        
        return result.toString();
    }
}
