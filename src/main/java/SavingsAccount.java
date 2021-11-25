import java.util.Scanner;

public class SavingsAccount extends BankAccount
{
    Scanner obj1 = new Scanner(System.in);
    public double interest;
    //public double Cinterest_rate = 0;
    
     public SavingsAccount(double inte, String n, String Ca, String CP, String CAN, double CB)
    {
    	 super(n, Ca, CP, CAN, CB);
    	 interest = inte;
    	    		 
    	 
    }
     
     public void setCName(String Name)
     {
         CName = Name;
     }
     public String getCName()
     {
         return CName;
     }
//    public void setinterest_rate(double interest_rate)
//    {
//        this.Cinterest_rate = interest_rate;
//    }
//     public double getinterest_rate()
//    {
//        return this.Cinterest_rate;
//    }

	
     
   // public double calculate_interest()
    //{
      //  System.out.print("Enter the Interest rate :");
        //Cinterest_rate = obj1.nextDouble();
        //interest = this.getBalance() * (Cinterest_rate)/100;
       // return interest;
        
    }
    
     

