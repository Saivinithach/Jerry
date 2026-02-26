package mavenpractice;

import org.testng.annotations.Test;

public class MavenPractice_Test 
{
	@Test
	public void mavenPracticeTest()
	{
		System.out.println("Hello! Maven");
		String Browser=System.getProperty("browser");
		
		System.out.println(Browser);
	}
}
