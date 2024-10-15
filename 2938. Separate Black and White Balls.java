class Solution {
    public long minimumSteps(String s) {
        char[] sArray = s.toCharArray();
        int counter =0;
        int index = sArray.length-1;
        long res = 0;
        while(index>=0){
            if(sArray[index]=='0'){
                while(index>=0 && sArray[index]=='0'){
                    counter++;
                    index--;
                }
                if(index>=0 && sArray[index]=='1'){
                    res+=counter;
                }
                
            }
            else{
                res+=counter;
            }
            index--;
        }

        return res;
    }
}
