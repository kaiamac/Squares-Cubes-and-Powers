/*
 * Kaia Mac
 * Finding the end value of a number to a power
 * October 24th
 */

package cubessquaresandpowers;
import java.util.Scanner;
/**
 *
 * @author kamac8665
 */
public class CubesSquaresAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner(System.in);
        
        int choice = 0;
        int usernum = 0;
        int userpower = 0;
        int orignum = 0;
            
        while (true)
        {    
            System.out.println("---Cubes Squares and Powers---");
            System.out.println("    ");
        
            System.out.println("Please enter your choice:");
            System.out.println("1… Find the value of a number squared");
            System.out.println("2… Find the value of a number cubed");
            System.out.println("3… Find the value of a number, to any power");
            System.out.println("4… Exit");
            System.out.println("Please enter your choice:");
        
            choice = keyedInput.nextInt();
        
            System.out.println("    ");
            System.out.println("----------------------------------------");
        
        
            if (choice == 1)
            {   System.out.println("You have chosen to find the value of a number squared:");
                System.out.println("    ");
            
                System.out.println("Please input a number to be squared:");
                usernum = keyedInput.nextInt();
                System.out.println("    ");
                
                
                int i = 1;
            
                    while (i <= 2)
                    {
                        System.out.println(usernum);
                        usernum = usernum*usernum;
                        i = i + 1;        
                    }
            }
            if (choice == 2)
            {   System.out.println("You have chosen to find the value of a number cubed:");
                System.out.println("    ");
                
                System.out.println("Please input a number to be cubed:");
                usernum = keyedInput.nextInt();
                System.out.println("    ");
                
                orignum = usernum;
                int i = 1;
            
                    while (i <= 3)
                    {
                        System.out.println(usernum);
                        usernum = usernum*orignum;
                        i = i + 1;        
                    }
            }
            if (choice == 3)
            {   System.out.println("You have chosen to find the value of a number, to any power");
                System.out.println("    ");
            
                System.out.println("Please input a number:");
                orignum = keyedInput.nextInt();
                System.out.println("    ");
                
                System.out.println("Please enter a number as the power:");
                userpower = keyedInput.nextInt();
                System.out.println("    ");
                
                usernum = orignum;
                int i = 1;
            
                    while (i <= userpower)
                    {
                        System.out.println(usernum);
                        usernum = usernum*orignum;
                        i = i + 1;        
                    } 
            }
            else if (choice == 4)
            {
                System.out.println("Goodbye!");  
                break;
            }
        }
    }
}