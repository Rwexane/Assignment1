/* Technical Programming 2 First Assignment
*  Author: Bulelani Rwexane
*  Date: 17 / 02 / 2018
*  */

import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;

public class RandomNumber
{
    public static void main(String args[])
    {

        Random ram = new Random();

        int count;
        int ramNum = 1 + ram.nextInt(10);

        for (count = 0; count < 3; count++)
        {
            String r = JOptionPane.showInputDialog("Guess a number between 1 - 10: ");

            if(ramNum == count)

                JOptionPane.showMessageDialog(null,"You win, random number is " + ramNum);
            else
                JOptionPane.showMessageDialog(null,"Incorrect, try again");


        }
        JOptionPane.showMessageDialog(null,"The number you were looking for is " + ramNum);

    }

}
