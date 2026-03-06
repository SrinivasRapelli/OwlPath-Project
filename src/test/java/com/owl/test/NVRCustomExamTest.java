package com.owl.test;

import org.testng.annotations.Test;

import com.owl.pages.NVRCustomExamPage;
import com.owl.pages.VRCustomExamPage;

public class NVRCustomExamTest extends BaseTest{
	NVRCustomExamPage nvrCustomExamPage ;
	
	
	@Test
	public void login() {
		nvrCustomExamPage = new NVRCustomExamPage(driver);
		nvrCustomExamPage.clickOnLoginBtn();
		nvrCustomExamPage.enterEmail();
		nvrCustomExamPage.enterPassword();
		nvrCustomExamPage.clickOnLoginButton();
	}
	
	@Test(priority = 1)
	public void oddOneOutCustomExam() throws InterruptedException {
		nvrCustomExamPage = new NVRCustomExamPage(driver);
		nvrCustomExamPage.clickOnTakeAnExamButton();
		nvrCustomExamPage.clickOnNVRSubject();
		nvrCustomExamPage.selectOddOneOutStartPracticeButton();
		nvrCustomExamPage.clickOnCustomExam();
		nvrCustomExamPage.enterNoOfQuestions();
		nvrCustomExamPage.enternoOfMinutes();
		nvrCustomExamPage.clickOnCreateCustomExamBUtton();
		nvrCustomExamPage.attemptTheAssessment();
		nvrCustomExamPage.clickOnFishExam();
		nvrCustomExamPage.clickOnSubmitBtn();
		nvrCustomExamPage.clickOnViewReportButton();
		nvrCustomExamPage.clickOnViewAnswersButton();
		nvrCustomExamPage.readTheCorrectAnswers();
		nvrCustomExamPage.readTheWrongAnswers();
		nvrCustomExamPage.readTheSkippedAnswers();
		nvrCustomExamPage.clickOnDashboardButton();
	}
	
	@Test(priority = 2)
	public void reflectionCustomExam() throws InterruptedException {
		nvrCustomExamPage = new NVRCustomExamPage(driver);
		nvrCustomExamPage.clickOnTakeAnExamButton();
		nvrCustomExamPage.clickOnNVRSubject();
		nvrCustomExamPage.selectReflectionStartPracticeButton();
		nvrCustomExamPage.clickOnCustomExam();
		nvrCustomExamPage.enterNoOfQuestions();
		nvrCustomExamPage.enternoOfMinutes();
		nvrCustomExamPage.clickOnCreateCustomExamBUtton();
		nvrCustomExamPage.attemptTheAssessment();
		nvrCustomExamPage.clickOnFishExam();
		nvrCustomExamPage.clickOnSubmitBtn();
		nvrCustomExamPage.clickOnViewReportButton();
		nvrCustomExamPage.clickOnViewAnswersButton();
		nvrCustomExamPage.readTheCorrectAnswers();
		nvrCustomExamPage.readTheWrongAnswers();
		nvrCustomExamPage.readTheSkippedAnswers();
		nvrCustomExamPage.clickOnDashboardButton();
	}
	
	
	@Test(priority = 3)
	public void logout() {
		nvrCustomExamPage.clickOnLogoutButton();
	}
	
	
	
}
