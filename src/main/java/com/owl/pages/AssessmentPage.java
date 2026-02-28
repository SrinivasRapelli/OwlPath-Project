package com.owl.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class AssessmentPage{
	
	WebDriver driver;
	
	public AssessmentPage( WebDriver driver) {
		this.driver = driver;
	}
	
	By baselineAssessmentButton = By.xpath("//button[text() = 'Baseline Assessment']");
	By studentName = By.id("studentName");
	By emailAddress = By.id("emailAddress");
	By year = By.id("year");
	By takeFreeAssessmentButton = By.xpath("//button[text()='Take Free Assessment']");
	By startbtn = By.xpath("//button[text()='Start']");
	By optionA = By.xpath("//*[text()=\"A\"]");
	By optionB = By.xpath("//*[text()=\"B\"]");
	By optionC = By.xpath("//*[text()=\"C\"]");
	By optionD = By.xpath("//*[text()=\"D\"]");
	By optionE = By.xpath("//*[text()=\"E\"]");
	By nextBtn = By.xpath("//button[text()='Next']");
	By skipBtn = By.xpath("//button[text()='Skip']");
	By questionNumber26 = By.xpath("(//*[text()=\"26\"])[3]");
	By finishExamBtn = By.xpath("//button[text()=\"Finish Exam\"]");
	By number30 = By.xpath("(//*[text()='30'])[3]");
	By submitBtn = By.xpath("//*[text()='Submit']");
	By viewReportBtn = By.xpath("//*[text()= 'View Detailed Report']");
	By viewDetailedReportBtn = By.xpath("//*[text()='View Detailed Report']");
	
	By correctAnswer = By.xpath("//*[text()='Correct Questions']/following-sibling::*[1]");
	By wrongAnswer = By.xpath("//*[text()='Wrong Questions']/following-sibling::*[1]");
	By skippedAnswer = By.xpath("//*[text()='Skipped Questions']/following-sibling::*[1]");
	
	
	public void clickBaseLineAssessmentButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elemet =  wait.until(ExpectedConditions.visibilityOfElementLocated(baselineAssessmentButton));
		elemet.click();
	}
	
	public void enterStudentName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(studentName));
		element.sendKeys("Srini");
	}
	
	public void enterEmail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(emailAddress));
		element.sendKeys("Sreenmaahi@gmail.com");
	}
	
	public void selectYear() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement element =  wait.until(ExpectedConditions.visibilityOfElementLocated(year));
		//WebElement yearDD = driver.findElement(year);
		Select select = new Select(element);
		select.selectByValue("Year 4");
	}
	
	public void ClickOnTakeFreeAssessmentButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elemet =  wait.until(ExpectedConditions.visibilityOfElementLocated(takeFreeAssessmentButton));
		elemet.click();
	}
	
	public void clickStartButton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement elemet =  wait.until(ExpectedConditions.visibilityOfElementLocated(startbtn));
		elemet.click();
		Thread.sleep(5000);
	}
	
	public void attemptTheAssessment() {
		
		for (int i = 0; i < 10; i++) {

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

		
		for (int i = 0; i < 10; i++) {
				driver.findElement(skipBtn).click();
		}
		for (int i = 0; i < 9; i++) {
			
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
			
//		
//		 WebElement viewReportButton =
//			            wait.until(ExpectedConditions.elementToBeClickable(viewReportBtn));
//		 viewReportButton.click();
//		   
		
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


