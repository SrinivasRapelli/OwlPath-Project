package com.owl.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class MathCustomeExamPage {
	
	WebDriver driver;
	
	public MathCustomeExamPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By loginBtn = By.xpath("//button[text()='Login']");
	By email = By.id("email");
	By password = By.id("password");
	By loginbutton = By.xpath("(//button[text()='Login'])[2]");
	
	By takeAnExamBtn = By.xpath("//*[text()=' Take an Exam']");
	By fractionsStartPractice = By.xpath("//*[text()='Fractions']/following-sibling::button");
	By customeExamButton= By.xpath("//*[text()='Create Custom Exam']");
	By noOfQuestions = By.id("questionCount");
	By duration = By.id("duration");
	
	By startbtn = By.xpath("//button[text()='Start']");
	By optionA = By.xpath("//*[text()=\"A\"]");
	By optionB = By.xpath("//*[text()=\"B\"]");
	By nextBtn = By.xpath("//button[text()='Next']");
	By skipBtn = By.xpath("//button[text()='Skip']");
	
	By finishExamBtn = By.xpath("//button[text()=\"Finish Exam\"]");
	By submitBtn = By.xpath("//*[text()='Submit']");
	
	By viewReportBtn = By.xpath("//*[text()= 'View Detailed Report']");
	By viewDetailedReportBtn = By.xpath("//*[text()='View Detailed Report']");
	
	By correctAnswer = By.xpath("//*[text()='Correct Questions']/following-sibling::*[1]");
	By wrongAnswer = By.xpath("//*[text()='Wrong Questions']/following-sibling::*[1]");
	By skippedAnswer = By.xpath("//*[text()='Skipped Questions']/following-sibling::*[1]");
	
	
	
	public void clickOnLoginBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		element.click();
	}
	
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(email));
		element.sendKeys("rahulchandra12345@gmail.com");
	}
	
	public void enterPassword() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		element.sendKeys("Rahul@123");
	}
	
	public void clickOnLoginButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(loginbutton));
		element.click();
	}
	
	public void clickOnTakeAnExamButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(takeAnExamBtn));
		element.click();
	}
	
	public void selectFractionsStartPracticeButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(fractionsStartPractice));
		element.click();
	}
	
	public void clickOnCustomExam() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(customeExamButton));
		element.click();
	}
	
	public void enterNoOfQuestions() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(noOfQuestions));
		element.clear();
		element.sendKeys("10");
	}
	
	public void enternoOfMinutes() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(duration));
		element.clear();
		element.sendKeys("10");
	}

	public void clickOnCreateCustomExamBUtton() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
	}
	
public void attemptTheAssessment() {
		
		for (int i = 1; i <=4; i++) {

		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		    try {
		        WebElement optionAElement =
		            wait.until(ExpectedConditions.elementToBeClickable(optionA));
		        optionAElement.click();
		        
		        WebElement next =
				        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
				    next.click();

		    } catch ( StaleElementReferenceException |TimeoutException e) {
		        WebElement skip =
		            wait.until(ExpectedConditions.elementToBeClickable(skipBtn));
		        skip.click();
		      
		    }

		    
		}

		
		for (int i = 1; i <= 3; i++) {
				driver.findElement(skipBtn).click();
		}
		for (int i = 1; i <= 2; i++) {
			
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

			    try {
			        WebElement optionBElement =
			            wait.until(ExpectedConditions.elementToBeClickable(optionB));
			        optionBElement.click();
			        WebElement next =
					        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
					    next.click();

			    } catch ( StaleElementReferenceException |TimeoutException e) {
			        WebElement skip =
			            wait.until(ExpectedConditions.elementToBeClickable(skipBtn));
			        skip.click();
			    }

		}
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 WebElement optionBElement =
		            wait.until(ExpectedConditions.elementToBeClickable(optionB));
		        optionBElement.click();
		
	}


		public void clickOnFishExam() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement finishexamButton =
			            wait.until(ExpectedConditions.elementToBeClickable(finishExamBtn));
				finishexamButton.click();  
			
		}

		public void clickOnSubmitBtn() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
			 WebElement submitButton =
			            wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
			submitButton.click();
			
		}
		

		public void clickOnViewReportButton() {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement viewReportButton =
			            wait.until(ExpectedConditions.elementToBeClickable(viewReportBtn));
			 viewReportButton.click();
			
		}

		public void clickOnViewDetailedReportButton() throws InterruptedException {
			Thread.sleep(2000);
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement viewdetailedReportButton =
			            wait.until(ExpectedConditions.elementToBeClickable(viewDetailedReportBtn));
			 viewdetailedReportButton.click();
		}
		
		public void readTheCorrectAnswers() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement crtAnswers =
			            wait.until(ExpectedConditions.visibilityOfElementLocated(correctAnswer));
			 String correctAnswers = crtAnswers.getText();
			 System.out.println(correctAnswers);
		}
		
		public void readTheWrongAnswers() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement wrgAnswers =
			            wait.until(ExpectedConditions.visibilityOfElementLocated(wrongAnswer));
			 String wrongAnswer = wrgAnswers.getText();
			 System.out.println(wrongAnswer);
		}

		public void readTheSkippedAnswers() {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			 WebElement spdAnswer =
			            wait.until(ExpectedConditions.visibilityOfElementLocated(skippedAnswer));
			 String skippedAnswer = spdAnswer.getText();
			 System.out.println(skippedAnswer);
		}
}
