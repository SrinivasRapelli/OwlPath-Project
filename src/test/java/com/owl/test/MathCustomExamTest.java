package com.owl.test;

import org.testng.annotations.Test;

import com.owl.pages.MathCustomeExamPage;

public class MathCustomExamTest extends BaseTest{
	
	MathCustomeExamPage mathCustomeExamPage;
	
	@Test(priority = 0)
	public void login() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnLoginBtn();
		mathCustomeExamPage.enterEmail();
		mathCustomeExamPage.enterPassword();
		mathCustomeExamPage.clickOnLoginButton();
	}
	
	
	@Test(priority = 1)
	public void fractionsCustomExam() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectFractionsStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewAnswersButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
		mathCustomeExamPage.clickOnDashboardButton();
	}
	
	
	@Test(priority = 2)
	public void additionCustomExam() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectAdditionStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewAnswersButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
		mathCustomeExamPage.clickOnDashboardButton();
	}
	
	@Test(priority = 3)
	public void placeValueCustomExam() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectPlacevalueStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewAnswersButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
		mathCustomeExamPage.clickOnDashboardButton();
	}
	
	@Test(priority = 4)
	public void subtractionCustomExam() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectSubtractionStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewAnswersButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
		mathCustomeExamPage.clickOnDashboardButton();
	}
	
	@Test(priority = 5)
	public void FactorsMultiplesandPrimeNumbersCustomExam() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectFactorsMultiplesPracticeStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewAnswersButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
		mathCustomeExamPage.clickOnDashboardButton();
	}
	
	@Test(priority = 6)
	public void additionAndSubtractionWordProblemsCustomExam() throws InterruptedException {
		mathCustomeExamPage = new MathCustomeExamPage(driver);
		mathCustomeExamPage.clickOnTakeAnExamButton();
		mathCustomeExamPage.selectAdditionAndSubtractionWordProblemsPracticeStartPracticeButton();
		mathCustomeExamPage.clickOnCustomExam();
		mathCustomeExamPage.enterNoOfQuestions();
		mathCustomeExamPage.enternoOfMinutes();
		mathCustomeExamPage.clickOnCreateCustomExamBUtton();
		mathCustomeExamPage.attemptTheAssessment();
		mathCustomeExamPage.clickOnFishExam();
		mathCustomeExamPage.clickOnSubmitBtn();
		mathCustomeExamPage.clickOnViewReportButton();
		mathCustomeExamPage.clickOnViewAnswersButton();
		mathCustomeExamPage.readTheCorrectAnswers();
		mathCustomeExamPage.readTheWrongAnswers();
		mathCustomeExamPage.readTheSkippedAnswers();
		mathCustomeExamPage.clickOnDashboardButton();
	}
	
	
	@Test(priority = 7)
	public void logout() {
		mathCustomeExamPage.clickOnLogoutButton();
	}
	
	
}
