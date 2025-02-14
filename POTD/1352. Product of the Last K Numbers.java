class ProductOfNumbers {
    private List<Integer> prefixProduct;
    private int lastZeroIndex;
    public ProductOfNumbers() {
        prefixProduct = new ArrayList<>();
        prefixProduct.add(1); // Initialize with 1 for multiplication ease
        lastZeroIndex = -1;   // Track the last zero's index
    }
    public void add(int num) {
        if (num == 0) {
            prefixProduct.clear();
            prefixProduct.add(1); // Reset the prefix product
            lastZeroIndex = prefixProduct.size() - 1; // Mark zero's position
        } else {
            prefixProduct.add(prefixProduct.get(prefixProduct.size() - 1) * num);
        }
    }
    public int getProduct(int k) {
        int n = prefixProduct.size();
        if (k >= n) {
            return 0; // If k extends past the reset point (last zero)
        }
        return prefixProduct.get(n - 1) / prefixProduct.get(n - k - 1);
    }
}
/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
