//*change*
//Trinh Tran
//CSIS 1400
import java.util.Random;
import java.util.Scanner;
public class Dice2

{
 public static void main(String[] args)
 {
   
    
    
    Scanner input= new Scanner(System.in);
      int numDice;
      displayMenu();
      numDice = input.nextInt();
         
    if ((numDice == 4 )|| (numDice == 6) || (numDice == 8)|| (numDice == 10)||( numDice == 12) || (numDice == 20) ) 
    {
   rollDice(numDice);    
    }
    else
   {
   displayError();
 }   
  } 
  
  private static void displayMenu()
{
    System.out.println("------------------------");
    System.out.println("Select dice size");
    System.out.println("------------------------");
    System.out.println("4-sided");
    System.out.println("6-sided");
    System.out.println("8-sided");
    System.out.println("10-sided");
    System.out.println("12-sided");
    System.out.println("20-sided");
    System.out.println("------------------------");
    System.out.print("Enter 4, 6, 8, 10, 12, or 20: ");

}
 
 private static void rollDice(int numDice)
{
 int Result;
 Random rand = new Random();
 Result= rand.nextInt(numDice) +1;
 System.out.println("Rolled your " + numDice + "..." + "You roll a " + Result);
 }
 
 private static void displayError()
 {
 System.out.print("Error: Please enter a valid number");
 }
 }