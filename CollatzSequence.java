/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collatzsequence;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class CollatzSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
        
            int n, steps, largestNum, count;
            
            steps = 0;
            largestNum = 0;
            count = 0;
            
            System.out.print("starting Number : ");
            n = keyboard.nextInt();
            
            while(n != 1){
                
                if(n % 2 == 0){
                    
                    n = n / 2;
                    System.out.print(n + "    ");
                    steps++;
                    count++;
                    
                    if(largestNum < n){
                       largestNum = n;
                    }
                    
                    if(count > 9){
                        System.out.println("");
                        count = 0;
                    }
                    
                }else{
                    n = (n*3) + 1;
                    System.out.print(n + "    ");
                    steps++;
                    count++;
                    
                }
            }
            
            
            
            System.out.println("\nTerminated after " + steps + " steps." + " The largest value was " + largestNum );
    
    }
}      
    

