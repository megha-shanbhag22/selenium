package com.red;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testng.RedFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

////public class Redd {
////	WebDriver driver;
////	RedFactory log;
////	
////	@Given("user is on the home page of Rediff")
////	public void user_is_on_the_home_page_of_rediff() {
////		driver=new ChromeDriver();
////        driver.get("https://www.rediff.com/");
////        WebDriverManager.chromedriver().setup();
////	}
////	@When("^User enter (.*)$")
////	public void user_enter(String key) {
////		log=new RedFactory(driver);
////        log.swags(key);
////	}
////	
////	@When("user gives keyword in search feild")
////	public void user_gives_keyword_in_search_feild(DataTable keyword) {
////	    log=new RedFactory(driver);
////	    List<String> cells=keyword.asList(String.class);
////	    log.swags(cells.get(1));
////	}
////	@When("User clicks on search btn")
////	public void user_clicks_on_search_btn() {
////		log.clickbtn();
////	}
////	@Then("Search should be successful")
////	public void search_should_be_successful() {
////		Assert.assertEquals(false,false);
////	}
//	
//	public class Redd {
//	    WebDriver driver;
//	    RedFactory red;
//
//	    @Given("user is on create account page")
//	    public void user_is_on_create_account_page() {
//	        WebDriverManager.chromedriver().setup();
//	          driver = new ChromeDriver();         // creating web-driver instance
//	          driver.get("http://register.rediff.com/register/register.php?FormName=user_details"); 
//	          //driver.manage().window().maximize();
//	    }
//	    
//	    
////	    @When("user enters full_name , mailId , password , alternateMailId , mobileNo")
////	    public void user_enters_full_name_mail_id_password_alternate_mail_id_mobile_no(DataTable data) {
////	       red=new RedFactory(driver);
////	       List<String> list= data.asList(String.class);
////	       red.swags(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4));
////	    }
//	    
//	    
//	    @When("data full_name , mailId , password , repassword , alternateMailId , mobileNo is entered from excel sheet")
//	    public void data_full_name_mail_id_password_repassword_alternate_mail_id_mobile_no_is_entered_from_excel_sheet(DataTable key) throws IOException {
//	        red=new RedFactory(driver);
//	        
//	        
////	        List<String> list= key.asList(String.class);
////	        red.swags(list.get(0), list.get(1), list.get(2), list.get(3), list.get(4), list.get(5));
////	        
////	        List<List<String>> list=key.asLists(String.class);
////	      for (List<String> columns : list) 
////	       red.swags(columns.get(0), columns.get(1), columns.get(2), columns.get(3), columns.get(4), columns.get(5));
//	        
//	        
//	        File file1=new File("C:\\Training\\JavaSelenium\\snapdealapp\\ExcelData\\reddata.xlsx");
//	        FileInputStream fos=new FileInputStream(file1);
//	        Workbook w=new XSSFWorkbook(fos);
//	        Sheet s=w.getSheetAt(0);
//
//	        String cellValue1=s.getRow(0).getCell(0).getStringCellValue();
//	        String cv2=s.getRow(0).getCell(1).getStringCellValue();
//	        String cv3=s.getRow(0).getCell(2).getStringCellValue();
//	        String cv4=s.getRow(0).getCell(3).getStringCellValue();
//	        String cv5=s.getRow(0).getCell(4).getStringCellValue();
//	        String cv6=s.getRow(0).getCell(5).getStringCellValue();
//
//	        red.swags(cellValue1, cv2, cv3, cv4,cv5,cv6);
//	    }
//
//	    @When("click on create my account button")
//	    public void click_on_create_my_account_button() {
//	      red.clickbtn();
//	    }
//	    @Then("The message box should display")
//	    public void the_message_box_should_display() {
//
//	    }
//	}


public class Redd {
	WebDriver driver;
	RedFactory red;

 

    
    @Given("user should be on homepage")
    public void user_should_be_on_homepage() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();         // creating web-driver instance
        driver.get("http://register.rediff.com/register/register.php?FormName=user_details"); 
        //driver.manage().window().maximize();

    }
    @When("user should click create account link")
    public void user_should_click_create_account_link() {

    }
    @When("user enters full keyword,redmail1,pass1,conpass1,altmail1,mobno1")
    public void user_enters_full_keyword_redmail1_pass1_conpass1_altmail1_mobno1() throws IOException {
        red=new RedFactory(driver);
       
        File file1=new File("C:\\Training\\JavaSelenium\\snapdealapp\\ExcelData\\RedData.xlsx");
        FileInputStream fos=new FileInputStream(file1);
        Workbook w=new XSSFWorkbook(fos);
        Sheet s=w.getSheetAt(0);
        //System.out.println(s);
        String cellValue1=s.getRow(0).getCell(0).getStringCellValue();
        String cv2=s.getRow(0).getCell(1).getStringCellValue();
        String cv3=s.getRow(0).getCell(2).getStringCellValue();
        String cv4=s.getRow(0).getCell(3).getStringCellValue();
        String cv5=s.getRow(0).getCell(4).getStringCellValue();
        
        red.swags(cellValue1, cv2, cv3, cv4,cv5);


    }

    @And("click on create my account button")
    public void click_on_create_my_account_button() {
        red.clickbtn();

    }
    @Then("The message box should display")
    public void the_message_box_should_display() {
        //driver.close();

    }

 

 

}