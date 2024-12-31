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

CustomKeywords.'keyword_FunctionLogin.AutomationLogin.loginWithUserDummy2'()

WebUI.click(findTestObject('Object Reviews/btn_Reviews_Menu'))

WebUI.verifyElementVisible(findTestObject('Object Reviews/verify_Successfully_Open_Reviews - Text title Review'))

WebUI.verifyElementVisible(findTestObject('Object Reviews/verify_Successfully_Open_Reviews - Radio Button All'))

WebUI.verifyElementVisible(findTestObject('Object Reviews/verify_Successfully_Open_Reviews - Radio Button Need Review'))

WebUI.verifyElementVisible(findTestObject('Object Reviews/verify_Successfully_Open_Reviews - Radio Button Approved'))

WebUI.verifyElementVisible(findTestObject('Object Reviews/verify_Successfully_Open_Reviews - Radio Button Declined'))

WebUI.click(findTestObject('Object Reviews/radio_button_Filter_All_Reviews'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Reviews/radio_button_Filter_Approve_Reviews'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Reviews/radio_button_Filter_Declined_Reviews'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Reviews/radio_button_Filter_Need_Review-Reviews'))

WebUI.delay(1)

WebUI.closeBrowser()

