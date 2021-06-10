package seleniumchecking;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fulltestchecking {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brower Name:");
		String browser = sc.nextLine();
		WebDriver driver = null;
		if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\admin\\eclipse-workspace\\seleniumchecking\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("Invalid browser");
		}

		driver.get("https://demoqa.com/automation-practice-form/");

		String title = driver.getTitle();
		System.out.println("And Your page title is :" + title);

		String currentUrl = driver.getCurrentUrl();
		System.out.println("your current url is :" + currentUrl);

		// windows maximized
		driver.manage().window().maximize();
		// windows deleting all cookies
		driver.manage().deleteAllCookies();

		/// getting site input information
		WebElement txtfirstName = driver.findElement(By.id("firstName"));
		txtfirstName.sendKeys("murugan");
		String searchvaluefirstName = txtfirstName.getAttribute("value");
		System.out.println("Your firstName is :" + searchvaluefirstName);

		WebElement txtlastName = driver.findElement(By.id("lastName"));
		txtlastName.sendKeys("Eswaran");
		String searchvaluelastName = txtlastName.getAttribute("value");
		System.out.println("Your lastName is :" + searchvaluelastName);

		WebElement txtuserEmail = driver.findElement(By.id("userEmail"));
		txtuserEmail.sendKeys("murugan@gmail.com");
		String searchvalueuserEmail = txtuserEmail.getAttribute("value");
		System.out.println("Your userEmail is :" + searchvalueuserEmail);

		WebElement txtgender = driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[1]/label"));
		txtgender.click();
		String searchvaluegender = txtgender.getText();
		System.out.println("Your Selected Gender is :" + searchvaluegender);

		WebElement txtuserNumber = driver.findElement(By.id("userNumber"));
		txtuserNumber.sendKeys("8877996699");
		String searchvalueuserNumber = txtuserNumber.getAttribute("value");
		System.out.println("Your Mobile Number is :" + searchvalueuserNumber);

		WebElement dateOfBirthInput = driver.findElement(By.id("dateOfBirthInput"));
		dateOfBirthInput.clear();
		Thread.sleep(1000);
		dateOfBirthInput.sendKeys("04 Dec 2022");
		String dateOfBirthInput_1 = dateOfBirthInput.getAttribute("value");
		System.out.println("Your Subject is :" + dateOfBirthInput_1);
		dateOfBirthInput.sendKeys(Keys.ENTER);

		WebElement Searchbox = driver.findElement(By.id("subjectsInput"));
		Searchbox.sendKeys("English");
		String Searchbox_1 = Searchbox.getAttribute("value");
		System.out.println("Your Subject is :" + Searchbox_1);
		Searchbox.sendKeys(Keys.ENTER);

		WebElement txtcheckbox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean chk = txtcheckbox.isSelected();
		System.out.println("IS checkbox is NOT Enable :" + chk);
		txtcheckbox.click();
		String txtcheckbox1 = txtcheckbox.getText();
		System.out.println("Your Selected box  is :" + txtcheckbox1);

		WebElement txtcheckbox2 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
		boolean chk2 = txtcheckbox2.isSelected();

		// if already checkbox is clicked else path will execute .in my conditon bo
		// button is selected so
		// false inside will execute!!!!!!!!!

		if (chk2 == false) {
			System.out.println("IS checkbox is NOT Enable :" + chk2);
			txtcheckbox2.click();
			String txtcheckbox_2 = txtcheckbox2.getText();
			System.out.println("Your Selected box is :" + txtcheckbox_2);

		} else {
			System.out.println("button is not selected");
		}

		WebElement txtcheckbox3 = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-3']"));
		boolean chk3 = txtcheckbox3.isSelected();
		System.out.println("IS checkbox is NOT Enable :" + chk3);
		txtcheckbox3.click();
		String txtcheckbox_3 = txtcheckbox3.getText();
		System.out.println("Your Selected box is :" + txtcheckbox_3);

		WebElement fileInput = driver.findElement(By.id("uploadPicture"));
		fileInput.sendKeys("C:\\Users\\admin\\Pictures\\capture.JPG");
		System.out.println("File is Uploaded Successfully");

		String uploadfile = fileInput.getAttribute("value");
		System.out.println("your upload file name is :" + uploadfile);

		WebElement Address = driver.findElement(By.id("currentAddress"));
		Address.sendKeys("13 chennai tamilnadu india ");
		String Address_1 = Address.getAttribute("value");
		System.out.println("your Enter Addressis :" + Address_1);

		WebElement State = driver.findElement(By.id("react-select-3-input"));
		State.sendKeys("NCR");
		String State_1 = State.getAttribute("value");
		System.out.println("your Enter State is :" + State_1);
		State.sendKeys(Keys.ENTER);

		WebElement City = driver.findElement(By.id("react-select-4-input"));
		City.sendKeys("Gurgaon");
		String City_1 = City.getAttribute("value");
		System.out.println("your Enter State is :" + City_1);
		City.sendKeys(Keys.ENTER);

		WebElement subbutton = driver.findElement(By.id("submit"));
		subbutton.click();

		Thread.sleep(3000);
		WebElement popclose = driver.findElement(By.id("closeLargeModal"));
		popclose.click();

	}

}
