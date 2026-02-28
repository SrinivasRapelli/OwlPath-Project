package com.owl.test;

import org.testng.annotations.Test;

import com.owl.pages.BasePage;
import com.owl.pages.MathCustomeExamPage;

public class MathCustomExamTest extends BasePage {
	
	MathCustomeExamPage mathCustomeExamPage;
	
	@Test(priority = 0)
	public void login() {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnLoginBtn();
		mathCustomeExamPage.enterEmail();
		mathCustomeExamPage.enterPassword();
		mathCustomeExamPage.clickOnLoginButton();
	}
	
	@Test(priority = 1)
	public void startACustomExam() {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectFractionsStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
	}
	
	@Test(priority = 2)
	public void attemptAllQuestions() {
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
	}
	
	@Test(priority = 3)
	public void checkTheReport() throws InterruptedException {
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewDetailedReportButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
	}
	
	
}
