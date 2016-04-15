
import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.abs;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diphanjan
 */
public class square_matrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int sum1=0,sum2=0;
        int[][] arr=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                arr[i][j]=input.nextInt();
            }
        }
        //System.out.println("The 3x3 matrix is: ");
            
        for(int i=0,j=size-1;i<size;i++,j--){
            sum2+=arr[i][j];
        }
        //System.out.println(sum1);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j)
                    sum1+=arr[i][j];
            }
            
        }
       // System.out.println("sum of diagonal elements :"+sum1);
        //System.out.println("sum of anti-diagonal elements: "+sum2);
        System.out.println((abs(sum1-sum2)));
    }
    
}
