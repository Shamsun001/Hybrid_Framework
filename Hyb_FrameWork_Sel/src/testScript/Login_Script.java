package testScript;

import org.testng.annotations.Test;

import generic.Fetch_Data;
import generic.GenericClass;
import pom.Pom;

public class Login_Script extends GenericClass
{
	@Test
	public void test1()
	{
		String un = Fetch_Data.get_data("Sheet1", 0, 0);
		String pwd = Fetch_Data.get_data("Sheet1", 0, 1);
		Pom p = new Pom(driver);
		p.username(un);
		p.password(pwd);
		p.login_btn();
	}
}
