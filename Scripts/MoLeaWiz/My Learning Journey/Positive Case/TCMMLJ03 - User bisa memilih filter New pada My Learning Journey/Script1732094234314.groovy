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

CustomKeywords.'keyword_FunctionLogin.AutomationLogin.loginWithGlobalVariables'()

WebUI.click(findTestObject('Object My Learning Journey/btn_My_Learning_Journey_Menu'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Title My Learning Journey'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Text Filter'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button All'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button Ongoing'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button New'))

WebUI.verifyElementVisible(findTestObject('Object My Learning Journey/verify_Successfully_Open_My_Learning_Journey - Radio button Completed'))

WebUI.click(findTestObject('Object My Learning Journey/btn_Filter_New_My_Learning_Journey'))

WebUI.delay(2)

WebUI.closeBrowser()

