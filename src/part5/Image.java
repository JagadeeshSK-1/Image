package part5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("//img")).click();
		
		//if (driver.getTitle().equals("Facebook - log in or sign up")) {							
          //  System.out.println("We are back at Facebook's homepage");					
        //} else {			
          //  System.out.println("We are NOT in Facebook's homepage");					
       // }		
				driver.close();
		
		

	}

}
