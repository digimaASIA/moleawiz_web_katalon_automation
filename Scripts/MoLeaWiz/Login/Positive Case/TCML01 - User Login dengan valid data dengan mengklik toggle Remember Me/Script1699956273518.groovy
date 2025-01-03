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

WebUI.openBrowser(GlobalVariable.base_url_staging)

WebUI.setText(findTestObject('Object Login/input_Username_Login'), GlobalVariable.usernameGeneral)

WebUI.setText(findTestObject('Object Login/input_Password_Login'), GlobalVariable.passwordGeneral)

WebUI.comment('function captcha your answer')

CustomKeywords.'keyword_FunctionLogin.CapchaLogin.automationCaptcha'()

WebUI.click(findTestObject('Object Login/checkbox_Remember_Me_Login'))

WebUI.click(findTestObject('Object Login/btn_login'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Login/verify_Successfully_Login - Dropdown user profile'), 0)

WebUI.verifyElementPresent(findTestObject('Object Login/verify_Successfully_Login - Logo moleawiz web'), 0)

WebUI.click(findTestObject('Object Login/dropdown_User_Profile'))

WebUI.click(findTestObject('Object User Profile/btn_Logout_User_Profile'))

WebUI.click(findTestObject('Object Home/btn_Yes_Logout_Home'))

WebUI.verifyElementPresent(findTestObject('Object Login/verify_Successfully_Login - Remember Me Username'), 0)

WebUI.delay(2)

WebUI.closeBrowser()

