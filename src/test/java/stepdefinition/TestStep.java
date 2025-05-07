package stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestStep {
	
	ChromeDriver driver;

	WebElement choosfile ;

	@Given("user is on file uploading page")
	public void user_is_on_file_uploading_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");;
	}

	@And("user should have the file in his local repository")
	public void user_should_have_the_file_in_his_local_repository() {
		System.out.println("User has the file in his local repository");
		
	}

	@When("user click on choos file button")
	public void user_click_on_choos_file_button() {
		choosfile =driver.findElement(By.className("upload_txt"));
		choosfile.click();
		
	}

	@When("user will be naivigated to select the file which need to upload")
	public void user_will_be_naivigated_to_select_the_file_which_need_to_upload() {
		
		choosfile.sendKeys("C:\\Users\\SHAIKJ\\eclipse-workspace\\Thak ouhuf.txt");
	}

	@When("user will select file and click on open")
	public void user_will_select_file_and_click_on_open() throws AWTException{
		Robot rb=new  Robot();
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
			}

	@When("user will check the check box of terms and services")
	public void user_will_check_the_check_box_of_terms_and_services() {
		
		WebElement checkBox= driver.findElement(By.name("terms"));
		checkBox.click();
		
	}

	@Then("user will click on submite button")
	public void user_will_click_on_submite_button() {
		
		WebElement Button= driver.findElement(By.id("submitbutton"));
		Button.click();
		
	}

}
