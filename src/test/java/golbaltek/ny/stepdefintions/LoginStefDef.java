package golbaltek.ny.stepdefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStefDef {
	WebDriver driver;

	@Given("User is able to open any browser")
	public void user_is_able_to_open_any_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Given("User is able to enter the URL")
	public void user_is_able_to_enter_the_url() {
		driver.navigate().to("https://magento.softwaretestingboard.com/");

	}

	@When("User is able to click on sign in BTN")
	public void user_is_able_to_click_on_sign_in_btn() {
		driver.findElement(By.xpath("//*[@class='page-wrapper']/descendant::a[2]")).click();

	}

	@When("User is able to enter the user name")
	public void user_is_able_to_enter_the_user_name() {
		driver.findElement(By.xpath("(//*[@class='input-text'])[2]")).sendKeys("tanvirpatwary16@gmail.com");
	}

	@When("User is able to enter the password")
	public void user_is_able_to_enter_the_password() {
		driver.findElement(By.xpath("(//*[@class='input-text'])[3]")).sendKeys("Tester01");

	}

	@When("User is able to click on log in BTN")
	public void user_is_able_to_click_on_log_in_btn() {
		driver.findElement(By.xpath("(//*[text()='Sign In'])[1]")).click();
		driver.quit();
	}

	@Then("User is able to verify the user info on the screen")
	public void user_is_able_to_verify_the_user_info_on_the_screen() throws InterruptedException {
		String actual = "Welcome, Tanvir Patwary!";
		Thread.sleep(2000);
		String expected = driver.findElement(By.xpath("//*[text()='Welcome, Tanvir Patwary!']")).getText();
		Thread.sleep(2000);
		Assert.assertEquals(actual, expected);
		System.out.println("My expected and actual result is matched : " + expected);

	}

}