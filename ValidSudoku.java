class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] r = new HashSet[9];
        HashSet<Character>[] c = new HashSet[9];
        HashSet<Character>[] b = new HashSet[9];
        for(int i=0;i<9;i++){
            r[i] = new HashSet<>();
            c[i] = new HashSet<>();
            b[i] = new HashSet<>();
        }
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char num = board[row][col];
                if(num == '.') continue;
                if(r[row].contains(num)) return false;
                if(c[col].contains(num)) return false;
                int box = (row/3)*3 + (col/3);
                if(b[box].contains(num)) return false;
                r[row].add(num);
                c[col].add(num);
                b[box].add(num);
            }
        }
        return true;
    }
}
