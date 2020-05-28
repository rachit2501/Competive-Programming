import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class PlayWith2DArray {

static int count =0;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    count = 0;
    int n = sc.nextInt();
    int arr[][] = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
  for(int i = 0 ; i<n ; i++){
    row(arr , n , i);
    column(arr , n , i);
}

for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
     System.out.print(arr[i][j] + " ");
    }
  }
}

  static void row(int arr[][] , int n , int row){
    int x,y,min,yHold=0;
    boolean yes = false;
    for(x=0;x<n;x++)
    {
        min = arr[row][x];
        for( y = row;y<n;y++){
            if(arr[y][x] < min){
                min = arr[y][x];
                yHold = y;
                yes = !yes;
            }
        }
        if(yes){
            int temp = arr[row][x];
            arr[row][x] = min;
            arr[yHold][x] = temp;
            yes=!yes;
            count++;
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
         System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println();

  }
  static void column(int arr[][] , int n , int column){
    int x,y,min,yHold=0;
    boolean yes = false;
    for(x=0;x<n;x++)
    {
        min = arr[column][x];
        for( y = column;y<n;y++){
            if(arr[y][x] < min){
                min = arr[x][y];
                yHold = y;
                yes = !yes;
            }
        }
        if(yes){
            int temp = arr[x][column];
            arr[x][column] = min;
            arr[x][yHold] = temp;
            yes=!yes;
            count++;
        }
    }
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
         System.out.print(arr[i][j] + " ");
        }
      }
      System.out.println();
  }
}