package org.est;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excellogin {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\selenium8ambatch\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);

		File file = new File("C:\\Users\\admin\\eclipse-workspace\\Sampletext\\Excel\\sampledatainsurance.xlsx");
		FileInputStream sample = new FileInputStream(file);
		Workbook book = new XSSFWorkbook(sample);
		Sheet sheet = book.getSheet("flipkart_login");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);

		int cellType = cell.getCellType();

		double n = cell.getNumericCellValue();
		long l = (long) n;
		String str = String.valueOf(l);
		WebElement txtusername = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		txtusername.sendKeys(str);

		WebElement txtpass = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		txtpass.sendKeys(str);

		WebElement login = driver
				.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		login.click();

	}

}
