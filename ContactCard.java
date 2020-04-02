import java.util.Scanner;
public class ContactCard
{
   public static void main(String[] args)
   { 
      Scanner input= new Scanner(System.in);
      System.out.println("First name: ");
      String FirstName= input.nextLine();
      
      System.out.println("Last name: ");
      String LastName= input.nextLine();

      
      System.out.println("Address Line 1:  ");
      String Add1= input.nextLine();
      
      System.out.println("Address Line 2:  ");
      String Add2= input.nextLine();
      
      System.out.println("City: ");
      String City= input.nextLine();
      
      System.out.println("State: ");
      String State= input.nextLine();
      
      System.out.println("Zip Code: ");
      String Zip_Code= input.nextLine();
      
      System.out.println("Phone Number: ");
      String PhoneNumber= input.nextLine();
      
       System.out.println("Email Address: ");
       String Email= input.nextLine();
       
       System.out.println("Age: ");
       String Age= input.nextLine();
       
       System.out.println("Height: ");
       String Height= input.nextLine();

       System.out.println("Weight (in lbs): ");
       String Weight= input.nextLine();
       
       System.out.println("Job Title: ");
       String Job_Title= input.nextLine();
       
       System.out.println("Annual Income: ");
       double AnnualIncome = input.nextDouble();

      System.out.println("Monthly Income: ");
       double MonthlyIncome= input.nextDouble();
       
       System.out.println("Weekly Income: ");
       double WeeklyIncome= input.nextDouble();




      

      

      
      
            
      
      

      
      
      
      
      
      
      
      
      System.out.println("------------------------------------------");
      System.out.println("CONTACT CARD");
      System.out.println("------------------------------------------");
      System.out.printf("Name: %s %s\n", FirstName,LastName);
      
      System.out.println("Address Line 1: " + Add1);
      System.out.println("Address Line 2(N/A if only have one address): " + Add2);
      System.out.printf("City, ST Zip: %s, %s %s\n ", City, State, Zip_Code);
      System.out.println("------------------------------------------");
      System.out.println("Phone Number: " + PhoneNumber);
      System.out.println("Email Address: " + Email);
      System.out.println("------------------------------------------");
      System.out.printf("Age: %s      Height: %s      Weight: %s\n", Age, Height, Weight);
      System.out.println("------------------------------------------");
      System.out.println("Job Title: "+Job_Title);
      System.out.printf("Annual Income: $%.2f\n", AnnualIncome);
      System.out.printf("Monthly Income: $%.2f\n", MonthlyIncome);
      System.out.printf("Weekly Income: $%.2f\n", WeeklyIncome);
      System.out.println("------------------------------------------");
      
      }
}
\\
