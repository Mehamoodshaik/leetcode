class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        int curA = 0, curB = 0, curC = 0;
        int totalIter = a+b+c;
        for(int i=0;i<totalIter;i++){
            if(
                (a>=b && a>=c && curA<2 )||(a>0 && (curB==2 || curC==2 ))
                ){
                sb.append('a');
                curA++;
                curB=0;
                curC=0;
                a--;
            }
            else if(
                (b>=a && b>=c && curB<2 )||(b>0 && (curA==2 || curC==2 ))
                ){
                sb.append('b');
                curB++;
                curA=0;
                curC=0;
                b--;
            }
            else if(
                (c>=a && c>=b && curC<2)||(c>0 && (curA==2 || curB==2 ))
                ){
                sb.append('c');
                curC++;
                curA=0;
                curB=0;
                c--;
            }
        }

        return sb.toString();
    }
}
