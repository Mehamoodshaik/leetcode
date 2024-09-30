class CustomStack {
    int[] arr;
    int i;
    public CustomStack(int maxSize) {
        arr = new int[maxSize];
        i = 0;
    }
    
    public void push(int x) {
        
        if(i<arr.length){
            arr[i] = x;
            i++;
        }
        
    }
    
    public int pop() {
        if(i>0){
            i--;
            return arr[i];
        }
        return -1;
    }
    
    public void increment(int k, int val) {

        for(int j=0;j<i && j<k;j++){
            arr[j]+= val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */



