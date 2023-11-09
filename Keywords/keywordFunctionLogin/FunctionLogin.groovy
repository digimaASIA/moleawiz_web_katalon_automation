package keywordFunctionLogin
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException
import com.kms.katalon.core.webui.common.WebUiCommonHelper


class FunctionLogin {
	/**
	 * Function automation captcha
	 */
	@Keyword
	def automationCaptcha() {
		def captcha1 = WebUI.getText(findTestObject('Object Login/captcha_Num1_Login'))
		def intCaptcha1 = captcha1.toInteger()

		def captcha2 = WebUI.getText(findTestObject('Object Login/captcha_Num2_Login'))
		def intCaptcha2 = captcha2.toInteger()
		def yourAnswer = intCaptcha1 + intCaptcha2

		WebUI.sendKeys(findTestObject('Object Login/input_Captcha_Your_Answer_Login'), yourAnswer.toString())
	}
	/**
	 * Function automation login
	 */
	@Keyword
	def automationLogin() {
		WebUI.openBrowser(GlobalVariable.base_url)
		WebUI.setText(findTestObject('Object Login/input_Username_Login'), GlobalVariable.usernameMoLeaWiz)
		WebUI.setText(findTestObject('Object Login/input_Password_Login'), GlobalVariable.passwordMoLeaWiz)
		WebUI.comment('function captcha your answer')
		def captcha1 = WebUI.getText(findTestObject('Object Login/captcha_Num1_Login'))
		def intCaptcha1 = captcha1.toInteger()

		def captcha2 = WebUI.getText(findTestObject('Object Login/captcha_Num2_Login'))
		def intCaptcha2 = captcha2.toInteger()
		def yourAnswer = intCaptcha1 + intCaptcha2

		WebUI.sendKeys(findTestObject('Object Login/input_Captcha_Your_Answer_Login'), yourAnswer.toString())

		WebUI.click(findTestObject('Object Login/checkbox_Remember_Me_Login'))
		WebUI.click(findTestObject('Object Login/btn_login'))
		WebUI.delay(3)
		WebUI.click(findTestObject('Object Login/dropdown_User_Profile'))
		WebUI.click(findTestObject('Object Home/btn_logout_User_Profile'))
		WebUI.verifyElementPresent(findTestObject('Object Login/input_Username_Login'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Login/input_Password_Login'), 0)
		WebUI.verifyElementPresent(findTestObject('Object Login/btn_login'), 0)
	}
	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def automationLogin(TestObject to) {
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
}