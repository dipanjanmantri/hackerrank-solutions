    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacker_rank_algo;

import java.util.Scanner;

/**
 *
 * @author Diphanjan
 */
public class staircase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
    
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++){
                if((i+j)>n){
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
    
}
