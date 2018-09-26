/* Simulate 36000 dice rolls and store into 2D array
 *
 * Initialized array
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 *
 * Array after 3, 4 is rolled
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 1, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 * [0, 0, 0, 0, 0, 0]
 */
package dicesimulator;

import javax.swing.*;

public class DiceSimulator {

    public static void main(String[] args) {
        String myChoice = "";
        int dice[][] = new int[6][6];
        //I can roll 2, 3, 4, ..., 12 so there are 11 possible numbers
        //Include 0 and 1 for implicity sake
        int diceTotals[] = new int[13];
        int randomDie1, randomDie2;

        //Create menu
        while (!myChoice.equals("2")) {
            myChoice = JOptionPane.showInputDialog("1 - Roll the dice\n2 - Exit program");
            if (myChoice.equals("1")) {
                //Roll the dice

                //Initialize the dice array to zeros
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        dice[i][j] = 0;
                    }
                }

                //Initialize the diceTotals array to zeros
                for (int i = 0; i < diceTotals.length; i++) {
                    diceTotals[i] = 0;
                }

                //Generate 36,000 rolls of the dice and keep track of their values and their total sums
                for (int counter = 0; counter < 36000; counter++) {
                    randomDie1 = (int) (Math.random() * 6 + 1);
                    randomDie2 = (int) (Math.random() * 6 + 1);

                    //Increment the roll's location on the 2D array
                    dice[randomDie1 - 1][randomDie2 - 1]++;

                    //Increment the diceTotals array
                    diceTotals[randomDie1 + randomDie2]++;
                }

                //Display the results in a table using tabs \t

                System.out.print("\t\t\t\tDie 1\n");
                System.out.print("\t\t 1\t   2\t   3\t   4\t   5\t   6\nDie 2\n");

                for (int row = 0; row < 6; row++) {
                    System.out.print((row + 1) + "\t\t");
                    for (int col = 0; col < 6; col++) {
                        System.out.print(dice[row][col]);
                        //Print 1 tab if # is >999, 2 tabs otherwise
                        if (dice[row][col] > 999) {
                            System.out.print("\t");
                        } else {
                            System.out.print(" \t");
                        }
                    }
                    System.out.print("\n");
                }

                //Print the number of times each total was rolled
                System.out.println("Number of rolls with the sum:");

                for (int counter = 2; counter < diceTotals.length; counter++) {
                    System.out.println(counter + "\t" + diceTotals[counter]);
                }
            }
        }
    }
}
