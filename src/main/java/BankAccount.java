import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat; 

//public class account_management_system {
    
   

   // public static void main(String[] args) throws ParseException 
    //{
        
        
      //      BankAccount obj1 = new BankAccount();
        //    obj1.showMenu();
     

    //}


//}



public class BankAccount 
{
    protected String CName;
    protected String CAddress;
    protected int CPhoneNo;
    protected String CAccountNo;
    protected double CBalance;
    protected double deductions;
    
    BankAccount(String n, String Ca, int CP, String CAN, double CB)
    {
    	CName = n;
    	CAddress = Ca;
    	CPhoneNo = CP;
    	CAccountNo = CAN;
    	CBalance = CB;
    }
    
    
  
    public BankAccount(String n, String ca, String cP, String cAN, double cB) {
		// TODO Auto-generated constructor stub
	}



	public void setCAddress(String Address)
    {
        this.CAddress = Address;
    }
    public String getCAddress()
    {
        return this.CAddress;
    }
    
   
    public void setCPhoneNo(int PhoneNo)
    {
        this.CPhoneNo = PhoneNo;
    }
    public int getCPhoneNo()
    {
        return this.CPhoneNo;
    } 
    
    
    public void setAccountNo(String AccountNo)
    {
        this.CAccountNo = AccountNo;
    }
    public String getAccountNo()
    {
        return this.CAccountNo;
    } 
    
  
    
    
    public void setBalance(double Balance)
    {
        this.CBalance = Balance;
    }
    public double getBalance()
    {
        return this.CBalance;
    } 
    
    
    int printStatement;
    double zakat;
    String date = "";

   

    public void makeDeposit()
    {
    	
    }

    public double makeWithdrawal(int amount)
    {
        CBalance = CBalance-amount;
        printStatement = printStatement - amount;
        String date1 = null;
		date = date1;
		return amount;
    }

    public void checkBalance()
    {
        System.out.println(CBalance);
    }

    public void getprintStatement() throws ParseException
    {
        if(printStatement < 0)
        {
            System.out.println("Withdrawn: "+Math.abs(printStatement));
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);  
            System.out.println(date1);  
        }
        else if(printStatement > 0)
        {
            System.out.println("Deposited: "+printStatement);
            Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date);  
            System.out.println(date1);  
        }
        else
        {
            System.out.println("No transaction occured");
        }
    }
    public void transferAmount()
    {

    }
    public void calculateZakat()
    {
        if(CBalance >= 20000)
        {
            zakat = (CBalance * 2.5)/100;
            System.out.print("Zakat eligible on your Amount is "+zakat+"-Rs. ");
        }
        else
        {
            System.out.print("Zakat is only eligible for Amount greater than or equal to 20000-Rs.");
        }
    }




    public double displayAllDeductions()
    {
    	System.out.println("Your Total Deduction from your Checkings account is: " + deductions);
		return deductions;
    }



	public void MakeDeposit(int i) {
		// TODO Auto-generated method stub
		int amount = 0;
    	String date1 = null;
        CBalance = CBalance + amount;
        printStatement = amount;
        date = date1;
	}
}







	




      /*public void CreateAccount()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the Customer: ");
        String Name = sc.nextLine();
        this.setCName(Name);
        
        System.out.print("Enter the address of the Customer: ");
        String Address = sc.nextLine();
        this.setCAddress(Address);
        
        System.out.print("Enter the phone no. of the Customer: ");
        String PhoneNo = sc.nextLine();
        this.setCPhoneNo(PhoneNo);
        
        System.out.print("Enter the account no. of the Customer: ");
        String AccountNo = sc.nextLine();
        this.setAccountNo(AccountNo);
    }*/

    /*void showMenu() throws ParseException
    {
        int option = 0;
        int option1 = 0;
        int key=0;
        Scanner obj1 = new Scanner(System.in);
        
        System.out.println("Welcome To Islamic Banking System.\n");
        while(option != 3)
        {
        System.out.println("1. Create Account");
        System.out.println("2. Log In to an Account");
        System.out.println("3. Exit");
        
                System.out.print("Enter the Option No: ");
                option = obj1.nextInt();
                if(option == 1)
                {
                    CreateAccount();
                }

                else if(option == 2)
                {
                    System.out.println("Welcome "+BankAccount.this.getCName());
                    System.out.println("Account number "+BankAccount.this.getAccountNo());
                    System.out.println("\n");
                    while(option1 != 6 )
                    {
                    System.out.println("1.checkBalance");
                    System.out.println("2.makeDeposit");
                    System.out.println("3.makeWithdrawal");
                    System.out.println("4.printStatement");
                    System.out.println("5.Calculate Zakat");
                    
                    System.out.println("6.Exit");

                    
                        System.out.print("Enter the Function No. you want to perform: ");
                        option1 = obj1.nextInt();

                        switch(option1)
                        {
                            case 1:
                                System.out.println("your balance is:"+CBalance+"-Rs");
                                break;

                            case 2:
                                System.out.println("Enter the amount you want to deposit");
                                int amount = obj1.nextInt();
                                System.out.print("Enter the date (Day/Month/Year): ");
                                String date1 = obj1.next();
                                makeDeposit(amount,date1);
                                break;

                            case 3:
                                System.out.println("Enetr the amount you want to withdraw");
                                int amount2 = obj1.nextInt();
                                System.out.print("Enter the date (Day/Month/Year): ");
                                String date2 = obj1.next();
                                makeWithdrawal(amount2,date2);
                                break;

                            case 4:
                                getprintStatement();
                                break;
                                
                            case 5:
                                calculateZakat();
                                break;
                                
                            case 6:
                                
                                break;

                            default:
                                System.out.println("Invalid option. please choose from 1 to 4");
                                break;
                        }
                        System.out.println("Thankyou\n");
                        System.out.println("==========================================\n");
                    }
              }
        }
    }
}

*/
   

//class CheckingAccount extends BankAccount
//{
//    
//}