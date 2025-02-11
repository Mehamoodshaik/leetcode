class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            int startInd = sb.indexOf(part);
            int endInd = startInd + part.length();
            sb.delete(startInd,endInd);
        }
        return sb.toString();
    }
}
