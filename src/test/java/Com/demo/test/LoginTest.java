package Com.demo.test;

import org.testng.annotations.Test;

import com.demo.action.BaseClass;
import com.demo.action.LoginAction;

public class LoginTest extends BaseClass {
	
  @Test
  public void f() {
	  LoginAction act = new LoginAction();
	  
	  act.login();
	  System.out.print("ankita123");
	  
  }
}
