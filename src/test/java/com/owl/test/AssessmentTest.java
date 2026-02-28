package com.owl.test;

import org.testng.annotations.Test;
import com.owl.pages.AssessmentPage;

public class AssessmentTest extends BaseTest {
	
	static AssessmentPage assessmentPage;

	@Test(priority = 0)	
	public void enterTheForm() throws InterruptedException {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.clickBaseLineAssessmentButton();
		assessmentPage.enterStudentName();	
		assessmentPage.enterEmail();
		assessmentPage.selectYear();
		
	}
	
	@Test(priority = 1)
	public void startTheAssessment() throws InterruptedException {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.ClickOnTakeFreeAssessmentButton();
		assessmentPage.clickStartButton();

	}
	
	@Test(priority = 2)
	public void attemptTheQuestions() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.attemptTheAssessment();

	}
	
	@Test(priority = 3)
	public void finishTheAssessment() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.clickOnFishExam();

	}
	
	@Test(priority = 4)
	public void submitTheAssessment() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.clickOnSubmitBtn();
	}
	
	@Test(priority = 5)
	public void clickOnViewReportButton() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.clickOnViewReportButton();

	}
	
	@Test(priority = 6)
	public void ClickOnViewDeatiledReportButton() throws InterruptedException {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.clickOnViewDetailedReportButton();
	}
	
	@Test(priority = 7)
	public void noOfCorrectAnsweredQuestions() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.readTheCorrectAnswers();
	}
	
	@Test(priority = 8)
	public void noOfWrongAnsweredQuestions() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.readTheWrongAnswers();
	}
	
	@Test(priority = 9)
	public void noOfSkippedAnsweredQuestions() {
		assessmentPage = new AssessmentPage(driver);
		assessmentPage.readTheSkippedAnswers();
	}
}