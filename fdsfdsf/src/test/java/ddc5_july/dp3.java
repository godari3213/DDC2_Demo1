package ddc5_july;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class dp3 {
@Parameters({"Browser", "OS"})
@Test
  public void login(String Browser, String OS) {
	  System.out.println("code for login");
	  System.out.println(Browser);
	  System.out.println(OS);
  }
@Parameters({"Browser", "OS"})
  @Test
  public void logout(String Browser, String OS) {
	  System.out.println("code for logout");
	  System.out.println(Browser);
	  System.out.println(OS);
  }
}
