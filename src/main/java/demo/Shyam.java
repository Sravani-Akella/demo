package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Shyam {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://confluence.atlassian.com/bitbucketserver/basic-git-commands-776639767.html");
	System.out.println(driver.getTitle());
	
	System.out.println("good Morning");
	System.out.println("good Evening");
	System.out.println("hai");
	System.out.println("hello");
	System.out.println("bye");
	System.out.println("good afternoon");
	System.out.println("good night");
	System.out.println("are u there");
	System.out.println("I am going out");

	}
	
	

}
