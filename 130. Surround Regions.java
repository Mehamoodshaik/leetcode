class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O' && ((i==0) || (i==m-1) ||(j==0)||(j==n-1))){
                    capture(i,j,board,m,n);
                }
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j] ='X';
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='T'){
                    board[i][j] ='O';
                }
            }
        }
    }

    private void capture(int row,int col, char[][] board,int m, int n){
        if(row<0 || col<0 || row==m || col==n || board[row][col]!='O'){
            return;
        }
        board[row][col] = 'T';
        capture(row+1,col,board,m,n);
        capture(row-1,col,board,m,n);
        capture(row,col+1,board,m,n);
        capture(row,col-1,board,m,n);
    }
}
