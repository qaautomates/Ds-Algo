package pageobjects;


	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class RegisterPage {

		public WebDriver driver;

		private Helper helper;

		public RegisterPage(WebDriver driver, Helper helper) {
			this.driver = driver;
			this.helper = helper;
			PageFactory.initElements(driver,this);

		}

		@FindBy(xpath = ("//input[@type='submit']"))
		WebElement registerBtn;
		@FindBy(name = ("username"))
		WebElement uName;
		@FindBy(name = ("password1"))
		WebElement passWord;
		@FindBy(name = ("password2"))
		WebElement cPassWord;
		@FindBy(css = ".alert.alert-primary")
		WebElement alert;

		
	
		public void clickHomeGetStartedBtn() {
			helper.homeGetStartedBtn();
		}

		public void clickRegisterLink(String link) {
			helper.clickLink(link);
		}

		public void clickRegisterBtn() {
			registerBtn.click();
		}

		public String validateMessageUname() {

			String validationMessage = uName.getAttribute("validationMessage");
			System.out.println(validationMessage);
			return validationMessage;

		}

		public void enterUname() {
			uName.sendKeys("qaautomates4");
		}

		public void enterUnamePwd() {
			uName.sendKeys("TestQA");
			passWord.sendKeys("September2025$");
		}

		public String validateMessageCpassword() {

			String validationMessage = cPassWord.getAttribute("validationMessage");
			System.out.println(validationMessage);
			return validationMessage;

		}

		public void enterCredentials(String string, String string2, String string3) {
			uName.sendKeys(string);
			passWord.sendKeys(string2);
			cPassWord.sendKeys(string3);

		}

		public String expectedMessage() {

			String expMessage = alert.getText();

			return expMessage;
		}
	}



