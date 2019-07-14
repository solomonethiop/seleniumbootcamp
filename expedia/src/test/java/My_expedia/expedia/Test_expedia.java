package My_expedia.expedia;

import org.testng.annotations.Test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;


public class Test_expedia {
	 WebDriver driver;

	    @Test
	  public  void create() {
	        driver = Openbrowser_factory.getDriver1("chrome","http://www.expedia.com");
	        Booking_expedia execute = PageFactory.initElements(driver, Booking_expedia.class);
	        execute.flightBokking(" Addis" , " dulles");
	        execute.personalInfo("Solo","Iceland","Purple","3012345676","Male",07,"04","1998");
	        execute.cardInfo("Solo Iceland Purple","2345345634575678",04,"2023","567");
	        execute.billingAddressInfo("sdfsdgs","sgsgsfg","dsfdfsdf","MD","20990","sfadf@gmail.com","sgsg12","sgsg12");

  }
	 
  
  
  @AfterSuite
  public void afterSuite() {
	 
  }}


