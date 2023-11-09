import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser(GlobalVariable.base_url)

WebUI.setText(findTestObject('Object Login/input_Username_Login'), GlobalVariable.usernameMoLeaWiz)

WebUI.setText(findTestObject('Object Login/input_Password_Login'), GlobalVariable.passwordMoLeaWiz)

WebUI.comment('function captcha your answer')

CustomKeywords.'keywordFunctionLogin.FunctionLogin.automationCaptcha'()

WebUI.click(findTestObject('Object Login/btn_login'))

WebUI.verifyElementVisible(findTestObject('Object Login/verify_Successfully_Login'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Login/dropdown_User_Profile'))

WebUI.click(findTestObject('Object Home/btn_logout_User_Profile'))

WebUI.verifyElementPresent(findTestObject('Object Login/input_Username_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Object Login/input_Password_Login'), 0)

WebUI.verifyElementPresent(findTestObject('Object Login/btn_login'), 0)

WebUI.delay(3)

WebUI.closeBrowser()

