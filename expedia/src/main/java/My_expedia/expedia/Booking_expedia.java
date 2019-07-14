package My_expedia.expedia;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking_expedia {
	
	  WebDriver driver;

	    @FindBy(xpath= "//button[@id='tab-flight-tab-hp']")
	    WebElement myFlightlink;

	    @FindBy(xpath = "//*[@id=\"flight-origin-hp-flight\"]")
	    WebElement originInput;


	    @FindBy(xpath = "//*[@id=\"aria-option-0\"]")
	    WebElement originSelect;
	    // this is changed according to the parameter you entered in the Input lable



	    @FindBy(xpath = "//*[@id=\"flight-destination-hp-flight\"]")
	    WebElement destinationInput;


	    @FindBy(xpath= "//*[@id=\"typeaheadDataPlain\"]/div/li[1]")
	    WebElement destinationSelect;
	    // this is changed according to the parameter you entered in the Input lable


	    @FindBy(xpath = "//*[@id=\"flight-departing-hp-flight\"]")
	    WebElement departurDate;

	    @FindBy(xpath= "//*[@id=\"flight-returning-hp-flight\"]")
	    WebElement returningDate;

	    @FindBy(xpath= "//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[3]/td[7]/button")
	    WebElement selectDeptDate;

	    @FindBy(xpath= "//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div/div[3]/table/tbody/tr[4]/td[3]/button")
	    WebElement selectRetDate;

	    @FindBy(xpath = "//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button[@type=\"submit\"][@class=\"btn-primary btn-action gcw-submit\"]")
	    WebElement searchButton;

	    @FindBy(xpath = "//*[@id=\"flight-module-2019-07-20t23:15:00+03:00-coach-add-fco-et-702-coach-fco-iad-ua-43_2019-08-20t17:20:00-04:00-coach-iad-cdg-ua-915-coach-cdg-add-et-705_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
	    WebElement searchDepartureFlightButton;

	    @FindBy(xpath = "//*[@id=\"flight-module-2019-07-20t23:15:00+03:00-coach-add-fco-et-702-coach-fco-iad-ua-43_2019-08-20t17:20:00-04:00-coach-iad-cdg-ua-915-coach-cdg-add-et-705_\"]/div[1]/div[1]/div[2]/div/div[2]/button")
	    WebElement searchArrivaleFlightButton;

	    @FindBy(xpath= "//*[@id=\"forcedChoiceNoThanks\"]")
	    WebElement noThanksLink;

	      @FindBy(xpath = "//*[@id=\"bookButton\"]")
	      WebElement continueBookingButton;

	      @FindBy(xpath= "//*[@id=\"firstname[0]\"]")
	      WebElement firstNameInputLable;

	      @FindBy(xpath= "//*[@id=\"middlename[0]\"]")
	      WebElement middelNameInputLable;

	      @FindBy(xpath= "//*[@id=\"lastname[0]\"]")
	      WebElement lastNameInputLable;

	      @FindBy(xpath = "//*[@id=\"phone-number[0]\"]")
	      WebElement phoneInputLable;
	      @FindBy(xpath = "//*[@id=\"gender_female[0]\"]")
	      WebElement femaleRadioButton;

	      @FindBy(xpath = "//*[@id=\"gender_male[0]\"]")
	      WebElement maleRadioButton;

	  

	      @FindBy(xpath = "//*[@id=\"date_of_birth_month0\"]")
	      WebElement monthDobSelect;

	      @FindBy(xpath= "//*[@id=\"date_of_birth_day[0]\"]")
	      WebElement dayDobSelect;

	      @FindBy(xpath = "//*[@id=\"date_of_birth_year[0]\"]")
	      WebElement yearDobSelect;

	      @FindBy(xpath= "//*[@id=\"insuranceOffering0\"]/div[4]")
	      WebElement flightProtectionYesRadioButton;

	      @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input")
	      WebElement cardholderNameInputLable;

	      @FindBy(xpath= "//*[@id=\"creditCardInput\"]")
	      WebElement cardNumberInputLable;

	      @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[1]/select")
	      WebElement cardMonthSelect;

	      @FindBy(xpath= "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[2]/select")
	      WebElement cardYearSelect;

	      @FindBy(xpath = "//*[@id=\"new_cc_security_code\"]")
	      WebElement cardSecurityInputLable;

	      @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input")
	      WebElement billingAddressInputLable;

	      @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[2]/input")
	      WebElement billingSuitInputLable;

	      @FindBy(xpath= "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input")
	      WebElement cityInputLable;

	      @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select")
	      WebElement stateSelect;

	      @FindBy(xpath = "//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select")
	      WebElement zipcodeInputLable;

	      @FindBy(xpath= "//*[@id=\"email\"]/div[1]/fieldset/label/input")
	      WebElement emailInputLable;

	      @FindBy(xpath= "//*[@id=\"account-creation\"]/fieldset/label[1]/input")
	      WebElement passwordInputLable;

	      @FindBy(xpath= "//*[@id=\"account-creation\"]/fieldset/label[2]/input")
	      WebElement confirmpassInputLable;

	      @FindBy(xpath= "//*[@id=\"complete-booking\"]")
	      WebElement completBookingButton;

	    public Booking_expedia(WebDriver driver){
	        this.driver=driver;
	    }

	    public void flightBokking(String ori, String dest) {

	        myFlightlink.click();
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        originInput.sendKeys(ori);
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        originSelect.click();

	        destinationInput.sendKeys(dest);
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        destinationSelect.click();

	        departurDate.click();
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        selectDeptDate.click();
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        returningDate.click();
	        try {
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        selectRetDate.click();
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        searchButton.click();

	        try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        WebDriverWait wait = new WebDriverWait(driver, (30));
	        wait.until(ExpectedConditions.elementToBeClickable(searchDepartureFlightButton));
	       
	        searchDepartureFlightButton.click();

	       
	        try {
	            Thread.sleep(4000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	        WebDriver wd = this.driver;
	        String Tab1 = wd.getWindowHandle();
	        ArrayList<String> availableWindows = new ArrayList<String>(wd.getWindowHandles());
	        if (!availableWindows.isEmpty()) {
	            wd.switchTo().window(availableWindows.get(0));
	        }
	        
	        searchArrivaleFlightButton.click();

	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        
	     
	        
	        
	  //      noThanksLink.click();

	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        WebDriver wdr = this.driver;
	        String Tab2 = wd.getWindowHandle();
	        ArrayList<String> availableWindow = new ArrayList<String>(wdr.getWindowHandles());
	        if (!availableWindow.isEmpty()) {
	            wdr.switchTo().window(availableWindow.get(2));
	        }

	        JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
	        scroll2.executeScript("arguments[0].scrollIntoView(true);", continueBookingButton);
	        continueBookingButton.click();


	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }

	    public void personalInfo(String fname, String mname, String lname, String phoneno, String gender, int month, String day, String year ) {
	        firstNameInputLable.sendKeys(fname);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        middelNameInputLable.sendKeys(mname);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        lastNameInputLable.sendKeys(lname);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        phoneInputLable.sendKeys(phoneno);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        if (gender.equalsIgnoreCase("female")) {
	            femaleRadioButton.click();
	            try {
	                Thread.sleep(3000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        } else if (gender.equalsIgnoreCase("male")) {
	            maleRadioButton.click();
	            try {
	                Thread.sleep(3000);
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("Unknown Gender Entered");
	        }

	        JavascriptExecutor temp = (JavascriptExecutor) driver;
	        temp.executeScript("arguments[0].scrollIntoView(true);", monthDobSelect);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        monthDobSelect.click();
	        Select mnt = new Select(monthDobSelect);
	        mnt.selectByIndex(month);

	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        dayDobSelect.click();
	        Select da = new Select(dayDobSelect);
	        da.selectByValue(day);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        yearDobSelect.click();
	        Select yr = new Select(yearDobSelect);
	        yr.selectByVisibleText(year);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        flightProtectionYesRadioButton.click();
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        JavascriptExecutor temp1 = (JavascriptExecutor) driver;
	        temp1.executeScript("arguments[0].scrollIntoView(true);", flightProtectionYesRadioButton);
	    }
	    public void cardInfo( String cardName, String cardNumber, int crmonth, String cryear, String cvvNumber) {
	        cardholderNameInputLable.sendKeys(cardName);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        cardNumberInputLable.sendKeys(cardNumber);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        JavascriptExecutor temp2 = (JavascriptExecutor) driver;
	        temp2.executeScript("arguments[0].scrollIntoView(true);", cardNumberInputLable);

	        cardMonthSelect.click();
	        Select crdmn = new Select(cardMonthSelect);
	        crdmn.selectByIndex(crmonth);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        cardYearSelect.click();
	        Select cryr = new Select(cardYearSelect);
	        cryr.selectByVisibleText(cryear);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        cardSecurityInputLable.sendKeys(cvvNumber);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }


	        JavascriptExecutor temp3 = (JavascriptExecutor) driver;
	        temp3.executeScript("arguments[0].scrollIntoView(true);", cardSecurityInputLable);
	    }

	    public void billingAddressInfo(String address1, String address2, String city, String state, String zipcode, String email, String pass, String confpass ){

	        billingAddressInputLable.sendKeys(address1);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        billingSuitInputLable.sendKeys(address2);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        cityInputLable.sendKeys(city);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	        stateSelect.click();
	        Select stat = new Select(stateSelect);
	        stat.selectByVisibleText(state);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        JavascriptExecutor temp4 = (JavascriptExecutor)driver;
	        temp4.executeScript("arguments[0].scrollIntoView(true);",stateSelect);


	        zipcodeInputLable.sendKeys(zipcode);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        emailInputLable.sendKeys(email);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        passwordInputLable.sendKeys(pass);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        confirmpassInputLable.sendKeys(confpass);
	        try {
	            Thread.sleep(3000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        JavascriptExecutor temp5 = (JavascriptExecutor)driver;
	        temp5.executeScript("arguments[0].scrollIntoView(true);",completBookingButton);

	        completBookingButton.click();

	    }
	}


