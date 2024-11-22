class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {

        //Initialize a hashmap to store the pattern and it's frequency
        Map<String, Integer> hashMap = new HashMap<>();

        //Initialize MaxCount variable to store maximum frequency
        int maxCount = 0;

        //Iterate through each row
        for(int [] row:matrix){

            char[] chars = new char[row.length];

            //Iterate through the values of row and append T if it's equal to first value in the row else 'F'
            for(int i=0;i<row.length;i++){
                if(row[0]==row[i]){
                    chars[i]='T';
                }else{
                    chars[i]='F';
                }
            }

            //Convert the char Array into String and put it in hashMap
            String s =  String.valueOf(chars);
            hashMap.put(s,hashMap.getOrDefault(s,0)+1);
        }

        //Iterate through frequencies and store the max value in the maxCount variable
        for(int count:hashMap.values()){
            maxCount = Math.max(maxCount,count);
        }

        return maxCount;
    }
}
