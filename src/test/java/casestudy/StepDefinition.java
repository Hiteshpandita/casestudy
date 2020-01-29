package casestudy;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver;
	@Given("^user open TestMeApp")
	public void useropenTestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Driver\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		}
	@When("^user click signin$")
	public void userclicksignup() {
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		}
	@When("^user enter credentials as$")
	public void entercredentials(DataTable dt)
	{
		List<String> cred =dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));
		driver.findElement(By.name("Login")).click();
	}
	
	@When("^enter user name as \"([^\"]*)\"$")
	public void enterusername(String username) {
		driver.findElement(By.id("userName")).sendKeys(username);
	}
	@When("^enter first name as \"([^\"]*)\"$")
	public void enterfirstname(String firstname) {
		driver.findElement(By.id("firstName")).sendKeys(firstname);
	}
	@When("^enter last name as \"([^\"]*)\"$")
	public void enterlastname(String lastname) {
		driver.findElement(By.id("lastName")).sendKeys(lastname);
	}
	@When("^enter password as \"([^\"]*)\"$")
	public void enterpasswordas(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@When("^enter confirm password as \"([^\"]*)\"$")
	public void confirmpasswordas(String confirmpassword) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(confirmpassword);
	}
	@When("^user select gender as \"([^\"]*)\"$")
	public void entergenderas(String gender) {
		List <WebElement>allradiobuttons=driver.findElements(By.id("gender"));
		allradiobuttons.get(0).click();
	}
	@When("^enter email as \"([^\"]*)\"$")
	public void enteremailas(String email) {
		driver.findElement(By.id("emailAddress")).sendKeys(email);
	}
	@When("^enter mobile as \"([^\"]*)\"$")
	public void entermobileno(String mobile) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mobile);
	}
	@When("^enter dob as \"([^\"]*)\"$")
	public void enterdob(String dob) {
		driver.findElement(By.id("dob")).sendKeys(dob);
	}
	@When("^enter address as \"([^\"]*)\"$")
	public void enterAddress(String address) {
		driver.findElement(By.id("address")).sendKeys(address);
	}
	@When("^select security question as \"([^\"]*)\"$")
	public void securityquestion(String securityQuestion) {
		WebElement dropdown = driver.findElement(By.name("securityQuestion"));
		Select s =new Select(dropdown);
		s.selectByIndex(1);
	}
	
	@When("^enter answer as \"([^\"]*)\"$")
	public void enteranswer(String answer) {
		driver.findElement(By.id("answer")).sendKeys(answer);
	}
	@When("^user click Register$")
	public void userclickRegister() {
		driver.findElement(By.xpath("//input[@value='Register']")).click();
	}
}
