import java.util.*;
public class MatrixMult {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the no. of rows in matrix 1: ");
      int m=sc.nextInt();  
      System.out.println("Enter the no. of columns in matrix 1: ");
      int n=sc.nextInt();  
      System.out.println("Enter the no. of rows in matrix 2: ");
      int p=sc.nextInt();  
      System.out.println("Enter the no. of columns in matric 2: ");
      int q=sc.nextInt();  
      int a[][]= new int[m][n];
      int b[][]= new int[p][q];
      int c[][]= new int[m][q];
      System.out.println("Enter the elements in matrix 1: ");
      for(int x=0;x<m;x++){
        for(int y=0;y<n;y++){
            a[x][y]=sc.nextInt();
        }
      }
      System.out.println("Enter the elements in matrix 2: ");
      for(int x=0; x<p; x++){
        for(int y=0; y<q; y++){
            b[x][y]=sc.nextInt();
        }
      }
      if(n!=p){
        System.out.println("Multiplication not possible");
      }
      for(int i=0;i<m;i++){
        for(int j=0;j<q; j++){
	c[i][j] = 0;
            for(int k=0;k<n;k++){
                c[i][j]+=a[i][k]*b[k][j];
            }
        }
      }
      System.out.println("");

      System.out.println("The first matrix is: ");
      for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println("");
      }
        
      System.out.println("");

      System.out.println("The second matrix is: ");
      for(int i=0; i<p; i++){
        for(int j=0; j<q; j++){
            System.out.print(b[i][j]+" ");
        }
        System.out.println("");
      } 
      System.out.println("");

      System.out.println("The resultant matrix is: ");
      for(int i=0; i<m; i++){
        for(int j=0; j<q; j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println("");
      }
      sc.close();
    }
}
