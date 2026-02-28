package com.owl.test;

import org.testng.annotations.Test;
import com.owl.pages.BasePage;
import com.owl.pages.VRCustomExamPage;

public class VRCustomExamTest extends BasePage{
	VRCustomExamPage vrCustomExamPage;
	
	@Test
	public void login() {
		vrCustomExamPage = new VRCustomExamPage(driver);
		vrCustomExamPage.clickOnLoginBtn();
		//vrCustomExamPage.enterEmail();
		vrCustomExamPage.enterPassword();
		vrCustomExamPage.clickOnLoginButton();
	}
	
	@Test(priority = 1, dependsOnMethods = "login")
	public void startACustomExam() {
		vrCustomExamPage = new VRCustomExamPage(driver);
		vrCustomExamPage.clickOnTakeAnExamButton();
		vrCustomExamPage.clickOnVrSubject();
		vrCustomExamPage.selectCompoundWordsStartPracticeButton();
		vrCustomExamPage.clickOnCustomExam();
		vrCustomExamPage.enterNoOfQuestions();
		vrCustomExamPage.enternoOfMinutes();
		vrCustomExamPage.clickOnCreateCustomExamBUtton();
	}
	
	@Test(priority = 2)
	public void attemptAllQuestions() {
		vrCustomExamPage.attemptTheAssessment();
		vrCustomExamPage.clickOnFishExam();
		vrCustomExamPage.clickOnSubmitBtn();
	}
	
	@Test(priority = 3)
	public void checkTheReport() throws InterruptedException {
		vrCustomExamPage.clickOnViewReportButton();
		vrCustomExamPage.clickOnViewDetailedReportButton();
		vrCustomExamPage.readTheCorrectAnswers();
		vrCustomExamPage.readTheWrongAnswers();
		vrCustomExamPage.readTheSkippedAnswers();
	}	
	
	
}
