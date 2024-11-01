class Solution {
    public String makeFancyString(String s) {
      //If the length of the string is less than 3 then we can return the string
        int n = s.length();
        if(n<3){
            return s;
        }
      //initialise leftpointer lp to 0
        int lp = 0;
      //Convert the string to char array
        char[] sArray = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(lp+2<n){    
          //Check if next two characters are same if so replace the current character with 1
            if(sArray[lp]==sArray[lp+1] && sArray[lp]==sArray[lp+2]){
                sArray[lp] = '1';
            }
            lp++;
        }
        for(int i=0;i<n;i++){
            if(sArray[i]!='1'){
                sb.append(sArray[i]);
            }  
        }
        return sb.toString();
    }
}
