import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class test {
	SavingsAccount obj; 
	BankAccount obj3;
@Before
public void before()
{
	obj = new SavingsAccount(2, "hamza rehan","1234","123","234",30000);
}
			

public void setNameTest() {
	String name = "Hamza Rehan";
	obj.setCName(name);
	assertEquals(obj.getCName(),"Hamza Rehan");
}

	@Test
	public void test2() {
		obj3.setAccountNo("1234");
	}
	@Test
	public void test3()
	{
		obj3.setBalance(30000);
	}
	@Test
	public void test4()
	{
		obj3.setCAddress("house #1401,street 89");
	}
	@Test
	public void getsetCPhoneNoTest() {
		int p = obj3.getCPhoneNo();
		assertTrue(p == 28761);
	}
	@Test
	public void test6()
	{
		obj3.calculateZakat();
	}
	@Test
	public void test7()
	{
		obj3.transferAmount();
	}
	@Test
	public void MakeDepositTest() {
		double expectedBalance = obj.getBalance();
		obj3.MakeDeposit(30000);
		expectedBalance+=30000;
		assertTrue(expectedBalance==obj.getBalance());
	}
	
	@Test
	public void test10()
	{
		try {
			obj.getprintStatement();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}


