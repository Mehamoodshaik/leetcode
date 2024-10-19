class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder curString = new StringBuilder("0");
        if(n==1){
            return curString.toString().charAt(k-1);
        }
        for(int i=2;i<n+1 && curString.length()<k;i++){
            curString.append("1");
            for(int j=curString.length()-2;j>=0;j--){
                char invertBit = (curString.charAt(j)=='1')?'0':'1';
                curString.append(invertBit);
            }
            
            
        }
      
        return curString.toString().charAt(k-1);
      

    }

   
    
}
