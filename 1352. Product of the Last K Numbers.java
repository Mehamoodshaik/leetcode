class ProductOfNumbers {
    
    ArrayList<Integer> prodStack;
    public ProductOfNumbers() {
        prodStack = new ArrayList<>();
        prodStack.add(1);
        
    }
    
    public void add(int num) {
        if(num>0)prodStack.add(prodStack.get(prodStack.size()-1)*num);
        else{
            prodStack = new ArrayList<>();
            prodStack.add(1);
        }
    }
    
    public int getProduct(int k) {
        int n = prodStack.size();
        if(k<n){
            return prodStack.get(n-1)/prodStack.get(n-k-1);
        }
        return 0;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */
