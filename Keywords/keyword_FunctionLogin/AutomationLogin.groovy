package keyword_FunctionLogin

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class AutomationLogin {
	@Keyword
	def loginWithGlobalVariables() {
		// Buka URL login
		//		WebUI.openBrowser(GlobalVariable.base_url_staging)

		// Isi username
		WebUI.setText(findTestObject('Object Repository/Object Login/input_Username_Login'), GlobalVariable.usernameDummy2)

		// Isi password
		WebUI.setText(findTestObject('Object Repository/Object Login/input_Password_Login'), GlobalVariable.passwordDummy2)

		// Captcha
		def captcha1 = WebUI.getText(findTestObject('Object Login/captcha_Num1_Login'))
		def intCaptcha1 = captcha1.toInteger()

		def captcha2 = WebUI.getText(findTestObject('Object Login/captcha_Num2_Login'))
		def intCaptcha2 = captcha2.toInteger()
		def yourAnswer = intCaptcha1 + intCaptcha2

		WebUI.sendKeys(findTestObject('Object Login/input_Captcha_Your_Answer_Login'), yourAnswer.toString())

		// Klik tombol login
		WebUI.click(findTestObject('Object Repository/Object Login/btn_Login'))
	}
}
