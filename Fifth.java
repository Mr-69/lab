class Fifth { 
      
    static int N = 3; 
    static boolean isMagicSquare(int mat[][]) 
    { 
        int sum = 0; 
        for (int i = 0; i < N; i++) 
            sum = sum + mat[i][i]; 
  
        // For sums of Rows 
        for (int i = 0; i < N; i++) { 
  
            int rowSum = 0; 
            for (int j = 0; j < N; j++) 
             rowSum += mat[i][j]; 
            if (rowSum != sum) 
                return false; 
        } 
        for (int i = 0; i < N; i++) { 
   int colSum = 0; 
            for (int j = 0; j < N;colSum += mat[j][i]) 
            if (sum != colSum) 
                return false; 
        } 
  
        return true; 
    } 
    public static void main(String[] args) 
    { 
        int mat[][] = {{ 2, 7, 6 }, 
                       { 9, 5, 1 }, 
                       { 4, 3, 8 }}; 
  
        if (isMagicSquare(mat)) 
            System.out.println("Magic Square"); 
        else
            System.out.println("Not a magic" +  " Square"); 
    } 
} 