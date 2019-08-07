package pageobject;




import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

public class gojekPageObject {
	
	
	//Initalizing the Webdriver
	
	WebDriver driver;
	 
	 //Creating the objects of all web elements
	
	    @FindBy(linkText="BUY NOW")
	     WebElement buynowbtn;   
	 
	    @FindBy(className="cart-checkout")
	     WebElement cartcheckoutbtn;
	    
	    @FindBy(id="snap-midtrans")
	     WebElement iframe1;
	     
	    @FindBy(className="button-main-content")
	     WebElement continuebtn;
	    
	    @FindBy(xpath="//*[@id=\"payment-list\"]/div[1]/a")
	     WebElement creditcardbtn;
	    
	    @FindBy(name="cardnumber")
	     WebElement creditcardnum;
	    
	    @FindBy(xpath ="//input[@placeholder='MM / YY']")
	     WebElement creditcardexp;
	    
	    @FindBy(xpath ="//input[@placeholder='123']")
	     WebElement creditcardcvv;
	    
	    @FindBy(className ="button-main-content")
	     WebElement paynowbtn;
	    
	    @FindBy(xpath =".//iframe[contains(@src, 'https://api.sandbox.veritrans.co.id/v2/token/rba/redirect/')]")
	    WebElement iframe2;
	    
	    @FindBy(xpath ="//*[@id=\"PaRes\"]")
	     WebElement pwdtext;
	    
	    @FindBy(name ="ok")
	     WebElement okbtn;
	    
	    @FindBy(xpath =".//div[@class='text-failed']")
	     WebElement createacctitle;
	   
	   
	   //Initilizing all the web elements at one by using the Page Factory
	    
	    public gojekPageObject(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	        PageFactory.initElements(driver, this);
	    }
	    
	    public void Click_on_Buynow(){
	    	
			
	    }
	    public void Click_on_Checkout(){
	    
			
		}
	    
	    public void Switch_to_iframe1(){
	    	   	
	    	
	    }
	   
			
			
		}
	    
	    
	        
	 
	    
	    
	    
	    
	    
	    
	   
	    
	    
	    
	    

