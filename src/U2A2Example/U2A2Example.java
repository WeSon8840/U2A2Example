/*
 * 
 */

package U2A2Example;

import java.util.ArrayList;

/**
 *
 * @author glSon8840
 */
public class U2A2Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Three ways to declare a two-dimensional array.
        //The first way:
        double invocie[][] = {{7,2.59},{12,3.79},{2,54.69}};
        
        //The second way:
        double invoice[][] = new double[3][3];
        invoice[0][0] = 7;
        invoice[0][1] = 2.59;
        invoice[1][0] = 12;
        invoice[1][1] = 3.79;
        invoice[2][0] = 2;
        invoice[2][1] = 54.69;
        
        //The third way: To create individual one-dimensional arrays 
        //               and join them together into a two-dimensional array. 
        
        String kids[] = {"Billy", "Bobby", "Johnny"};
        String teens[] = {"Tyler", "Jen"};
        String adults[] = {"Laura", "Mark", "Sam"};

        //Create a friends array using the three arrays above
        String friends[][] = {kids, teens, adults};

        //Display some stats
        System.out.println("The length of friends = " + 
            friends.length);
        System.out.println("The length of the 1st row of friends = "
            + friends[0].length);
        System.out.println("The length of the 2nd row of friends = "
            + friends[1].length);
        System.out.println("The length of the 3rd row of friends = "
            + friends[2].length);
        System.out.println("-------------------------------");
        //Display the friends array
        for(int i = 0; i < friends.length; i++){
            for(int j = 0; j < friends[i].length; j++){
            System.out.print("[" + friends[i][j] + "]");
        }
        System.out.print("\n");
    }	
        
        
        
        
//        int test1[] = {21,23,22,20,23,18,19,15,24};
//        int test2[] = {32,31,30,34,20,13,29,26,33};        
//        int test3[] = {13,10,13,10,13,14,15,11,10};
//        int results[][] = {test1,test2,test3};
//        int total = 0;
//        for(int i=0; i<results.length; i++){
//            for(int col=1;col<3;col++){
//              total += results[i][col];
//        }  
//            }
//            
//        System.out.println(total);
        
        //Quiz questions
//        int die1[] = {1,0,2,0,3,1};
//        int die2[] = {2,1,0,4,0,3};
//        int die3[] = {3,0,3,0,3,4};
//        int die4[] = {2,0,1,0,3,5};
//        int die5[] = {1,0,2,0,3,4};
//        int die6[] = {4,0,1,2,3,2};
//        int dice[][] = {die1,die2,die3,die4,die5,die6};
//        int total = 0;
//        for(int row = 0;row<dice.length; row ++){
//            for(int col = 0; col<dice[row].length; col++){
//            total += dice[row][col];
//            }
//    }
//        System.out.println(total);
    }
    
}
